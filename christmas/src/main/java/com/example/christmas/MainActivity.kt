package com.example.christmas

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.base.Greeting
//import kotlinx.android.synthetic.main.activity_main.*
import com.example.christmas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
/*        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
*/
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.tvGreeting.text = Greeting.christmasGreeting

    }
}
