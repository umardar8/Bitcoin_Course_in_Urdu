package com.mufasasolutions.bitcoincourseinurdu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mufasasolutions.bitcoincourseinurdu.databinding.FragmentsChapter3Binding

class Chapter3Fragments : AppCompatActivity() {
    private lateinit var binding: FragmentsChapter3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentsChapter3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val icon5 = binding.icon5
        val icon16 = binding.icon16
        val icon6 = binding.icon6
        val icon7 = binding.icon7
        val icon8 = binding.icon8
        val icon9 = binding.icon9

        icon5.setOnClickListener {
            val intent = Intent(this, Chapter3Activity::class.java)
            intent.putExtra("number", 1)
            startActivity(intent)
        }
        icon16.setOnClickListener {
            val intent = Intent(this, Chapter3Activity::class.java)
            intent.putExtra("number", 2)
            startActivity(intent)
        }
        icon6.setOnClickListener {
            val intent = Intent(this, Chapter3Activity::class.java)
            intent.putExtra("number", 3)
            startActivity(intent)
        }
        icon7.setOnClickListener {
            val intent = Intent(this, Chapter3Activity::class.java)
            intent.putExtra("number", 4)
            startActivity(intent)
        }
        icon8.setOnClickListener {
            val intent = Intent(this, Chapter3Activity::class.java)
            intent.putExtra("number", 5)
            startActivity(intent)
        }
        icon9.setOnClickListener {
            val intent = Intent(this, Chapter3Activity::class.java)
            intent.putExtra("number", 6)
            startActivity(intent)
        }

    }
}