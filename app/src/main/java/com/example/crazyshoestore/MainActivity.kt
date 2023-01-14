package com.example.crazyshoestore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.crazyshoestore.adapter.CategoryAdapter
import com.example.crazyshoestore.data.Datasource
import com.example.crazyshoestore.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this, R.layout.activity_main)

        val datasource = Datasource()
        val categoryList = datasource.getShoes()

        binding.categoryRecycler.adapter = CategoryAdapter(categoryList)
    }
}