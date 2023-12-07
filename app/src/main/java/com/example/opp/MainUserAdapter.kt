package com.example.opp

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.content.Context
import android.view.LayoutInflater
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

data class User(val imageResource: Int, val userName: String, val userPosition: String)

class MainUserAdapter(private val context: Context, private val itemList: List<User>):
    RecyclerView.Adapter<MainUserAdapter.ViewHolderUser>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderUser {
        val view = LayoutInflater.from(context).inflate(R.layout.item_users_adapter, parent, false)
        return ViewHolderUser(view)

    }

    override fun onBindViewHolder(holder: ViewHolderUser, position: Int) {
        val currentItem = itemList[position]

        holder.imageView.setImageResource(currentItem.imageResource)
        holder.textTitle.text = currentItem.userName
        holder.textDescription.text = currentItem.userPosition
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    class ViewHolderUser(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageCover)
        val textTitle: TextView = itemView.findViewById(R.id.textMusic)
        val textDescription: TextView = itemView.findViewById(R.id.textArtist)
    }
}