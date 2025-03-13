package com.example.matuleapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.matuleapp.databinding.ActivityNotificationBinding
import com.example.matuleapp.databinding.ActivityOrdersBinding

class OrdersActivity : AppCompatActivity() {
        lateinit var binding: ActivityOrdersBinding
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding =  ActivityOrdersBinding.inflate(layoutInflater)
            setContentView(binding.root)

            binding.orderBtnNike.setOnClickListener {
                val intent = Intent(this, OneOrderActivity::class.java)
                startActivity(intent)
            }
    }
}