package com.example.pr01.services

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class ProductViewModel: ViewModel() {
    fun fetchProducts(){
        viewModelScope.launch {
            try {
                val productsResponse = RetrofitClient.productsApi.getAllProducts()
                val products = productsResponse.products
                for (product in products){
                    Log.d("ProductViewModel", "Название - ${product.title}  " + "Описание - ${product.description}  "+ "Цена - ${product.price}")
                }
            }
            catch (e: Exception){
                Log.e("ProductViewModel", "${e.message}")
            }
        }
    }

}