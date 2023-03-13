package com.example.retrofit1.retrofit

data class Product(
    val id: Int,
    val title: String,
    val description: String,
    val price: Int,
    val discountPercentage: Float,
    val rating: Int,
    val stock: Float,
    val brand: String,
    val category: String,
    val thumbnail: String,
    val Images: List<String>
)
