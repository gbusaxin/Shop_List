package com.example.shoplist.domain

class DeleteShopItemUseCase (private val repository: ShopListRepository){
    fun deleteShopItem(item: ShopItem):Unit{
        repository.deleteShopItem(item)
    }
}