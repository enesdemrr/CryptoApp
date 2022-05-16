package com.example.cryptoapp.model.detail


import com.google.gson.annotations.SerializedName

data class CoinDetail(
    @SerializedName("category")
    val category: String?,
    @SerializedName("date_added")
    val dateAdded: String?,
    @SerializedName("date_launched")
    val dateLaunched: String?,
    @SerializedName("description")
    val description: String?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("logo")
    val logo: String?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("platform")
    val platform: Any?,
    @SerializedName("slug")
    val slug: String?,
    @SerializedName("symbol")
    val symbol: String?,
    @SerializedName("tags")
    val tags: List<String>?,
    @SerializedName("urls")
    val urls: Urls?
)