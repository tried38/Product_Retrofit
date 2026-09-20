package com.example.pr01.services

import com.example.pr01.dtcls.Recipe
import retrofit2.http.Body
import retrofit2.http.POST

interface RecipesInterface {
    @POST("recipes/add")
    suspend fun  addRecipe(@Body recipe: Recipe): Recipe
}