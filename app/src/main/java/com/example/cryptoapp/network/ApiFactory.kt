package com.example.cryptoapp.network

import com.example.cryptoapp.model.home.CryptoResponse
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface ApiFactory {


    //https://sandbox-api.coinmarketcap.com/v1/cryptocurrency/listings/latest?CMC_PRO_API_KEY=606b27de-ad54-4f04-8435-46f2e23ae5c1

    @GET("/v1/cryptocurrency/listings/latest")
    suspend fun  getData(
        @Query("CMC_PRO_API_KEY") apiKey: String,
        @Query("limit") limit: String
    ):CryptoResponse
}