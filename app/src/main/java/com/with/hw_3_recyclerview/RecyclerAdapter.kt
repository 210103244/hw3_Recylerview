package com.with.hw_3_recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private var details = arrayOf("Details",
        "Details",
        "Details",
        "Details",
        "Details",
        "Details",
        "Details",
        "Details")

    private var titles = arrayOf(  "Fan Zhen Dong",
        "Wanq Chuqin",
        "Ma Long",
        "Tomokazu Harimoto",
        "Liang Zhinkun",
        "Hugo Calderano",
        "Felix Lebrun",
        "Lin Yun Ju")

    private var images = intArrayOf(R.drawable.android,
        R.drawable.a,
        R.drawable.c,
        R.drawable.d,
        R.drawable.f,
        R.drawable.e,
        R.drawable.i,
        R.drawable.h)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return titles.size
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.itemTitle.text = titles[position]
        holder.itemDetail.text = details[position]
        holder.itemImage.setImageResource(images[position])
    }


    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView

        init {
            itemImage = itemView.findViewById(R.id.item_image)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDetail = itemView.findViewById(R.id.item_detail)

            itemView.setOnClickListener{
                val position: Int = adapterPosition

                Toast.makeText(itemView.context, "You clicked on ${titles[position]}", Toast.LENGTH_LONG).show()

            }

        }
    }

}