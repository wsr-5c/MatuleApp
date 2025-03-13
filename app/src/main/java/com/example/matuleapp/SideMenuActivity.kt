package com.example.matuleapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.matuleapp.databinding.ActivityCatalogBinding
import com.example.matuleapp.databinding.ActivitySideMenuBinding

class SideMenuActivity : AppCompatActivity() {
    lateinit var binding: ActivitySideMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  ActivitySideMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.profileBtn.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
        binding.bagBtnMenu.setOnClickListener {
            val intent = Intent(this,  MyCartActivity ::class.java)
            startActivity(intent)
        }
        binding.heartBtnMenu.setOnClickListener {
            val intent = Intent(this, FavoriteActivity::class.java)
            startActivity(intent)
        }
        binding.OrderBtn.setOnClickListener {
            val intent = Intent(this, OrdersActivity::class.java)
            startActivity(intent)
        }
        binding.notificationBtn.setOnClickListener {
            val intent = Intent(this, NotificationActivity::class.java)
            startActivity(intent)
        }
        binding.outBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}