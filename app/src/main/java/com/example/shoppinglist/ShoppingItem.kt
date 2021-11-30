package com.example.shoppinglist

import androidx.room.Entity
import androidx.room.PrimaryKey

//Room db

@Entity(tableName="shopping_items")
data class ShoppingItem(
    //column names
    var name: String,
    var amount: Int
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null

}