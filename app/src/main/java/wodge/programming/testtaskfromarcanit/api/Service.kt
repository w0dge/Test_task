package wodge.programming.testtaskfromarcanit.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Service {


    private var mInstance: Service? = null
        get() {
           if(mInstance == null) {
               mInstance = Service()
           }
            return mInstance
        }

    private val BASE_URL = "https://jsonplaceholder.typicode.com/"

    private var mRetrofit = Retrofit.Builder().
                baseUrl(BASE_URL).
                addConverterFactory(GsonConverterFactory.create()).
                build()

    fun getApi(): Api {
        return mRetrofit.create(Api::class.java)
    }



}