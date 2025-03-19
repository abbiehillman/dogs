package com.example.dogs

import android.app.Activity
import android.app.ProgressDialog.show
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
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



        randomPuppy.setOnClickListener {
            Toast.makeText(this, "Clicked 1", Toast.LENGTH_SHORT).show()
            val newRandomActivityIntent = Intent(
                this,
                RandomActivity::class.java
            )
            startActivity(newRandomActivityIntent)

        }

        breedSearch.setOnClickListener {
            Toast.makeText(this, "Clicked 2", Toast.LENGTH_SHORT).show()

        }

    }
//    private fun fetchRandomImage():{
//
//    }

}