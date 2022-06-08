package com.example.mypurchasesapp

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.mypurchasesapp.dao.ItemEntityDao
import com.example.mypurchasesapp.model.ItemEntity

/**
 * @author Mingaleev D. 08.06.2022
 **/
@Database(
    entities = [ItemEntity::class],
    version = 1
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun itemEntityDao(): ItemEntityDao
}