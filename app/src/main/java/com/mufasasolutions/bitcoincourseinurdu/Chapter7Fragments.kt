package com.mufasasolutions.bitcoincourseinurdu

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mufasasolutions.bitcoincourseinurdu.databinding.FragmentsChapter7Binding

class Chapter7Fragments : AppCompatActivity() {
    private lateinit var binding: FragmentsChapter7Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentsChapter7Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val icon1 = binding.icon1

        icon1.setOnClickListener {
            val intent = Intent(this, Chapter7Activity::class.java)
            intent.putExtra("number", 1)
            startActivity(intent)
        }
    }
}