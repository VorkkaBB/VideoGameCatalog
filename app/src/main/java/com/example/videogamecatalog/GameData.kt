package com.example.videogamecatalog

import androidx.compose.ui.graphics.Color

data class Game(
    val title: String,
    val platform: String,
    val imageRes: Int,
    val platformColor: Color
)

val colorPC = Color(0xFFE0E0E0)
val colorXboxLight = Color(0xFF76C776)
val colorPlayStationLight = Color(0xFF6A9BFC)
val colorMultiLight = Color(0xFFEF5350)

val gameList = listOf(
    Game("The Warriors", "PlayStation 2 / Xbox", R.drawable.the_warriors, colorPlayStationLight),
    Game("Saints Row 2", "Xbox 360 / PS3 / PC", R.drawable.saints_row_2, colorMultiLight),
    Game("Grand Theft Auto IV", "Xbox 360 / PS3 / PC", R.drawable.gta_iv, colorMultiLight),
    Game("Elden Ring", "PC / PS5 / Xbox Series", R.drawable.elden_ring, colorPC),
    Game("Resident Evil 4", "GameCube / PS2 / PC", R.drawable.resident_evil_4, colorMultiLight),
    Game("Minecraft: Java Edition", "PC", R.drawable.minecraft_java, colorPC),
    Game("Valorant", "PC", R.drawable.valorant, colorPC),
    Game("Counter-Strike", "PC", R.drawable.counter_strike, colorPC),
    Game("Gears of War 2", "Xbox 360", R.drawable.gears_of_war_2, colorXboxLight),
    Game("Call of Duty®: Black Ops II", "Xbox 360 / PS3 / PC", R.drawable.black_ops_2, colorMultiLight)
)