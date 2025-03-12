package com.example.matuleapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.matuleapp.databinding.ActivityMyCartBinding
import com.example.matuleapp.databinding.ActivitySearchBinding

class MyCartActivity : AppCompatActivity() {
    lateinit var binding: ActivityMyCartBinding
    var count : Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyCartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.plusBtn.setOnClickListener{
            count++
            updateValue()
        }
        binding.minusBtn.setOnClickListener{
            count--
            updateValue()
        }



    }
    fun updateValue(){
        binding.numberText.text = count.toString()

    }
}
