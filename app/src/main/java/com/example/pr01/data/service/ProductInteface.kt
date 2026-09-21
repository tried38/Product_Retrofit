package com.example.pr01.data.service

import com.example.pr01.data.model.ProductsResponse
import retrofit2.http.GET

interface ProductInteface {
    @GET("products")
    suspend fun getAllProducts(): ProductsResponse
}