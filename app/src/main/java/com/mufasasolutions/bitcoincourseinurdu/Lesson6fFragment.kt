package com.mufasasolutions.bitcoincourseinurdu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mufasasolutions.bitcoincourseinurdu.databinding.FragmentLesson6fBinding

class Lesson6fFragment : Fragment() {

    private lateinit var binding: FragmentLesson6fBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentLesson6fBinding.inflate(inflater, container, false)
        return binding.root
    }
}