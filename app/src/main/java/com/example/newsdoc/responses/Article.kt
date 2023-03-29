package com.example.newsdoc.responses

import com.google.gson.annotations.SerializedName

data class Article(
    @SerializedName("author")
    var author : String,
    @SerializedName("content")
    var content : String,
){

}