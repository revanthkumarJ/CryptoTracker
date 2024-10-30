package com.plcoding.cryptotracker.crypto.presentation.models

import androidx.annotation.DrawableRes
import com.plcoding.cryptotracker.crypto.domain.Coin
import com.plcoding.cryptotracker.core.presentation.util.getDrawableIdForCoin
import java.text.NumberFormat
import java.util.Locale

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


fun Coin.toCoinUI():CoinUI{
    return CoinUI(
        id=id,
        name = name,
        rank=rank,
        symbol = symbol,
        marketCapUSD =marketCapUsd.toDisplayableNumber() ,
        priceUSD = priceUsd.toDisplayableNumber(),
        changePercent24Hr = changePercent24Hr.toDisplayableNumber(),
        iconRes = getDrawableIdForCoin(symbol)
    )
}

fun Double.toDisplayableNumber():DisplayableNumber{
    var formatter= NumberFormat.getNumberInstance(Locale.getDefault()).apply { minimumFractionDigits=2
    maximumFractionDigits=2}
    return DisplayableNumber(
        value = this,
        formatted=formatter.format(this)
    )
}