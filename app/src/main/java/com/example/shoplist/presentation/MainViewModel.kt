package com.example.shoplist.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.shoplist.data.RepositoryImpl
import com.example.shoplist.domain.*

class MainViewModel : ViewModel() {
    private val repository = RepositoryImpl

    private val getShopItemList = GetShopListUseCase(repository)
    private val deleteShopItem = DeleteShopItemUseCase(repository)
    private val editShopItem = EditShopItemUseCase(repository)

    val shopItemList = MutableLiveData<List<ShopItem>>()

    fun getShopList() {
        let {
            val list = getShopItemList.getShopList()
            shopItemList.postValue(list)
        }
    }
}