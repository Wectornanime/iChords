package com.example.opp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflar o layout do fragmento
        val view = inflater.inflate(R.layout.fragment_profile, container, false)

        // Configurar o RecyclerView de progresso
        val recyclerViewProgress: RecyclerView = view.findViewById(R.id.recyclerViewProgress)

        // Configurar o RecyclerView de amigos
        val recyclerViewFriends: RecyclerView = view.findViewById(R.id.recyclerViewFriends)

        // configurar a lista do RecyclerView de progresso
        val itemListProgress = listOf(
            Progress(R.drawable.img_disc_02, "A Cidade", "Chico Science", "40%"),
            Progress(R.drawable.img_disc_04, "Lanterna dos Afogados", "Os Paralamas do Sucesso", "100%"),
            Progress(R.drawable.img_disc_05, "Dark Paradise", "Lana del Rey", "11%")
        )

        // configurar a lista do RecyclerView de amigos
        val itemListFriends = listOf(
            User(R.drawable.img_user_1, "Eduardo", "4 músicas"),
            User(R.drawable.img_user_2, "Luiz", "3 músicas"),
            User(R.drawable.img_user_3, "Renata", "2 músicas")
        )

        // configurar o layout do RecyclerView de progresso
        val layoutManagerProgress = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        val adapterProgress = ProfileProgressAdapter(requireContext(), itemListProgress)
        recyclerViewProgress.adapter = adapterProgress
        recyclerViewProgress.layoutManager = layoutManagerProgress

        // configurar o layout do RecyclerView de amigos
        val layoutManagerFriends = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        val adapterFriends = MainUserAdapter(requireContext(), itemListFriends)
        recyclerViewFriends.adapter = adapterFriends
        recyclerViewFriends.layoutManager = layoutManagerFriends

        view.findViewById<ImageView>(R.id.imgSett).setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_menu_profile_to_settingsFragment)
        }

        return view

    }
}