package com.napa.foodstore.data.dummy

import com.napa.foodstore.model.Category

interface DummyCategoriesDataSource {
    fun getMenuCategories(): List<Category>
}

class DummyCategoriesDataSourceImpl() : DummyCategoriesDataSource {
    override fun getMenuCategories(): List<Category> =
        listOf(
            Category(
                name = "Snack",
                imgUrl = "https://raw.githubusercontent.com/panipujayanti/FoodStore_Challenge_BinarCH2/main/app/src/main/res/drawable/ic_snack.png"
            ),
            Category(
                name = "Minuman",
                imgUrl = "https://raw.githubusercontent.com/panipujayanti/FoodStore_Challenge_BinarCH2/main/app/src/main/res/drawable/ic_drink.png"
            ),
            Category(
                name = "Burger",
                imgUrl = "https://raw.githubusercontent.com/panipujayanti/FoodStore_Challenge_BinarCH2/main/app/src/main/res/drawable/ic_burger.png"
            ),
            Category(
                name = "Dessert",
                imgUrl = "https://raw.githubusercontent.com/panipujayanti/FoodStore_Challenge_BinarCH2/main/app/src/main/res/drawable/ic_dessert.png"
            ),
            Category(
                name = "Sushi",
                imgUrl = "https://raw.githubusercontent.com/panipujayanti/FoodStore_Challenge_BinarCH2/main/app/src/main/res/drawable/ic_sushi.png"
            ),
            Category(
                name = "Chicken",
                imgUrl = "https://raw.githubusercontent.com/panipujayanti/FoodStore_Challenge_BinarCH2/main/app/src/main/res/drawable/ic_chicken.png"
            )
        )
}
