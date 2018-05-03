package aykuttasil.com.playgrounddagger.data.remote

import aykuttasil.com.playgrounddagger.model.User
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by aykutasil on 27.11.2017.
 */


interface ApiService {
    @GET("users/{username}")
    fun getUser(@Path("username") username: String): Call<User>
}
