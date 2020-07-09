package com.zil.aplikasiwisatasemarang

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ListWisataAdapter(private val listWisata: ArrayList<Wisata>): RecyclerView.Adapter<ListWisataAdapter.ListViewHolder>() {
    private lateinit var clickItem: ClickItem

    fun setClickItem(clickItem: ClickItem) {
        this.clickItem = clickItem
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_wisata, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val wisata = listWisata[position]

        Glide.with(holder.itemView.context)
            .load(wisata.photo)
            .centerCrop()
            .into(holder.imgPhoto)

        holder.tvNamaWisata.text = wisata.name
        holder.tvRatingBar.rating = wisata.rating
        holder.tvRatingNum.text = " ("+wisata.rating+")"
        holder.tvJamBuka.text = "Buka "+wisata.buka
//        holder.itemView.setOnClickListener{ clickItem.itemClicked(listWisata[holder.adapterPosition]) }
        holder.buttonView.setOnClickListener{ clickItem.itemClicked((listWisata[holder.adapterPosition]) ) }
    }

    override fun getItemCount(): Int {
        return listWisata.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvNamaWisata: TextView = itemView.findViewById(R.id.item_name)
        var tvRatingBar: RatingBar = itemView.findViewById(R.id.rating_wisata)
        var imgPhoto: ImageView = itemView.findViewById(R.id.item_photo)
        var tvJamBuka: TextView = itemView.findViewById(R.id.item_buka)
        var tvRatingNum: TextView = itemView.findViewById(R.id.rating_number)
        val buttonView: Button = itemView.findViewById(R.id.button_view_more)
    }

    interface ClickItem {
        fun itemClicked(data: Wisata)
    }
}