          package com.example.matuleapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.matuleapp.databinding.ActivityForgotBinding

          class ForgotActivity : AppCompatActivity() {
    lateinit var binding: ActivityForgotBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForgotBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.sendBtn.setOnClickListener {
            val intent = Intent(this,VerificationActivity   ::class.java)
            startActivity(intent)
        }
        binding.backBtnForgot.setOnClickListener {
            val intent = Intent(this,RegisterAccountActivity   ::class.java)
            startActivity(intent)
        }
    }

}