package com.example.mypurchasesapp.arch

import com.example.mypurchasesapp.AppDatabase
import com.example.mypurchasesapp.database.entity.ItemEntity

/**
 * @author Mingaleev D. 08.06.2022
 **/
class PurchasesRepository(
    private val appDatabase: AppDatabase
) {
    fun insertItem(itemEntity: ItemEntity) {
        appDatabase.itemEntityDao().insert(itemEntity)
    }

    fun deleteItem(itemEntity: ItemEntity) {
        appDatabase.itemEntityDao().delete(itemEntity)
    }

    fun getAllItems(): List<ItemEntity> {
        return appDatabase.itemEntityDao().getAllItemEntities()
    }
}