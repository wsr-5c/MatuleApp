package com.example.matuleapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.matuleapp.databinding.ActivityEditProfileBinding
import com.example.matuleapp.databinding.ActivityProfileBinding

class EditProfileActivity : AppCompatActivity() {
    lateinit var binding: ActivityEditProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  ActivityEditProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}