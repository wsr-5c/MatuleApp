package com.example.matuleapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.matuleapp.databinding.ActivityMainBinding
import com.example.matuleapp.databinding.ActivityOnboardfirstBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.signInBtn.setOnClickListener {
            val intent = Intent(this,OnBoardFirstActivity::class.java)
            startActivity(intent)
        }
        binding.textRestore.setOnClickListener {
            val intent = Intent(this,ForgotActivity::class.java)
            startActivity(intent)
        }
        binding.textCreateAccount.setOnClickListener {
            val intent = Intent(this,RegisterAccountActivity::class.java)
            startActivity(intent)
        }

        }
    }
