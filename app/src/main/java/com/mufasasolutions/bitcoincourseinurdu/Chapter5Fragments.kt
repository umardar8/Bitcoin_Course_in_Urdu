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

        val icon14 = binding.icon1
        val icon15 = binding.icon2
        val icon16 = binding.icon3
        val icon17 = binding.icon4

        icon14.setOnClickListener {
            val intent = Intent(this, Chapter5Activity::class.java)
            intent.putExtra("number", 1)
            startActivity(intent)
        }
        icon15.setOnClickListener {
            val intent = Intent(this, Chapter5Activity::class.java)
            intent.putExtra("number", 2)
            startActivity(intent)
        }
        icon16.setOnClickListener {
            val intent = Intent(this, Chapter5Activity::class.java)
            intent.putExtra("number", 3)
            startActivity(intent)
        }
        icon17.setOnClickListener {
            val intent = Intent(this, Chapter5Activity::class.java)
            intent.putExtra("number", 4)
            startActivity(intent)
        }
    }
}