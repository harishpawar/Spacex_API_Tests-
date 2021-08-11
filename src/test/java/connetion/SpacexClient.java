package connetion;

import io.restassured.response.Response;
import utils.PropertiesReader;

public class SpacexClient extends RestConnections {

    private static final String URI_LATEST_LAUNCH = "/v4/launches/latest";
    private static final String URI_GET_SHIP = "/v4/ships/";

    public SpacexClient(){
        super.rootURL = PropertiesReader.getBaseUrl();
    }

    public <T> T getLatestLaunches(Class<T> responseType){
        Response response = getLatestLaunches();

        if(response.getStatusCode() != HTTP_STATUS_OK){
            throw new RuntimeException("Launches not found." + response.asString());
        }
        return response.body().as(responseType);
    }

    public Response  getLatestLaunches(){
        return getRequest(URI_LATEST_LAUNCH);
    }



    public <T> T getShipById(String id, Class<T> responseType){
        Response response = getRequest(URI_GET_SHIP + id);

        if(response.getStatusCode() != HTTP_STATUS_OK){
            throw new RuntimeException("Ship not found." + response.asString());
        }
        return response.body().as(responseType);
    }

}
