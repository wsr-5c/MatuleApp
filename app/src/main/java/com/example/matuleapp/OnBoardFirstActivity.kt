package com.example.matuleapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.matuleapp.databinding.ActivityOnBoardSecondBinding
import com.example.matuleapp.databinding.ActivityOnboardfirstBinding

class OnBoardFirstActivity : AppCompatActivity() {
    lateinit var binding: ActivityOnboardfirstBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnboardfirstBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.startBtn.setOnClickListener {
            val intent = Intent(this,OnBoardActivitySecond::class.java)
            startActivity(intent)
        }
    }
}