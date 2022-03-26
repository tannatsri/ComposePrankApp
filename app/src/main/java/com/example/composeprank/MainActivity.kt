package com.example.composeprank

import android.annotation.SuppressLint
import android.app.WallpaperManager
import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color


class MainActivity : ComponentActivity() {

    private lateinit var design: Design

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        design = Design()
        setContent {
            Scaffold(
                backgroundColor = Color.Black
            ) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    design.Button1(this@MainActivity, ::changeWallpaper)
                }
            }

        }
    }

    @SuppressLint("ResourceType")
    fun changeWallpaper(context:Context) {
        val wallpaperManager: WallpaperManager = WallpaperManager.getInstance(context)
        try {
            wallpaperManager.setResource(R.drawable.image1)
        } catch (e: Exception) {
            Toast.makeText(
                context, "Something went wrong",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}


