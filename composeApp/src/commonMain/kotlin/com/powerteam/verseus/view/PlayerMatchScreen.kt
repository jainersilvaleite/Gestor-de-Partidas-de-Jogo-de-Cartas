package com.powerteam.verseus.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.powerteam.verseus.view.layout.Layout
import com.powerteam.verseus.view.navigation.Screen

// visão da partida pelos jogadores
@Composable
fun PlayerMatchScreen(
    onNavigate: (Screen) -> Unit,
    modifier: Modifier = Modifier
) {
    // organização do layout de acordo com a ocupação da tela do dispositivo
    Layout(
        compactContent = {
            CompactPlayerMatchScreen(
                onNavigate = onNavigate,
                modifier = modifier
            )
        },
        mediumContent = {
            MediumPlayerMatchScreen(
                onNavigate = onNavigate,
                modifier = modifier
            )
        },
        expandedContent = {
            ExpandedPlayerMatchScreen(
                onNavigate = onNavigate,
                modifier = modifier
            )
        },
        modifier = modifier
    )
}

// modo de exibição compacto (menos de 600.dp de largura)
@Composable
fun CompactPlayerMatchScreen(
    onNavigate: (Screen) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier.fillMaxSize()
    ) {
        Text(text = "Você está na PlayerMatchScreen")
        Text(text = "Exibindo no modo: Compacto")
        Spacer(modifier = modifier.height(10.dp))
        Text(text = "Painel de Navegação", fontWeight = FontWeight.Bold)
        Spacer(modifier = modifier.height(10.dp))
        Button(onClick = { onNavigate(Screen.Home) }) { Text(text = "HomeScreen") }
        Button(onClick = { onNavigate(Screen.MasterLobby) }) { Text(text = "MasterLobbyScreen") }
        Button(onClick = { onNavigate(Screen.MasterMatch) }) { Text(text = "MasterMatchScreen") }
        Button(onClick = { onNavigate(Screen.PlayerLobby) }) { Text(text = "PlayerLobbyScreen") }
        Button(onClick = { onNavigate(Screen.PlayerMatch) }) { Text(text = "PlayerMatchScreen") }
        Button(onClick = { onNavigate(Screen.PlayerSettings) }) { Text(text = "PlayerSettingsScreen") }
    }
}

// modo de exibição médio (entre 600 e 839.dp de largura)
@Composable
fun MediumPlayerMatchScreen(
    onNavigate: (Screen) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier.fillMaxSize()
    ) {
        Text(text = "Você está na PlayerMatchScreen")
        Text(text = "Exibindo no modo: Médio")
        Spacer(modifier = modifier.height(10.dp))
        Text(text = "Painel de Navegação", fontWeight = FontWeight.Bold)
        Spacer(modifier = modifier.height(10.dp))
        Button(onClick = { onNavigate(Screen.Home) }) { Text(text = "HomeScreen") }
        Button(onClick = { onNavigate(Screen.MasterLobby) }) { Text(text = "MasterLobbyScreen") }
        Button(onClick = { onNavigate(Screen.MasterMatch) }) { Text(text = "MasterMatchScreen") }
        Button(onClick = { onNavigate(Screen.PlayerLobby) }) { Text(text = "PlayerLobbyScreen") }
        Button(onClick = { onNavigate(Screen.PlayerMatch) }) { Text(text = "PlayerMatchScreen") }
        Button(onClick = { onNavigate(Screen.PlayerSettings) }) { Text(text = "PlayerSettingsScreen") }
    }
}

// modo de exibição expandido (840.dp ou mais de largura)
@Composable
fun ExpandedPlayerMatchScreen(
    onNavigate: (Screen) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier.fillMaxSize()
    ) {
        Text(text = "Você está na PlayerMatchScreen")
        Text(text = "Exibindo no modo: Expandido")
        Spacer(modifier = modifier.height(10.dp))
        Text(text = "Painel de Navegação", fontWeight = FontWeight.Bold)
        Spacer(modifier = modifier.height(10.dp))
        Button(onClick = { onNavigate(Screen.Home) }) { Text(text = "HomeScreen") }
        Button(onClick = { onNavigate(Screen.MasterLobby) }) { Text(text = "MasterLobbyScreen") }
        Button(onClick = { onNavigate(Screen.MasterMatch) }) { Text(text = "MasterMatchScreen") }
        Button(onClick = { onNavigate(Screen.PlayerLobby) }) { Text(text = "PlayerLobbyScreen") }
        Button(onClick = { onNavigate(Screen.PlayerMatch) }) { Text(text = "PlayerMatchScreen") }
        Button(onClick = { onNavigate(Screen.PlayerSettings) }) { Text(text = "PlayerSettingsScreen") }
    }
}