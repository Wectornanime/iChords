package com.example.opp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeFragment : Fragment() {

    // TODO: Rename and change types of parameters
    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflar o layout do fragmento
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        // Configurar o RecyclerView
        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)

        val itemList = listOf(
            Music(R.drawable.default_disc_img, "Music 1", "Artist 1"),
            Music(R.drawable.default_disc_img, "Music 2", "Artist 2"),
            Music(R.drawable.default_disc_img, "Music 3", "Artist 3"),
            Music(R.drawable.default_disc_img, "Music 4", "Artist 4"),
            Music(R.drawable.default_disc_img, "Music 5", "Artist 5"),
            Music(R.drawable.default_disc_img, "Music 6", "Artist 6"),
            Music(R.drawable.default_disc_img, "Music 7", "Artist 7"),
            Music(R.drawable.default_disc_img, "Music 8", "Artist 8"),
            Music(R.drawable.default_disc_img, "Music 9", "Artist 9")
        )

        val layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        val adapter = MainMusicAdapter(requireContext(), itemList)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = layoutManager

        return view
    }

}