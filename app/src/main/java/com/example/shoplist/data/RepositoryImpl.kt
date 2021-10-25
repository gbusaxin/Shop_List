package com.example.shoplist.data

import com.example.shoplist.domain.ShopItem
import com.example.shoplist.domain.ShopListRepository
import java.lang.RuntimeException

object RepositoryImpl:ShopListRepository {

    val list = mutableListOf<ShopItem>()

    var autoIncrementId = 0

    override fun addShopItem(item: ShopItem) {
        if (item.id == ShopItem.UNDEFINED_ID){
            item.id = autoIncrementId++
        }
        list.add(item)
    }

    override fun deleteShopItem(item: ShopItem) {
        list.remove(item)
    }

    override fun editShopItem(item: ShopItem) {
        val oldItem = getShopItem(item.id)
        list.remove(oldItem)
        list.add(item)
    }

    override fun getShopItem(shopItemId: Int): ShopItem {
        return list.find { it.id == shopItemId }
            ?: throw RuntimeException("Not found $shopItemId")

    }

    override fun getShopList(): List<ShopItem> {
        return list.toList()
    }
}