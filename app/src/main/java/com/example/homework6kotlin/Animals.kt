package com.example.homework6kotlin

import androidx.annotation.DrawableRes

data class Animals(
    @DrawableRes val animalImage :  Int, //Картинка
    val name: String, //Имя
    val wool: String, //Шерсть
    val ears: Int //Уши
)

