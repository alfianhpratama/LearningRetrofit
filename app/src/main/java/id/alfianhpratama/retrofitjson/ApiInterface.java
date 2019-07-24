package id.alfianhpratama.retrofitjson;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    String URL = "https://api.rss2json.com/v1/";

    @GET("api.json")
    Call<String> getJSON(@Query("rss_url") String rss_url);
}
