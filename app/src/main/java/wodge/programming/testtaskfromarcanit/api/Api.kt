package wodge.programming.testtaskfromarcanit.api

import retrofit2.http.GET
import wodge.programming.testtaskfromarcanit.model.Posts
import wodge.programming.testtaskfromarcanit.model.Users

interface Api {

    @GET("users")
    fun getUsers(): List<Users>

    @GET("posts")
    fun getPosts(): List<Posts>
}