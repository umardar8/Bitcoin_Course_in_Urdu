package com.mufasasolutions.bitcoincourseinurdu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mufasasolutions.bitcoincourseinurdu.databinding.FragmentLesson6dBinding

class Lesson6dFragment : Fragment() {

    private lateinit var binding: FragmentLesson6dBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentLesson6dBinding.inflate(inflater, container, false)
        return binding.root
    }
}