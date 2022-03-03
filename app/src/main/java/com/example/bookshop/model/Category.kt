package com.example.bookshop.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "categories_table")
class Category(){
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "category_id")
    var  id: Int=0

    @ColumnInfo(name="category_name")
    var categoryName: String = ""

    @ColumnInfo(name="category_description")
    var categoryDescription: String = ""
}