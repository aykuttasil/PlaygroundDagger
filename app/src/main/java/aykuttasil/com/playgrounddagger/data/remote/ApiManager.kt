package aykuttasil.com.playgrounddagger.data.remote

import aykuttasil.com.playgrounddagger.model.User
import retrofit2.Call

/**
 * Created by aykutasil on 28.11.2017.
 */
class ApiManager(private val apiService: ApiService) {

    fun getUser(username: String): Call<User> {
        return apiService.getUser(username)
    }


}