package com.example.crazyshoestore.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.crazyshoestore.R
import com.example.crazyshoestore.data.model.Shoe

class ShoeAdapter (
        private val dataset: List<Shoe>)
        : RecyclerView.Adapter<ShoeAdapter.ViewHolder>() {
        class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
            val shoeIamge=view.findViewById<ImageView>(R.id.shoe_image)
            val shoeTitle=view.findViewById<TextView>(R.id.shoe_name_text)
            val shoeRating=view.findViewById<TextView>(R.id.shoe_rating_text)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val adapterLayout =
                LayoutInflater.from(parent.context).inflate(R.layout.shoe_item, parent, false)

            // und in einem ViewHolder zurückgegeben
            return ViewHolder(adapterLayout)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val shoe = dataset[position]

            holder.shoeIamge.setImageResource(shoe.imageResource)
            holder.shoeTitle.text = shoe.title
            holder.shoeRating.text = shoe.rating.toString()
        }

        override fun getItemCount(): Int {
            return dataset.size
        }
    }
