package com.example.shoplist.domain

class GetShopItemUseCase (private val repository: ShopListRepository) {
    fun getShopItem(shopItemId:Int):ShopItem{
        return repository.getShopItem(shopItemId)
    }
}