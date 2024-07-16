package com.mufasasolutions.bitcoincourseinurdu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
//import com.google.android.gms.ads.AdRequest
import com.mufasasolutions.bitcoincourseinurdu.databinding.FragmentLesson1Binding

class Lesson1Fragment : Fragment() {

    private lateinit var binding: FragmentLesson1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentLesson1Binding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    //        val adView1 = binding.adView1
    //        val adRequest1 = AdRequest.Builder().build()
    //        adView1.loadAd(adRequest1)
    //
    //        val adView2 = binding.adView2
    //        val adRequest2 = AdRequest.Builder().build()
    //        adView2.loadAd(adRequest2)
    //
    //        val adView3 = binding.adView3
    //        val adRequest3 = AdRequest.Builder().build()
    //        adView3.loadAd(adRequest3)
    }

}