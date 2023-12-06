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
            Music(R.drawable.character_1, "Título 1", "Descrição 1"),
            Music(R.drawable.character_2, "Título 2", "Descrição 2"),
            Music(R.drawable.character_3, "Título 3", "Descrição 3")
        )

        val layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        val adapter = MainMusicAdapter(requireContext(), itemList)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = layoutManager

        return view
    }

}