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

        val icon1 = binding.icon1

        icon1.setOnClickListener {
            val intent = Intent(this, Chapter6Activity::class.java)
            intent.putExtra("number", 1)
            startActivity(intent)
        }
    }
}