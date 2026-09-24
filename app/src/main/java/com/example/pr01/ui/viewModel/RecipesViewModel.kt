package com.example.pr01.ui.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pr01.data.model.Recipe
import com.example.pr01.data.RetrofitClient
import kotlinx.coroutines.launch

class RecipesViewModel: ViewModel() {
    fun createRecipe(recipe: Recipe){
        viewModelScope.launch {
            try {
                val addedRecipe = RetrofitClient.recipeApi.addRecipe(recipe)
                Log.d("RecipesViewModel",
                    "Название -> ${addedRecipe.name}\n " +
                            "Ингредиенты -> ${addedRecipe.ingredients}\n " +
                            "Время приготовления -> ${addedRecipe.cookTimeMinutes}\n " +
                            "Сложность -> ${addedRecipe.difficulty} ")
            } catch (ex: Exception){
                Log.e("RecipesViewModel", ex.message.toString())
            }
        }
    }
}