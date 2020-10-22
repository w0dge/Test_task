package wodge.programming.testtaskfromarcanit.model

import retrofit2.http.GET

interface Api {

    @GET("users")
    fun getUsers(): List<Users>

    @GET("posts")
    fun getPosts(): List<Posts>
}