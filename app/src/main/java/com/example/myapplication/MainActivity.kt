package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textView1.text = "View Binding"
        binding.textView2.text = "is cool"
        binding.buttonOpenFragment.setOnClickListener {
            openFragment()
        }
    }
    private fun openFragment() {
        supportFragmentManager.beginTransaction()
            .add(R.id.fragment_container, ExampleFragment())
            .addToBackStack(null)
            .commit()
    }
}