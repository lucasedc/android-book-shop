package com.example.bookshop.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import androidx.room.OnConflictStrategy.REPLACE
import com.example.bookshop.model.Category

@Dao
interface CategoryDAO {
    @Insert(onConflict = REPLACE)
    fun insert(category: Category)

    @Update
    fun update(category: Category)

    @Delete
    fun delete(category: Category)

    @Query("SELECT * FROM categories_table")
    fun getAllCategories(): LiveData<List<Category>>
}