package mypocketvakil.example.com.retrofittest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by sanyam jain on 21-03-2017.
 */

public class ApiClient {
    public static final String Base_url= "http://api.themoviedb.org/3/";
    public static Retrofit retrofit=null;

    public static Retrofit getClient(){
        if(retrofit==null)
        {
            retrofit=new Retrofit.Builder()
                    .baseUrl(Base_url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        }
        return retrofit;
    }
}
