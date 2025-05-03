package com.powerteam.verseus

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Verseus Card Game",
    ) {
        App()
    }
}