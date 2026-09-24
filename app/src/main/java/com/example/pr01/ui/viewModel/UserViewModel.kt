package com.example.pr01.ui.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pr01.data.RetrofitClient
import com.example.pr01.data.model.User
import kotlinx.coroutines.launch

class UserViewModel: ViewModel() {
    fun fetchUser(userID: Int){
        viewModelScope.launch {
            try {
                val getUser = RetrofitClient.userApi.getOneUser(userID)
                val hairInf = getUser.hair
                Log.d("UserViewModel: updateUser",
                    "Идентификатор -> ${getUser.id}\n" +
                            "Имя -> ${getUser.firstName}\n" +
                            "Фамилия -> ${getUser.lastName}\n" +
                            "Возраст -> ${getUser.age}\n" +
                            "Цвет волос ${hairInf.color}\n" +
                            "Тип волос -> ${hairInf.type}\n")
            } catch (ex: Exception){
                Log.e("UserViewModel: fetchUser", ex.message.toString())
            }
        }
    }


    fun updateUser(userID: Int, user: User){
        viewModelScope.launch {
            try {
                val response = RetrofitClient.userApi.updateUser(userID,user)
                val hairInfo = response.hair
                Log.d("UserViewModel: updateUser",
                    "Идентификатор -> ${response.id}\n" +
                            "Имя -> ${response.firstName}\n" +
                            "Фамилия -> ${response.lastName}\n" +
                            "Возраст -> ${response.age}\n" +
                            "Цвет волос ${hairInfo.color}\n" +
                            "Тип волос -> ${hairInfo.type}\n")
            } catch (ex: Exception){
                Log.e("UserViewModel: updateUser", ex.message.toString())
            }


        }
    }

}



