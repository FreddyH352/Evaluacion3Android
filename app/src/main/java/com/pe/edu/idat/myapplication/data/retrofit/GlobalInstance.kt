package com.pe.edu.idat.myapplication.data.retrofit


import com.pe.edu.idat.myapplication.data.response.ProductListResponse
import retrofit2.http.GET

interface GlobalInstance {
    @GET("api/json/v1/1/search.php?f=a")
    suspend fun getAllProducts(): ProductListResponse

    @GET("api/json/v1/1/search.php?i=vodka")
    suspend fun buscar(): ProductListResponse
}