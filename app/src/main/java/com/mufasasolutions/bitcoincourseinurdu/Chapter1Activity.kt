package com.mufasasolutions.bitcoincourseinurdu

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mufasasolutions.bitcoincourseinurdu.databinding.ActivityChapter1Binding
//import com.google.android.gms.ads.MobileAds


class Chapter1Activity : AppCompatActivity() {

    private lateinit var binding: ActivityChapter1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChapter1Binding.inflate(layoutInflater)
        setContentView(binding.root)

//        MobileAds.initialize(this) {}

        val intent1 = Intent(this, Chapter1Fragments::class.java)
        val intent2 = intent
        var number = intent2.getIntExtra("number", 1);
        changeFragment(number)

        binding.bottomNavigationView.setOnItemSelectedListener { item ->
            if (item.itemId == R.id.back_button) {
                if (number > 0) {
                    number -= 1
                }
            } else if (item.itemId == R.id.next_button) {
                if (number < 3) {
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
            1 -> fragmentTransaction.replace(R.id.frameLayout, Lesson1Fragment())
            2 -> fragmentTransaction.replace(R.id.frameLayout, Lesson1aFragment())
            3 -> fragmentTransaction.replace(R.id.frameLayout, Lesson1bFragment())
        }
        fragmentTransaction.commit()
    }
}