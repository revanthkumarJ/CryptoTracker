package com.plcoding.cryptotracker.crypto.presentation.coin_list.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.plcoding.cryptotracker.crypto.domain.Coin
import com.plcoding.cryptotracker.crypto.presentation.models.CoinUI
import com.plcoding.cryptotracker.ui.theme.CryptoTrackerTheme

@Composable
fun CoinListItem(
    coinUI: CoinUI,
    onClick:()->Unit,
    modifier: Modifier=Modifier
) {
    Row (
        modifier= modifier
            .fillMaxWidth()
            .clickable(onClick = onClick)
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ){
        Icon(imageVector = ImageVector.vectorResource(id = coinUI.iconRes),
            contentDescription =coinUI.name,
            tint=MaterialTheme.colorScheme.primary,
            modifier=Modifier.size(85.dp)
        )

    }
}



//@Preview
//@Composable
//fun CoinListItempreview()
//{
//    CryptoTrackerTheme {
//        CoinListItem(coinUI = , onClick = { /*TODO*/ })
//    }
//}

//internal var previewIcon=Coin(
//    id:"ndnj",
//    rank:"1",
//    symbol:"BTC",
//    name:"Revanth"
//)