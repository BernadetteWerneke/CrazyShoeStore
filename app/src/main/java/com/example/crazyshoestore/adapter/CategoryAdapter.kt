package com.example.crazyshoestore.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.crazyshoestore.R
import com.example.crazyshoestore.data.model.Category


class CategoryAdapter (
    private val dataset: List<Category>)
    : RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {
    class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val categoryName=view.findViewById<TextView>(R.id.category_name_text)
        val shoeRecycler=view.findViewById<RecyclerView>(R.id.category_shoe_recycler)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val adapterLayout =
            LayoutInflater.from(parent.context).inflate(R.layout.category_item, parent, false)

        // und in einem ViewHolder zurückgegeben
        return ViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val category = dataset[position]

        holder.categoryName.text=category.categoryName
        holder.shoeRecycler.adapter=ShoeAdapter(category.shoes)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}