package com.example.shoplist.domain

class AddShopItemUseCase(private val repository: ShopListRepository) {
    fun addShopItem(item: ShopItem):Unit{
        repository.addShopItem(item)
    }
}