package com.example.crazyshoestore.data

import com.example.crazyshoestore.R
import com.example.crazyshoestore.data.model.Category
import com.example.crazyshoestore.data.model.Shoe

class Datasource {

    fun getShoes(): List<Category> {
        return listOf(
            Category(
                "Damen",
                listOf(
                    Shoe(
                        "Octopus",
                        R.drawable.highheel7,
                        4.5
                    ),
                    Shoe(
                        "Scorpion",
                        R.drawable.highheel6,
                        5.3
                    ),
                    Shoe(
                        "Wire",
                        R.drawable.highheel5,
                        2.1
                    ),
                    Shoe(
                        "Nature",
                        R.drawable.highheel4,
                        4.6
                    ),
                    Shoe(
                        "Black",
                        R.drawable.ballet3,
                        3.3
                    )
                )
            ),
            Category(
                "Herren",
                listOf(
                    Shoe("Cowboy",
                        R.drawable.herren1,
                    5.1
                    ),
                    Shoe(
                        "Boots",
                        R.drawable.herren3,
                        4.8
                    ),
                    Shoe(
                        "Ocean",
                        R.drawable.herren5,
                        3.3
                    ),
                    Shoe(
                        "OaMass",
                        R.drawable.herren6,
                        2.1
                    ),
                    Shoe(
                        "Feed",
                        R.drawable.herren2,
                        0.1
                    )
                )
            ),
            Category(
                "Exclusive",
                listOf(
                    Shoe(
                        "Pan",
                        R.drawable.highheel3,
                        4.5
                    ),
                    Shoe(
                        "Croco",
                        R.drawable.highheel2,
                        3.2
                    ),
                    Shoe(
                        "Swim",
                        R.drawable.highheel1,
                        4.1
                    ),
                    Shoe(
                        "Ballet",
                        R.drawable.ballet2,
                        1.2
                    ),
                    Shoe(
                        "Fish",
                        R.drawable.pantoffel1,
                        4.1
                    )
                )
            )
        )
    }
}