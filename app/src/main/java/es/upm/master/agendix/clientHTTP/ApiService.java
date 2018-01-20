package es.upm.master.agendix.clientHTTP;

import es.upm.master.agendix.modelo.Contacto;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Walter on 20/01/2018.
 */

public interface ApiService {

    @POST("api/Contact")
    Call<String> getStringScalar(@Body Contacto body);
}
