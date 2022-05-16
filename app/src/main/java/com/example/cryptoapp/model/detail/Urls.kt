package com.example.cryptoapp.model.detail


import com.google.gson.annotations.SerializedName

data class Urls(
    @SerializedName("announcement")
    val announcement: List<Any>?,
    @SerializedName("chat")
    val chat: List<Any>?,
    @SerializedName("explorer")
    val explorer: List<String>?,
    @SerializedName("message_board")
    val messageBoard: List<String>?,
    @SerializedName("reddit")
    val reddit: List<String>?,
    @SerializedName("source_code")
    val sourceCode: List<String>?,
    @SerializedName("technical_doc")
    val technicalDoc: List<String>?,
    @SerializedName("twitter")
    val twitter: List<Any>?,
    @SerializedName("website")
    val website: List<String>?
)