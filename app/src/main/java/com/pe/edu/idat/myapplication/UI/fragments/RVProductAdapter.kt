package com.pe.edu.idat.myapplication.UI.fragments

import android.graphics.Paint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load

import com.pe.edu.idat.myapplication.R
import com.pe.edu.idat.myapplication.databinding.ItemProductBinding
import com.pe.edu.idat.myapplication.model.Product

class RVProductAdapter(var products: List<Product>): RecyclerView.Adapter<ProductVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductVH {
        val binding = ItemProductBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ProductVH(binding)
    }

    override fun getItemCount(): Int = products.size


    override fun onBindViewHolder(holder: ProductVH, position: Int) {
        holder.bind(products[position])
    }
}

class ProductVH(private val binding: ItemProductBinding): RecyclerView.ViewHolder(binding.root){
    fun bind(product: Product) {
        binding.txtProductName.text = product.name
        binding.txtProductPriceSale.text ="$ ${product.priceSale}"
        binding.txtProductPrice.text="$ ${product.price}"
        binding.txtProductPrice.paintFlags = Paint.STRIKE_THRU_TEXT_FLAG
        if (product.imgUrl.isNotEmpty()){
            binding.imgProduct.load(product.imgUrl)
        }else{
            binding.imgProduct.setImageResource(R.drawable.michistore)
        }
        if (product.isFavorite){
            binding.imgProduct.setImageResource(R.drawable.ic_favorite_fill)
        }else{
            binding.imgProduct.setImageResource(R.drawable.ic_favorite)
        }
    }

}