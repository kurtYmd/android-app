package com.kurtymd.cointicker.di.module

import android.content.Context
import android.os.Build
import com.kurtymd.cointicker.data.feature.coin.repository.CoinRepository
import com.kurtymd.cointicker.providers.ResourceProvider
import com.kurtymd.cointicker.providers.ResourceProviderImpl
import com.kurtymd.cointicker.notification.NotificationStrategy
import com.kurtymd.cointicker.notification.NotificationStrategyAboveApi26
import com.kurtymd.cointicker.notification.NotificationStrategyBelowApi26
import com.kurtymd.cointicker.service.CoinPriceTracker
import com.kurtymd.cointicker.service.CoinPriceTrackerImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun resourceProvider(@ApplicationContext context: Context): ResourceProvider = ResourceProviderImpl(context)

    @Provides
    fun notificationStrategy(@ApplicationContext context: Context): NotificationStrategy =
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) NotificationStrategyAboveApi26(context)
        else NotificationStrategyBelowApi26(context)

    @Provides
    fun coinPriceTracker(coinRepository: CoinRepository): CoinPriceTracker = CoinPriceTrackerImpl(coinRepository)
}