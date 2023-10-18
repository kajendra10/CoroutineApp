package com.kjprojects.coroutine
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.kjprojects.coroutine.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //INITIALIZATION
    private lateinit var binding: ActivityMainBinding
    private var counter: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Counting function
        findViewById<Button>(R.id.stButton1)
        binding.stButton1.setOnClickListener {
            binding.countNumber.text = counter++.toString()
        }

        //Background process button
        findViewById<Button>(R.id.countButton2)
        binding.countButton2.setOnClickListener {
            for (i in 1..1000000){
                Log.i("TAG", "Downloading $i in ${Thread.currentThread().name}")
            }
        }
    }
}