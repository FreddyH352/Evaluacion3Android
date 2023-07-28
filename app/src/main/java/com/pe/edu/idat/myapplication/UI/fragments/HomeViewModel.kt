package com.pe.edu.idat.myapplication.UI.fragments

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pe.edu.idat.myapplication.data.ProductResult
import com.pe.edu.idat.myapplication.data.repository.ProductRepository
import com.pe.edu.idat.myapplication.model.Product
import com.pe.edu.idat.myapplication.model.getData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HomeViewModel: ViewModel() {
    private val _products: MutableLiveData<List<Product>> = MutableLiveData<List<Product>>()
    val products:LiveData<List<Product>> = _products

    private val repository = ProductRepository()
    fun getProducts(){
       val allProducts = getData()
        _products.value = allProducts
        _products.value = allProducts
    }

    fun getProductFromService(){
        viewModelScope.launch(Dispatchers.IO) {
            val response = repository.getProducts()
            when(response){
                is ProductResult.Success ->{
                    _products.postValue(response.data.products)
                }

                is ProductResult.Error ->{

                }
            }

        }
    }
}