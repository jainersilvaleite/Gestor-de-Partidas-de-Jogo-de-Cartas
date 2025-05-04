package com.powerteam.verseus.view.navigation

// classe selada que contém todas as telas do aplicativo para navegação
sealed class Screen {
    data object Home: Screen() // tela principal para criar e entrar em partidas
    data object PlayerLobby: Screen() // lobby do ponto de vista dos jogadores
    data object MasterLobby: Screen() // lobby do ponto de vista do mestre da partida
    data object PlayerMatch: Screen() // visão da partida pelos jogadores
    data object MasterMatch: Screen() // visão da partida pelo seu mestre
    data object PlayerSettings: Screen() // ajustes dos dados de um jogador pelo mestre da partida
}