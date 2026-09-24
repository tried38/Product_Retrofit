package com.example.pr01.data.service

import com.example.pr01.data.model.User
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.PUT
import retrofit2.http.Path

interface UserInterface {
    @GET("users/{id}")
    suspend fun getOneUser(@Path("id") userId: Int): User

    @PUT("users/{id}")
    suspend fun updateUser(@Path("id") userId: Int, @Body user: User): User
}