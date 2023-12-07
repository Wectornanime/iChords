package com.example.opp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

class Lesson2Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_lesson2, container, false)
        view.findViewById<Button>(R.id.frag_leasson2_opc0).setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_lesson2Fragment_to_lessonFragment)
        }

        return view

        return inflater.inflate(R.layout.fragment_lesson2, container, false)
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Lesson2Fragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
}