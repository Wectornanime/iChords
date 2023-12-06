package com.example.opp

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.content.Context
import android.view.LayoutInflater
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

data class Music(val imageResource: Int, val musicName: String, val artistName: String)

class MainMusicAdapter(private val context: Context, private val itemList: List<Music>) :
    RecyclerView.Adapter<MainMusicAdapter.ViewHolderMusic>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderMusic {
        val view = LayoutInflater.from(context).inflate(R.layout.item_musics_adapter, parent, false)
        return ViewHolderMusic(view)

    }

    override fun onBindViewHolder(holder: ViewHolderMusic, position: Int) {
        val currentItem = itemList[position]

        holder.imageView.setImageResource(currentItem.imageResource)
        holder.textTitle.text = currentItem.musicName
        holder.textDescription.text = currentItem.artistName
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    class ViewHolderMusic(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageCover)
        val textTitle: TextView = itemView.findViewById(R.id.textMusic)
        val textDescription: TextView = itemView.findViewById(R.id.textArtist)
    }
}
