package testSuite;

import connetion.SpacexClient;
import entities.Launches;
import entities.Ship;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class latestLaunchesTest {

    private SpacexClient spacexClient = null;

    @BeforeClass
    public void testSetup(){
        spacexClient = new SpacexClient();
    }

    @Test(groups = {"testTag"}, description = "Verify get latest launch api response headers, status code etc ")
    public void validateGetLatestLaunchAPI() {
        Response apiResponse = spacexClient.getLatestLaunches();
        apiResponse.then()
                .assertThat().statusCode(200)
                .assertThat().contentType(ContentType.JSON)
                .assertThat().header("access-control-expose-headers", "spacex-api-cache,spacex-api-response-time");

    }

    @Test(groups = {"testTag"}, description = "Verify latest SpaceX launch details can be fetched with all details.")
    public void validateLatestLaunch() {
        Launches launches = spacexClient.getLatestLaunches(Launches.class);
        Assert.assertEquals(launches.getId(), "600f9b6d8f798e2a4d5f979f");
        Assert.assertTrue(launches.isSuccess());
        Assert.assertEquals(launches.getName(), "Transporter-2");
        Assert.assertEquals(launches.getFlight_number(), 132);
        Assert.assertEquals(launches.getLaunch_library_id(), "5d248abe-17ef-43ce-9c04-aef33af40520");
        Assert.assertEquals(launches.getCores().get(0).getCore(), "5ef670f10059c33cee4a826c");

    }


    @Test(groups = {"testTag"}, description = "Verify latest SpaceX launch's ship details are as expected.")
    public void validateLatestLaunchShipDetails() {
        Launches launches = spacexClient.getLatestLaunches(Launches.class);
        String latestLaunchedShip = launches.getShips().get(0);
        Ship ship = spacexClient.getShipById(latestLaunchedShip, Ship.class);

        Assert.assertEquals(ship.getId(), "60c8c7a45d4819007ea69871");
        Assert.assertEquals(ship.getName(), "HOS Briarwood");
        Assert.assertTrue(ship.isActive());
        Assert.assertEquals(ship.getType(), "Cargo");

    }


}
