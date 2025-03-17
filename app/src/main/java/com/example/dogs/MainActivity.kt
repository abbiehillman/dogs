package com.example.dogs

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.dogs.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var breedSearch : Button
    private lateinit var randomPuppy : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        breedSearch = findViewById(R.id.button_main_searchBreed)
        randomPuppy = findViewById(R.id.button_main_random)

        breedSearch.setOnClickListener {
            Toast.makeText(this, "Clicked 1", Toast.LENGTH_SHORT).show()
        }

        randomPuppy.setOnClickListener {
            Toast.makeText(this, "Clicked 2", Toast.LENGTH_SHORT).show()
        }

    }
//    private fun fetchRandomImage():{
//
//    }

}