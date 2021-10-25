package com.example.shoplist.domain

interface ShopListRepository {

    fun addShopItem(item: ShopItem):Unit

    fun deleteShopItem(item: ShopItem):Unit

    fun editShopItem(item: ShopItem):Unit

    fun getShopItem(shopItemId:Int):ShopItem

    fun getShopList():List<ShopItem>
}