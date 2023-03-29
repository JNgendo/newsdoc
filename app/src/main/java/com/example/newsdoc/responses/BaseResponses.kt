package com.example.newsdoc.responses

import com.google.gson.annotations.SerializedName

data class BaseResponse(
    @SerializedName("articles")
    var articles: List<Article>,
    @SerializedName("status")
    var stasus: String, // ok
    @SerializedName ("totalresults")
    var totalresults: Int //4855

)
