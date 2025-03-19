package com.example.dogs

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

import com.example.dogs.databinding.SearchBreedPageBinding

class SearchActivity : AppCompatActivity() {
    private lateinit var binding: SearchBreedPageBinding
    private lateinit var breedList: RecyclerView
    private lateinit var breedImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SearchBreedPageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        breedList = findViewById(R.id.recyclerView_searchBreed)
        breedImage = findViewById(R.id.imageView_searchByBreed_dog)


    }
}