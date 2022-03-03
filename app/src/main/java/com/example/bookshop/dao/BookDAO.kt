package com.example.bookshop.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.bookshop.model.Book

@Dao
interface BookDAO {

    @Insert
    fun insert(book: Book)

    @Update
    fun update(book: Book)

    @Delete
    fun delete(book: Book)

    @Query("SELECT * from books_table")
    fun getAllBooks(): LiveData<List<Book>>

    @Query("SELECT * from books_table where category_id==:categoryId")
    fun getBooksByCategory(categoryId: Int): LiveData<List<Book>>

}