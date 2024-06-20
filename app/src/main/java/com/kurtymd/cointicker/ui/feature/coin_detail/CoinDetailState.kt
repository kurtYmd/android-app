package com.kurtymd.cointicker.ui.feature.coin_detail

import com.kurtymd.cointicker.data.Resource
import com.kurtymd.cointicker.data.feature.coin.model.CoinDetail

data class CoinDetailState(
    val coinDetails: Resource<CoinDetail>,
    val watchList: Boolean
)