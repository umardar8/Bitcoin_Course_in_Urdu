package com.mufasasolutions.bitcoincourseinurdu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mufasasolutions.bitcoincourseinurdu.databinding.FragmentsChapter4Binding

class Chapter4Fragments : AppCompatActivity() {
    private lateinit var binding: FragmentsChapter4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentsChapter4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val icon10 = binding.icon10
        val icon11 = binding.icon11
        val icon12 = binding.icon12
        val icon13 = binding.icon13

        icon10.setOnClickListener {
            val intent = Intent(this, Chapter4Activity::class.java)
            intent.putExtra("number", 1)
            startActivity(intent)
        }
        icon11.setOnClickListener {
            val intent = Intent(this, Chapter4Activity::class.java)
            intent.putExtra("number", 2)
            startActivity(intent)
        }
        icon12.setOnClickListener {
            val intent = Intent(this, Chapter4Activity::class.java)
            intent.putExtra("number", 3)
            startActivity(intent)
        }
        icon13.setOnClickListener {
            val intent = Intent(this, Chapter4Activity::class.java)
            intent.putExtra("number", 4)
            startActivity(intent)
        }

    }
}