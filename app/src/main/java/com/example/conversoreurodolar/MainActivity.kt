package com.example.conversoreurodolar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.conversoreurodolar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(){

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonConverter.setOnClickListener{
            val euros = binding.editEuro.text.toString().toDouble()
            val dolares = String.format("%.2f",euros * 1.06)

            binding.textDolares.text = "${dolares} $"
        }
    }
}