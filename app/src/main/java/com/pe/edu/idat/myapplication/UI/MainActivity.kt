package com.pe.edu.idat.myapplication.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.pe.edu.idat.myapplication.R
import com.pe.edu.idat.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragmentView = supportFragmentManager.findFragmentById(R.id.fcv_navigation) as NavHostFragment
        val navcontroller = fragmentView.navController
        binding.bnvStore.setupWithNavController(navcontroller)

        //binding.bnvStore.setOnItemSelectedListener { item ->
        //    when (item.itemId){
        //        R.id.homeFragment -> {
        //           binding.txtTexto.text = "Lista de elementos"
        //            true
        //        }
        //        R.id.favoriteFragment ->{
        //            binding.txtTexto.text = "Favorito"
        //           true
        //        }
        //        R.id.account -> {
        //            binding.txtTexto.text= "Info"
        //            true
        //        }
        //        else -> {
        //            false
        //        }
        //    }
        //}
    }
}