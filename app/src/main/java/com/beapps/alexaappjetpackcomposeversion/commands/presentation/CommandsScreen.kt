package com.beapps.alexaappjetpackcomposeversion.commands.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.beapps.alexaappjetpackcomposeversion.core.presentation.components.poppinsFontFamily

@Composable
fun CommandsScreen(modifier: Modifier = Modifier) {
      Box(modifier = Modifier.fillMaxSize().padding(16.dp) , contentAlignment = Alignment.Center) {
          Text(
              text = "Commands",
              fontSize = 22.sp,
              textAlign = TextAlign.Center,
              fontFamily = poppinsFontFamily
          )
      }
}