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
            Music(R.drawable.img_disc_01, "I Guess", "Mitski"),
            Music(R.drawable.img_disc_02, "A Cidade", "Chico Science"),
            Music(R.drawable.img_disc_03, "Chocolate", "Marisa Monte"),
            Music(R.drawable.img_disc_04, "Lanterna dos Afogados", "Os Paralamas do Sucesso"),
            Music(R.drawable.img_disc_05, "Dark Paradise", "Lana del Rey"),
            Music(R.drawable.img_disc_06, "Meu São Jorge", "Lia de Itamaracá"),
            Music(R.drawable.img_disc_07, "O Côro Vai Comê", "Charlie Brown Jr.")
        )

        // configurar a lista do RecyclerView de usuarios
        val itemListUser = listOf(
            User(R.drawable.img_user_1, "Eduardo", "4 músicas"),
            User(R.drawable.img_user_2, "Luiz", "3 músicas"),
            User(R.drawable.img_user_3, "Renata", "2 músicas"),
            User(R.drawable.img_user_4, "Rodrigo", "1 música")
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