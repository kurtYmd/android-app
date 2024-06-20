package com.kurtymd.cointicker.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.kurtymd.cointicker.data.feature.coin.dao.CoinDAO
import com.kurtymd.cointicker.data.feature.coin.dao.CoinDetailDAO
import com.kurtymd.cointicker.data.feature.coin.dao.CoinWatchlistDAO
import com.kurtymd.cointicker.data.feature.coin.model.Coin
import com.kurtymd.cointicker.data.feature.coin.model.CoinDetail
import com.kurtymd.cointicker.data.feature.coin.model.CoinWatchlist

@Database(
    entities = [
        Coin::class,
        CoinDetail::class,
        CoinWatchlist::class
    ], version = 1, exportSchema = false
)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun coinDAO(): CoinDAO
    abstract fun coinDetailDAO(): CoinDetailDAO
    abstract fun coinWatchlistDAO(): CoinWatchlistDAO
}