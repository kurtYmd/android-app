package com.kurtymd.cointicker.service

import com.kurtymd.cointicker.data.feature.coin.model.CoinPricesWrapper

interface CoinPriceTracker {
    var priceChangeListener: PriceChangeListener?
    fun startTracking()
}

fun interface PriceChangeListener {
    fun onPricesChange(coinIds: List<String>, prices: CoinPricesWrapper, pricesText: String)
}