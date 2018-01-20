package es.upm.master.agendix.clientHTTP;

/**
 * Created by Walter on 20/01/2018.
 */

public class ApiUtils {

    private ApiUtils() {}

    public static final String BASE_URL = "http://testrest20171207045636.azurewebsites.net/";

    public static ApiService getAPIService() {

        return RetrofitClient.getClient(BASE_URL).create(ApiService.class);
    }
}
