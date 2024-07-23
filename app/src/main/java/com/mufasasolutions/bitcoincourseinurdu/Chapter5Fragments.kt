package com.mufasasolutions.bitcoincourseinurdu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mufasasolutions.bitcoincourseinurdu.databinding.FragmentsChapter5Binding

class Chapter5Fragments : AppCompatActivity() {
    private lateinit var binding: FragmentsChapter5Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentsChapter5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.icon1.setOnClickListener {
            val intent = Intent(this, Chapter5Activity::class.java)
            intent.putExtra("number", 1)
            startActivity(intent)
        }

        binding.icon2.setOnClickListener {
            val intent = Intent(this, Chapter5Activity::class.java)
            intent.putExtra("number", 2)
            startActivity(intent)
        }

        binding.icon3.setOnClickListener {
            val intent = Intent(this, Chapter5Activity::class.java)
            intent.putExtra("number", 3)
            startActivity(intent)
        }

        binding.icon4.setOnClickListener {
            val intent = Intent(this, Chapter5Activity::class.java)
            intent.putExtra("number", 4)
            startActivity(intent)
        }

    }
}