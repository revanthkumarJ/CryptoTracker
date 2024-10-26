package com.plcoding.cryptotracker.crypto.presentation.models

import androidx.annotation.DrawableRes

data class CoinUI(
    val id:String,
    val rank:Int,
    val name:String,
    val symbol:String,
    val marketCapUSD:DisplayableNumber,
    val priceUSD:DisplayableNumber,
    val changePercent24Hr:DisplayableNumber,
    @DrawableRes val iconRes:Int
)


data class DisplayableNumber(
    val value:Double,
    val formatted:String
)
