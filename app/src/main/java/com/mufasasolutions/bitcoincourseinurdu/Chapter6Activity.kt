package com.mufasasolutions.bitcoincourseinurdu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mufasasolutions.bitcoincourseinurdu.databinding.ActivityChapter6Binding

class Chapter6Activity : AppCompatActivity() {
    private lateinit var binding: ActivityChapter6Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChapter6Binding.inflate(layoutInflater)
        setContentView(binding.root)

//        MobileAds.initialize(this) {}

        val intent1 = Intent(this, Chapter6Fragments::class.java)
        val intent2 = intent
        var number = intent2.getIntExtra("number", 1);
        changeFragment(number)

        binding.bottomNavigationView.setOnItemSelectedListener { item ->
            if (item.itemId == R.id.back_button) {
                if (number > 0) {
                    number -= 1
                }
            } else if (item.itemId == R.id.next_button) {
                if (number < 6) {
                    number += 1
                }
            } else {
                number = 0
            }
            if (number == 0) {
                startActivity(intent1)
            } else {
                changeFragment(number)
            }
            true
        }

    }

    private fun changeFragment(num: Int) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        when (num) {
            1 -> fragmentTransaction.replace(R.id.frameLayout, Lesson6aFragment())
            2 -> fragmentTransaction.replace(R.id.frameLayout, Lesson6bFragment())
            3 -> fragmentTransaction.replace(R.id.frameLayout, Lesson6cFragment())
            4 -> fragmentTransaction.replace(R.id.frameLayout, Lesson6dFragment())
            5 -> fragmentTransaction.replace(R.id.frameLayout, Lesson6eFragment())
            6 -> fragmentTransaction.replace(R.id.frameLayout, Lesson6fFragment())
        }
        fragmentTransaction.commit()
    }
}