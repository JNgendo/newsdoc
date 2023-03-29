package com.example.newsdoc.responses

import com.google.gson.annotations.SerializedName

data class Article(
    @SerializedName("author")
    var author : String, // Marianne Dodson
    @SerializedName("content")
    var content : String, // DC has a new clown prince of crime.Warner Bros. on Wednesday debuted the first trailer for Joker, its new film telling the iconic Batman villain's origin story. The trailer shows off Joaquin Phoenix's take on the character, including his suitably disturbing… [+1319 chars]


){

}