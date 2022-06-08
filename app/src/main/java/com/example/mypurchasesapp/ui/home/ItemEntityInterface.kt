package com.example.mypurchasesapp.ui.home

import com.example.mypurchasesapp.database.entity.ItemEntity

/**
 * @author Mingaleev D. 08.06.2022
 **/
interface ItemEntityInterface {
    fun onDeleteItemEntity(itemEntity: ItemEntity)
    fun onBumpPriority(itemEntity: ItemEntity)
}