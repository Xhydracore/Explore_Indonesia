package com.dicoding.picodiploma.exploreindonesia

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WisataAdapter(
    private val context: Context,
    private val wisatas: List<Wisata>,
    val listener: (Wisata) -> Unit
) : RecyclerView.Adapter<WisataAdapter.ImageViewHolder>() {
    class ImageViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val wisataSrc = view.findViewById<ImageView>(R.id._image)
        val title = view.findViewById<TextView>(R.id._title)
        val desc = view.findViewById<TextView>(R.id._detail)
        fun bindView(wisata: Wisata, listener: (Wisata) -> Unit) {
            wisataSrc.setImageResource(wisata.wisataSrc)
            title.text = wisata.wisataTitle
            desc.text = wisata.wisataSubTitle
            itemView.setOnClickListener { listener(wisata) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder =
        ImageViewHolder(LayoutInflater.from(context).inflate(R.layout.wisata_ticket,parent, false))

    override fun getItemCount(): Int = wisatas.size

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.bindView(wisatas[position], listener)
    }
}
