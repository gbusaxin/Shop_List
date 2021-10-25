package com.example.shoplist.domain

class EditShopItemUseCase (private val repository: ShopListRepository){
    fun editShopItem(item: ShopItem):Unit{
        repository.editShopItem(item)
    }
}