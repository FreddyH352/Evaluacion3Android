package com.pe.edu.idat.myapplication.data.repository

import com.pe.edu.idat.myapplication.data.ProductResult
import com.pe.edu.idat.myapplication.data.response.ProductListResponse
import com.pe.edu.idat.myapplication.data.retrofit.RetrofitHelper
import com.pe.edu.idat.myapplication.model.Product

class ProductRepository {
    suspend fun getProducts():ProductResult<ProductListResponse>{
        return try {
            val response = RetrofitHelper.storeInstance.getAllProducts()
             ProductResult.Success(response)
        }catch (e:Exception){
             ProductResult.Error(e)
        }

    }
}