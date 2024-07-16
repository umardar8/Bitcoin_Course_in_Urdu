package com.mufasasolutions.bitcoincourseinurdu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mufasasolutions.bitcoincourseinurdu.databinding.ActivityChapter3Binding

class Chapter3Activity : AppCompatActivity() {
    private lateinit var binding: ActivityChapter3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChapter3Binding.inflate(layoutInflater)
        setContentView(binding.root)

//        MobileAds.initialize(this) {}

        val intent1 = Intent(this, Chapter3Fragments::class.java)
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
            1 -> fragmentTransaction.replace(R.id.frameLayout, Lesson5Fragment())
            2 -> fragmentTransaction.replace(R.id.frameLayout, Lesson16Fragment())
            3 -> fragmentTransaction.replace(R.id.frameLayout, Lesson6Fragment())
            4 -> fragmentTransaction.replace(R.id.frameLayout, Lesson7Fragment())
            5 -> fragmentTransaction.replace(R.id.frameLayout, Lesson8Fragment())
            6 -> fragmentTransaction.replace(R.id.frameLayout, Lesson9Fragment())
        }
        fragmentTransaction.commit()
    }
}