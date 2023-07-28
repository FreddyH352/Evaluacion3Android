package com.pe.edu.idat.myapplication.model

import com.google.gson.annotations.SerializedName
import java.net.URL

data class Product(
    @SerializedName("strCategory")
    val name:String,
    val price: Double,
    val priceSale: Double,
    val store: String,
    val isFavorite : Boolean = false,
    val brand: String,
    @SerializedName("strDrinkThumb")
    val imgUrl: String=""
)
fun getData(): List<Product> = listOf(
    Product("Polo cuello Z",59.99,32.80, "MichiCorp",true,"Michi"),
    Product("Polo cuello A",75.50,40.50, "MichiCorp",false,"Michi"),
    Product("Polo cuello B",40.20,30.00, "MichiCorp",false,"Michi"),
    Product("Polo cuello C",60.00,30.50, "MichiCorp",false,"Michi"),
    Product("Polo cuello D",55.20,20.20, "MichiCorp",false,"Michi"),
)