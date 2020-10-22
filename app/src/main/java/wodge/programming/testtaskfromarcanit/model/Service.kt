package wodge.programming.testtaskfromarcanit.model

class Service {

    lateinit var api: Api

    fun getUsers(): List<Users> {
        return api.getUsers()
    }

    fun getPosts(): List<Posts> {
        return api.getPosts()
    }
}