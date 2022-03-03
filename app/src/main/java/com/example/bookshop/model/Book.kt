package com.example.bookshop.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.CASCADE
import androidx.room.PrimaryKey


@Entity(
    tableName = "books_table",
    foreignKeys = [
        ForeignKey(
            entity = Category::class,
            parentColumns = ["id"],
            childColumns = ["category_id"],
            onDelete = CASCADE
        )]
)

class Book {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "book_id")
    var bookId: Int = 0

    @ColumnInfo(name = "book_name")
    var bookName: String = ""

    @ColumnInfo(name = "unit_price")
    var unitPrice: String = ""

    @ColumnInfo(name = "category_id")
    var categoryId: Int = 0
}