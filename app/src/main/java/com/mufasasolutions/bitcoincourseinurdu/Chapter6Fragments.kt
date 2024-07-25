package com.mufasasolutions.bitcoincourseinurdu

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mufasasolutions.bitcoincourseinurdu.databinding.FragmentsChapter6Binding

class Chapter6Fragments : AppCompatActivity() {
    private lateinit var binding: FragmentsChapter6Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentsChapter6Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.icon1.setOnClickListener {
            val intent = Intent(this, Chapter6Activity::class.java)
            intent.putExtra("number", 1)
            startActivity(intent)
        }
        binding.icon2.setOnClickListener {
            val intent = Intent(this, Chapter6Activity::class.java)
            intent.putExtra("number", 2)
            startActivity(intent)
        }
        binding.icon3.setOnClickListener {
            val intent = Intent(this, Chapter6Activity::class.java)
            intent.putExtra("number", 3)
            startActivity(intent)
        }
        binding.icon4.setOnClickListener {
            val intent = Intent(this, Chapter6Activity::class.java)
            intent.putExtra("number", 4)
            startActivity(intent)
        }
        binding.icon5.setOnClickListener {
            val intent = Intent(this, Chapter6Activity::class.java)
            intent.putExtra("number", 5)
            startActivity(intent)
        }
        binding.icon6.setOnClickListener {
            val intent = Intent(this, Chapter6Activity::class.java)
            intent.putExtra("number", 6)
            startActivity(intent)
        }
    }
}