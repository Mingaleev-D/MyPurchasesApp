package com.example.mypurchasesapp.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.mypurchasesapp.model.ItemEntity

/**
 * @author Mingaleev D. 08.06.2022
 **/
@Dao
interface ItemEntityDao {

    @Query("SELECT * FROM item_entity")
    fun getAllItemEntities(): List<ItemEntity>

    @Insert
    fun insert(itemEntity: ItemEntity)

    @Delete
    fun delete(itemEntity: ItemEntity)
}