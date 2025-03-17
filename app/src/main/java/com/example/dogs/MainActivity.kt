package com.example.dogs

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.dogs.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

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
    val dogService = RetrofitHelper.getInstance().create(DogService::class.java)
    val dogCall = dogService.getDogData()

    dogService.enqueue(object: Callback<Item>{
        override fun onResponse(
            call: Call<Item>,
            response: Response<Item>
        ) {

            adapter = EarthquakeAdapter(response.body()!!.features.filter{it.properties.mag >=1.0})
//                adapter = EarthquakeAdapter(response.body()!!.features.filter{it.properties.title.length>20})
            // adapter.dataSet = adapter.dataSet.sortedBy{it.geometry.coordinates[0]}
            //adapter.dataSet = adapter.dataSet.sortedWith(compareBy{it.properties.title}.thenByDescending{it.properties.time}.thenBy{it.geometry.coordinates[1]})
            binding.recyclerViewEarthquakeListEarthquakes.adapter = adapter
            adapter.earthquakeList = adapter.earthquakeList.sortedBy{-it.properties.mag}
            adapter.notifyDataSetChanged()

//                binding.recyclerViewEarthquakeListEarthquakes.layoutManager = LinearLayoutManager(this)

        }

        override fun onFailure(call: Call<FeatureCollection>, t: Throwable) {
            Log.d("EarthquakeList", "onFailure: ${t.message}")
        }

    })
    }
//    private fun fetchRandomImage():{
//
//    }

}