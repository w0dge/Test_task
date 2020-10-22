package wodge.programming.testtaskfromarcanit.model

import com.google.gson.annotations.SerializedName

data class Posts(
    @SerializedName("id")
    val userId: String?,
    @SerializedName("title")
    val postTitle: String?,
    @SerializedName("body")
    val postBody: String?
)
