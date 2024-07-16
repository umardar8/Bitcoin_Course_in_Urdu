package com.mufasasolutions.bitcoincourseinurdu

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mufasasolutions.bitcoincourseinurdu.databinding.FragmentsChapter8Binding

class Chapter8Fragments : AppCompatActivity() {
    private lateinit var binding: FragmentsChapter8Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentsChapter8Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val icon1 = binding.icon1

        icon1.setOnClickListener {
            val intent = Intent(this, Chapter8Activity::class.java)
            intent.putExtra("number", 1)
            startActivity(intent)
        }
    }
}