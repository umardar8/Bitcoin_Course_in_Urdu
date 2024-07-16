package com.mufasasolutions.bitcoincourseinurdu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mufasasolutions.bitcoincourseinurdu.databinding.FragmentsChapter1Binding

class Chapter1Fragments : AppCompatActivity() {
    private lateinit var binding: FragmentsChapter1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentsChapter1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val icon1 = binding.icon1
        val icon2 = binding.icon2
        val icon3 = binding.icon3

        icon1.setOnClickListener {
            val intent = Intent(this, Chapter1Activity::class.java)
            intent.putExtra("number", 1)
            startActivity(intent)
        }

        icon2.setOnClickListener {
            val intent = Intent(this, Chapter1Activity::class.java)
            intent.putExtra("number", 2)
            startActivity(intent)
        }

        icon3.setOnClickListener {
            val intent = Intent(this, Chapter1Activity::class.java)
            intent.putExtra("number", 3)
            startActivity(intent)
        }
    }
}