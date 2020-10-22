package wodge.programming.testtaskfromarcanit.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import wodge.programming.testtaskfromarcanit.api.Service
import wodge.programming.testtaskfromarcanit.model.Posts
import wodge.programming.testtaskfromarcanit.model.Users

class ListViewModel : ViewModel() {

    lateinit var service: Service

    val users = MutableLiveData<List<Users>>()
    val posts = MutableLiveData<List<Posts>>()
    val dataLoadError = MutableLiveData<Boolean>()
    val loading = MutableLiveData<Boolean>()


    fun refresh() {
        fetchData()
    }

    private fun fetchData() {
        loading.value = true
        var value = service.getApi().getUsers()

        if(value.isNotEmpty()) {
            users.value = value
            dataLoadError.value = false
        } else {
            dataLoadError.value = true
            loading.value = false
        }

        val value_posts = service.getApi().getPosts()
        if(value_posts.isNotEmpty()) {
            posts.value = value_posts
            loading.value = false
        } else {
            dataLoadError.value = true
            loading.value = false
        }


    }

}