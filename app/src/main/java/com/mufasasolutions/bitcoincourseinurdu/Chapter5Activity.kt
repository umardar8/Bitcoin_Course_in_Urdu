package com.mufasasolutions.bitcoincourseinurdu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mufasasolutions.bitcoincourseinurdu.databinding.ActivityChapter2Binding
import com.mufasasolutions.bitcoincourseinurdu.databinding.ActivityChapter5Binding

class Chapter5Activity : AppCompatActivity() {
    private lateinit var binding: ActivityChapter5Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChapter5Binding.inflate(layoutInflater)
        setContentView(binding.root)

//        MobileAds.initialize(this) {}

        val intent1 = Intent(this, Chapter5Fragments::class.java)
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
            1 -> fragmentTransaction.replace(R.id.frameLayout, Lesson14Fragment())
            2 -> fragmentTransaction.replace(R.id.frameLayout, Lesson15Fragment())
            3 -> fragmentTransaction.replace(R.id.frameLayout, Lesson17Fragment())
            4 -> fragmentTransaction.replace(R.id.frameLayout, Lesson18aFragment())
        }
        fragmentTransaction.commit()
    }
}