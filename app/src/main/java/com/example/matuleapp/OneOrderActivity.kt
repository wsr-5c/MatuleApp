package com.example.matuleapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.matuleapp.databinding.ActivityOneOrderBinding
import com.example.matuleapp.databinding.ActivityOrdersBinding

class OneOrderActivity : AppCompatActivity() {
    lateinit var binding: ActivityOneOrderBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  ActivityOneOrderBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    }
