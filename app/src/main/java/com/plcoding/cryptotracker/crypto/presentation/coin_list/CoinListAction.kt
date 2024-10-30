package com.plcoding.cryptotracker.crypto.presentation.coin_list

import com.plcoding.cryptotracker.crypto.presentation.models.CoinUI

sealed interface CoinListAction {
    data class onCoinClick(val coinUI: CoinUI):CoinListAction
}