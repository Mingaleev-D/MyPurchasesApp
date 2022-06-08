package com.example.mypurchasesapp

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.mypurchasesapp.database.dao.ItemEntityDao
import com.example.mypurchasesapp.database.entity.ItemEntity

/**
 * @author Mingaleev D. 08.06.2022
 **/
@Database(
    entities = [ItemEntity::class],
    version = 1
)
abstract class AppDatabase : RoomDatabase() {

    companion object {
        private var appDatabase: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            if (appDatabase != null){
                return appDatabase!!
            }

            appDatabase = Room.databaseBuilder(
                context.applicationContext,
                AppDatabase::class.java,
                "my-purchases-app-database"
            ).build()
            return appDatabase!!
        }
    }

    abstract fun itemEntityDao(): ItemEntityDao
}