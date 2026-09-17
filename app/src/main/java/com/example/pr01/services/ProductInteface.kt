package com.example.pr01.services

import com.example.pr01.data.ProductsResponse
import retrofit2.http.GET

interface ProductInteface {
    @GET("products")
    suspend fun getAllProducts(): ProductsResponse
}