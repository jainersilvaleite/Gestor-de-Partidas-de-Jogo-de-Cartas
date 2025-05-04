package com.powerteam.verseus.view.layout

import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

// direciona para o layout correspondente ao tamanho ocupado da tela do dispositivo
@Composable
fun Layout(
    compactContent: @Composable () -> Unit,
    mediumContent: @Composable () -> Unit,
    expandedContent: @Composable () -> Unit,
    modifier: Modifier
) {
    BoxWithConstraints(modifier = modifier) {
        val width = maxWidth

        when {
            width < 600.dp -> compactContent()
            width < 840.dp -> mediumContent()
            else -> expandedContent()
        }
    }
}