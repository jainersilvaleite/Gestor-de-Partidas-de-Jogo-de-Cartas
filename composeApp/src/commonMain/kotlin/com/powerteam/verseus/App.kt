package com.powerteam.verseus

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.powerteam.verseus.view.HomeScreen
import com.powerteam.verseus.view.MasterLobbyScreen
import com.powerteam.verseus.view.MasterMatchScreen
import com.powerteam.verseus.view.PlayerLobbyScreen
import com.powerteam.verseus.view.PlayerMatchScreen
import com.powerteam.verseus.view.PlayerSettingsScreen
import com.powerteam.verseus.view.navigation.Screen
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        // sistema de navegação do aplicativo
        var currentScreen by remember { mutableStateOf<Screen>(Screen.Home) } // tela atual

        when (currentScreen) { // direciona para uma tela de acordo com o valor de currentScreen
            is Screen.Home -> { HomeScreen(onNavigate = { currentScreen = it }) }
            is Screen.MasterLobby -> { MasterLobbyScreen(onNavigate = { currentScreen = it }) }
            is Screen.MasterMatch -> { MasterMatchScreen(onNavigate = { currentScreen = it }) }
            is Screen.PlayerLobby -> { PlayerLobbyScreen(onNavigate = { currentScreen = it }) }
            is Screen.PlayerMatch -> { PlayerMatchScreen(onNavigate = { currentScreen = it }) }
            is Screen.PlayerSettings -> { PlayerSettingsScreen(onNavigate = { currentScreen = it }) }
        }
    }
}