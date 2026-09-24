package com.example.pr01

import android.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.pr01.data.model.Hair
import com.example.pr01.data.model.Recipe
import com.example.pr01.data.model.User
import com.example.pr01.ui.viewModel.RecipesViewModel
import com.example.pr01.ui.viewModel.UserViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            //PR01
            //region
//            val productViewModel: ProductViewModel = viewModel()
//            productViewModel.fetchProducts()
//endregion

            //PR02
            //region
//            val recipesViewModel: RecipesViewModel = viewModel()
//            val recipe = Recipe(
//                name = "Куриное филе в сливочно-чесночном соусе",
//                ingredients = listOf(
//                    "Куриное филе",
//                    "сливки",
//                    "чеснок",
//                    "сливочное масло",
//                    "растительное масло",
//                    "твердый сыр",
//                    "соль",
//                    "черный перец",
//                    "итальянские травы"
//                ),
//                cookTimeMinutes = 25,
//                difficulty = "Легкая"
//            )
//            recipesViewModel.createRecipe(recipe)
            //endregion

            //PR03
            val userViewModel: UserViewModel = viewModel()
            userViewModel.fetchUser(15)

            val user = User(
                firstName = "Ирина",
                lastName = "Воронова",
                age = 29,
                hair = Hair(
                    color = "темные",
                    type = "кудрявые"
                )
            )
            userViewModel.updateUser(15, user)
             }
        }
    }