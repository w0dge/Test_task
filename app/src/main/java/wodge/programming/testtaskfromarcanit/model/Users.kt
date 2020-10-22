package wodge.programming.testtaskfromarcanit.model

import com.google.gson.annotations.SerializedName

data class Users(
    @SerializedName("name")
    val userName: String?,
    @SerializedName("email")
    val userEmail: String?,
    @SerializedName("phone")
    val userPhone: String?,
    @SerializedName("website")
    val userWebsite: String?,
    @SerializedName("id")
    val userId: String?
)