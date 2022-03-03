package com.example.bookshop.repository

import android.content.Context
import androidx.lifecycle.LiveData
import com.example.bookshop.database.BooksDatabase
import com.example.bookshop.model.Category

class CategoryRepository(context: Context){

    private val mDatabase = BooksDatabase.getDatabase(context).categoryDAO()

    fun getAll(): LiveData<List<Category>> {
        return mDatabase.getAllCategories()
    }

}