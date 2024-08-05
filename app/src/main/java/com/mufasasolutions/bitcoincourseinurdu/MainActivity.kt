package com.mufasasolutions.bitcoincourseinurdu

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.os.LocaleListCompat
import com.google.android.gms.ads.MobileAds
import com.mufasasolutions.bitcoincourseinurdu.databinding.ActivityMainBinding
//import com.google.android.gms.ads.AdRequest


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        MobileAds.initialize(this)

    //        val adView = binding.adView0
    //        val adRequest = AdRequest.Builder().build()
    //        adView.loadAd(adRequest)
    //
    //        val adView1 = binding.adView1
    //        val adRequest1 = AdRequest.Builder().build()
    //        adView1.loadAd(adRequest1)

        val switch = binding.switch1

        switch.setOnClickListener {

            if(switch.isChecked) {
                val appLocale = LocaleListCompat.forLanguageTags("ur-PK")
                AppCompatDelegate.setApplicationLocales(appLocale)
            }
            else {
                val appLocale = LocaleListCompat.forLanguageTags("en-US")
                AppCompatDelegate.setApplicationLocales(appLocale)
            }
        }


        binding.chap1.setOnClickListener {
            val intent = Intent(this, Chapter1Fragments::class.java)
            startActivity(intent)
        }
        binding.chap2.setOnClickListener {
            val intent = Intent(this, Chapter2Fragments::class.java)
            startActivity(intent)
        }
        binding.chap3.setOnClickListener {
            val intent = Intent(this, Chapter3Fragments::class.java)
            startActivity(intent)
        }
        binding.chap4.setOnClickListener {
            val intent = Intent(this, Chapter4Fragments::class.java)
            startActivity(intent)
        }
        binding.chap5.setOnClickListener {
            val intent = Intent(this, Chapter5Fragments::class.java)
            startActivity(intent)
        }
        binding.chap6.setOnClickListener {
            val intent = Intent(this, Chapter6Fragments::class.java)
            startActivity(intent)
        }
//        binding.chap7.setOnClickListener {
//            val intent = Intent(this, Chapter7Fragments::class.java)
//            startActivity(intent)
//        }
//
//        binding.chap8.setOnClickListener {
//            val intent = Intent(this, Chapter8Fragments::class.java)
//            startActivity(intent)
//        }
//
//        binding.chap9.setOnClickListener {
//            val intent = Intent(this, Chapter9Fragments::class.java)
//            startActivity(intent)
//        }

    }
}