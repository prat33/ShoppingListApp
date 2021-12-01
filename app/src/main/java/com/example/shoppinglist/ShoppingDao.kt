package com.example.shoppinglist

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao //Dao - Functions to access db are in DAO
interface ShoppingDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(item: ShoppingItem) //suspend used to do asynchronous task(tasks that are not on main thread)

    @Delete
    suspend fun delete(item: ShoppingItem)

    @Query("SELECT * FROM shopping_items ")
    fun getAllShoppingItems(): LiveData<List<ShoppingItem>> //update recyclerView live
}