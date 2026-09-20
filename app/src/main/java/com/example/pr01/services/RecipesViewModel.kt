package com.example.pr01.services

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pr01.dtcls.Recipe
import kotlinx.coroutines.launch

class RecipesViewModel: ViewModel() {
    fun createRecipe(recipe: Recipe){
        viewModelScope.launch {
            try {
                val addedRecipe = RetrofitClient.recipeApi.addRecipe(recipe)
                Log.d("createRecipe",
                    "Название -> ${addedRecipe.name}\n " +
                            "Ингредиенты -> ${addedRecipe.ingredients}\n " +
                            "Время приготовления -> ${addedRecipe.cookTimeMinutes}\n " +
                            "Сложность -> ${addedRecipe.difficulty} ")
            } catch (ex: Exception){
                Log.e("createRecipe", ex.message.toString())
            }
        }
    }
}