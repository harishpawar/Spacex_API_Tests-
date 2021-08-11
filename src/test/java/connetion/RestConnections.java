package connetion;


import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.*;
import io.restassured.response.Response;
import io.restassured.specification.*;
import java.util.HashMap;
import java.util.Map;

public class RestConnections {

    public static final int HTTP_STATUS_OK = 200;
    protected String rootURL;
    protected Map<String, String> customHeader = new HashMap();

    public void setRootURL(String rootURL) {
        this.rootURL = rootURL;
    }

    public Response getRequest(String path){
        return  this.createRequest().get(path);
    }

    public Response getRequest(String path, Map<String, String> queryParams){
        return this.createRequest().params(queryParams).get(path);
    }

    public <T> Response postRequest(String path, T request){
        return  this.createRequest().body(request).post(path);
    }

    public <T> Response postRequest(String path, T request, Header header){
        return  this.createRequest().body(request).header(header).post(path);
    }

    public <T> Response putRequest(String path, T request){
        return  this.createRequest().body(request).put(path);
    }

    public <T> Response putRequest(String path, T request, Header header){
        return  this.createRequest().body(request).header(header).put(path);
    }

    public <T> Response deleteRequest(String path){
        return  this.createRequest().delete(path);
    }

    private RequestSpecification createRequest(){
        RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder();
        requestSpecBuilder.setBaseUri(rootURL);
        requestSpecBuilder.setContentType(ContentType.JSON);
        RequestSpecification request = RestAssured.given().spec(requestSpecBuilder.build());

        if (!this.customHeader.isEmpty()) {
            request = request.headers(customHeader);
        }

        return request;
    }

}
