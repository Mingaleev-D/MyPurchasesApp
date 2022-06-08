package com.example.mypurchasesapp.ui.home

import androidx.core.view.isGone
import androidx.core.view.isVisible
import com.airbnb.epoxy.EpoxyController
import com.example.mypurchasesapp.R
import com.example.mypurchasesapp.database.entity.ItemEntity
import com.example.mypurchasesapp.databinding.ModelItemEntityBinding
import com.example.mypurchasesapp.ui.epoxy.ViewBindingKotlinModel

/**
 * @author Mingaleev D. 08.06.2022
 **/
class HomeEpoxyController(
    private val itemEntityInterface: ItemEntityInterface
) : EpoxyController() {

    var isLoading = true
        set(value) {
            field = value
            if (field) {
                requestModelBuild()
            }
        }

    var itemEntityList = ArrayList<ItemEntity>()
        set(value) {
            field = value
            isLoading = false
            requestModelBuild()
        }

    override fun buildModels() {
        if (isLoading) {
            //todo loading
        }

        if (itemEntityList.isEmpty()) {
            //todo empty
            return
        }
        itemEntityList.forEach { item ->
            ItemEntityEpoxyModel(item,itemEntityInterface).id(item.id).addTo(this)
        }
    }

    data class ItemEntityEpoxyModel(
        val itemEntity: ItemEntity,
        val itemEntityInterface: ItemEntityInterface
    ) : ViewBindingKotlinModel<ModelItemEntityBinding>(R.layout.model_item_entity) {

        override fun ModelItemEntityBinding.bind() {
            if (itemEntity.description == null) {
                descriptionTextView.isGone = true
            } else {
                descriptionTextView.isVisible = true
                descriptionTextView.text = itemEntity.description
            }
            deleteImage.setOnClickListener {
                itemEntityInterface.onDeleteItemEntity(itemEntity)
            }
            priorityTextView.setOnClickListener {
                itemEntityInterface.onBumpPriority(itemEntity)
            }
        }
    }
}