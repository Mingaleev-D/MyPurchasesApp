package com.example.mypurchasesapp.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * @author Mingaleev D. 08.06.2022
 **/
@Entity(tableName = "item_entity")
data class ItemEntity(
    @PrimaryKey val id: String = "",
    val title: String = "",
    val description: String? = null,
    val priority: Int = 0,
    val createdAt: Long = 0L,
    val categoryId: String = ""
)