package com.example.pr01

import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.pr01.dtcls.Recipe
import com.example.pr01.services.RecipesViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            //PR01
//            val productViewModel: ProductViewModel = viewModel()
//            productViewModel.fetchProducts()

            //PR02
            val recipesViewModel: RecipesViewModel = viewModel()
            val recipe = Recipe(
                name = "Куриное филе в сливочно-чесночном соусе",
                ingredients = listOf(
                    "Куриное филе",
                    "сливки",
                    "чеснок",
                    "сливочное масло",
                    "растительное масло",
                    "твердый сыр",
                    "соль",
                    "черный перец",
                    "итальянские травы"
                ),
                cookTimeMinutes = 25,
                difficulty = "Легкая"

            )
            recipesViewModel.createRecipe(recipe)
             }
        }
    }