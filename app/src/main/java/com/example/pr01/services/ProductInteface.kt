package com.example.pr01.services

import androidx.annotation.BoolRes
import com.example.pr01.dtcls.ProductsResponse
import com.example.pr01.dtcls.Recipe
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ProductInteface {
    @GET("products")
    suspend fun getAllProducts(): ProductsResponse
}