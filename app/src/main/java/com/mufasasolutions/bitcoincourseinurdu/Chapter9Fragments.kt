package com.mufasasolutions.bitcoincourseinurdu

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mufasasolutions.bitcoincourseinurdu.databinding.FragmentsChapter9Binding

class Chapter9Fragments : AppCompatActivity() {
    private lateinit var binding: FragmentsChapter9Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentsChapter9Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.icon1.setOnClickListener {
            val intent = Intent(this, Chapter9Activity::class.java)
            intent.putExtra("number", 1)
            startActivity(intent)
        }
    }
}