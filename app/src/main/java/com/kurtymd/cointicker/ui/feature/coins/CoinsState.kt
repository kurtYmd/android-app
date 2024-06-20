package com.kurtymd.cointicker.ui.feature.coins

import com.kurtymd.cointicker.data.Resource
import com.kurtymd.cointicker.data.feature.coin.model.Coin

data class CoinsState(
    val coins: Resource<List<Coin>?>,
    val watchListIds: ArrayList<String>
)
