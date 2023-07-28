package com.pe.edu.idat.myapplication.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pe.edu.idat.myapplication.R
import com.pe.edu.idat.myapplication.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_login)

    }
}