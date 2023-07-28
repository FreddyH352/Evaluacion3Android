package com.pe.edu.idat.myapplication.data

import com.pe.edu.idat.myapplication.data.response.ProductListResponse
import java.lang.Exception

sealed class ProductResult<T>(data: T? = null, error: Exception? = null){
        data class Success<T>(val data: T):ProductResult<T>(data, null)
        data class Error<T>(val error: Exception): ProductResult<T>(null, error)

}

