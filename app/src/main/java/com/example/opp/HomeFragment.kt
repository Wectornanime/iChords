package com.example.opp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeFragment : Fragment() {

    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflar o layout do fragmento
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        // Configurar o RecyclerView de musicas
        val recyclerViewMusic: RecyclerView = view.findViewById(R.id.recyclerViewMusic)

        // Configurar o RecyclerView de usuarios
        val recyclerViewUser: RecyclerView = view.findViewById(R.id.recyclerViewUser)

        // configurar a lista do RecyclerView de musicas
        val itemListMusic = listOf(
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

        // configurar a lista do RecyclerView de usuarios
        val itemListUser = listOf(
            User(R.drawable.default_disc_img, "User 1", "Position 1"),
            User(R.drawable.default_disc_img, "User 2", "Position 2"),
            User(R.drawable.default_disc_img, "User 3", "Position 3"),
            User(R.drawable.default_disc_img, "User 4", "Position 4"),
            User(R.drawable.default_disc_img, "User 5", "Position 5"),
            User(R.drawable.default_disc_img, "User 6", "Position 6"),
            User(R.drawable.default_disc_img, "User 7", "Position 7"),
            User(R.drawable.default_disc_img, "User 8", "Position 8"),
            User(R.drawable.default_disc_img, "User 9", "Position 9")
        )

        // configurar o layout do RecyclerView de musicas
        val layoutManagerMusic = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        val adapterMusic = MainMusicAdapter(requireContext(), itemListMusic)
        recyclerViewMusic.adapter = adapterMusic
        recyclerViewMusic.layoutManager = layoutManagerMusic

        // configurar o layout do RecyclerView de usuarios
        val layoutManagerUser = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        val adapterUser = MainUserAdapter(requireContext(), itemListUser)
        recyclerViewUser.adapter = adapterUser
        recyclerViewUser.layoutManager = layoutManagerUser

        return view
    }

}