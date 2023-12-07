package com.example.opp

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.content.Context
import android.view.LayoutInflater
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

data class Progress(val imageResource: Int, val musicName: String, val artistName: String, val progressValue: String)
class ProfileProgressAdapter (private val context: Context, private val itemList: List<Progress>) :
RecyclerView.Adapter<ProfileProgressAdapter.ViewHolderProgress>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderProgress {
        val view = LayoutInflater.from(context).inflate(R.layout.item_evolution_adapter, parent, false)
        return ViewHolderProgress(view)

    }

    override fun onBindViewHolder(holder: ViewHolderProgress, position: Int) {
        val currentItem = itemList[position]

        holder.imageView.setImageResource(currentItem.imageResource)
        holder.textTitle.text = currentItem.musicName
        holder.textDescription.text = currentItem.artistName
        holder.textProgress.text = currentItem.progressValue
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    class ViewHolderProgress(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageCover)
        val textTitle: TextView = itemView.findViewById(R.id.textMusic)
        val textDescription: TextView = itemView.findViewById(R.id.textArtist)
        val textProgress: TextView = itemView.findViewById(R.id.textProgress)
    }
}