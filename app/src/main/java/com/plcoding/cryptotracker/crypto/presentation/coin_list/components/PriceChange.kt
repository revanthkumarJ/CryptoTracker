package com.plcoding.cryptotracker.crypto.presentation.coin_list.components

import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.plcoding.cryptotracker.crypto.presentation.models.DisplayableNumber
import com.plcoding.cryptotracker.crypto.presentation.models.toDisplayableNumber
import com.plcoding.cryptotracker.ui.theme.CryptoTrackerTheme
import com.plcoding.cryptotracker.ui.theme.greenBackground

@Composable
fun PriceChange(
    change:DisplayableNumber
){
    val isPositive=if(change.value>=0){true} else {false}
    val backgroundColour=if(isPositive){
       greenBackground
    }
    else
    {
        MaterialTheme.colorScheme.errorContainer
    }
    val contentColour=if(isPositive){
        Color.Green
    }
    else
    {
        MaterialTheme.colorScheme.onErrorContainer ?: Color.Red
    }

    Row (
        modifier= Modifier
            .clip(RoundedCornerShape(100f))
            .background(backgroundColour)
            .padding(horizontal = 4.dp),
        verticalAlignment = Alignment.CenterVertically
    ){
        Icon(imageVector = if(isPositive){
            Icons.Default.KeyboardArrowUp}else{Icons.Default.KeyboardArrowUp}, contentDescription =isPositive.toString() ,
            modifier=Modifier.size(20.dp),
            tint = contentColour,
        )
        Text(text = "${change.formatted}%",
            fontSize = 14.sp,
            fontWeight = FontWeight.Light,
            color = contentColour
        )
    }
}


@PreviewLightDark
@Composable
fun PriceChangePreview()
{
    CryptoTrackerTheme {
        PriceChange(change = 679.00.toDisplayableNumber() )
    }
}