package com.powerteam.verseus

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform