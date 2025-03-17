package com.example.dogs

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.dogs.databinding.RandomPuppyPageBinding

class RandomActivity : AppCompatActivity() {
    private lateinit var binding: RandomPuppyPageBinding
    private lateinit var generateNewPuppy: Button
    private lateinit var backButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = RandomPuppyPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        generateNewPuppy = findViewById(R.id.button_random_generateAgain)
        backButton = findViewById(R.id.button_back_toMainPage)
    }
}