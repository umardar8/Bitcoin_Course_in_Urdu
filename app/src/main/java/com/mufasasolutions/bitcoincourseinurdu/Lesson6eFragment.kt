package com.mufasasolutions.bitcoincourseinurdu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mufasasolutions.bitcoincourseinurdu.databinding.FragmentLesson6eBinding

class Lesson6eFragment : Fragment() {

    private lateinit var binding: FragmentLesson6eBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentLesson6eBinding.inflate(inflater, container, false)
        return binding.root
    }
}