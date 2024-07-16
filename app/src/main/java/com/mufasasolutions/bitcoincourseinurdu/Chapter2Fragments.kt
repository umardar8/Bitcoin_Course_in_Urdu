package com.mufasasolutions.bitcoincourseinurdu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mufasasolutions.bitcoincourseinurdu.databinding.FragmentsChapter2Binding

class Chapter2Fragments : AppCompatActivity() {
    private lateinit var binding: FragmentsChapter2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentsChapter2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val icon2 = binding.icon2
        val icon3 = binding.icon3
        val icon4 = binding.icon4

        icon2.setOnClickListener {
            val intent = Intent(this, Chapter2Activity::class.java)
            intent.putExtra("number", 1)
            startActivity(intent)
        }
        icon3.setOnClickListener {
            val intent = Intent(this, Chapter2Activity::class.java)
            intent.putExtra("number", 2)
            startActivity(intent)
        }
        icon4.setOnClickListener {
            val intent = Intent(this, Chapter2Activity::class.java)
            intent.putExtra("number", 3)
            startActivity(intent)
        }
    }
}