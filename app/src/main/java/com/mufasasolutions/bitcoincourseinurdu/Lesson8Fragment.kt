package com.mufasasolutions.bitcoincourseinurdu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
//import com.google.android.gms.ads.AdRequest
import com.mufasasolutions.bitcoincourseinurdu.databinding.FragmentLesson8Binding
import com.google.android.gms.ads.AdRequest
class Lesson8Fragment : Fragment() {

    private lateinit var binding: FragmentLesson8Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentLesson8Binding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adView1 = binding.adView1
        val adRequest1 = AdRequest.Builder().build()
        adView1.loadAd(adRequest1)
    }

}