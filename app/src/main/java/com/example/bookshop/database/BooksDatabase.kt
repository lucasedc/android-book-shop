package com.example.bookshop.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.bookshop.dao.BookDAO
import com.example.bookshop.dao.CategoryDAO
import com.example.bookshop.model.Book
import com.example.bookshop.model.Category

@Database(entities = [Book::class,Category::class],version = 1)
abstract class BooksDatabase : RoomDatabase(){
    abstract fun categoryDAO(): CategoryDAO
    abstract fun bookDAO(): BookDAO

    companion object{
        private lateinit var INSTANCE: BooksDatabase
        fun getDatabase(context: Context): BooksDatabase {
            if ( !::INSTANCE.isInitialized){
                INSTANCE = Room.databaseBuilder(context,BooksDatabase::class.java,"BooksDB")
                    .build()
            }
            return INSTANCE
        }

    }

}