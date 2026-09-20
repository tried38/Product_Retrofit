package com.example.pr01.dtcls

data class Recipe(
    val id: Int? = null,
    val name: String,
    val ingredients: List<String>,
    val cookTimeMinutes: Int,
    val difficulty: String
)
