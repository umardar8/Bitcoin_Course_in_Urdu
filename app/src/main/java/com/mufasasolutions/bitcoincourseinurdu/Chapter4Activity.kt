package com.mufasasolutions.bitcoincourseinurdu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mufasasolutions.bitcoincourseinurdu.databinding.ActivityChapter4Binding

class Chapter4Activity : AppCompatActivity() {
    private lateinit var binding: ActivityChapter4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChapter4Binding.inflate(layoutInflater)
        setContentView(binding.root)

//        MobileAds.initialize(this) {}

        val intent1 = Intent(this, Chapter4Fragments::class.java)
        val intent2 = intent
        var number = intent2.getIntExtra("number", 1);
        changeFragment(number)

        binding.bottomNavigationView.setOnItemSelectedListener { item ->
            if (item.itemId == R.id.back_button) {
                if (number > 0) {
                    number -= 1
                }
            } else if (item.itemId == R.id.next_button) {
                if (number < 4) {
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
            1 -> fragmentTransaction.replace(R.id.frameLayout, Lesson10Fragment())
            2 -> fragmentTransaction.replace(R.id.frameLayout, Lesson11Fragment())
            3 -> fragmentTransaction.replace(R.id.frameLayout, Lesson12Fragment())
            4 -> fragmentTransaction.replace(R.id.frameLayout, Lesson13Fragment())
        }
        fragmentTransaction.commit()
    }
}