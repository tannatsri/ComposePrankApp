package com.example.composeprank

import android.annotation.SuppressLint
import android.content.Context
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlin.reflect.KFunction1

class Design {

    @SuppressLint("ResourceType")
    @Composable
    fun Button1(context:Context, changeWallpaper: (context:Context)-> Unit) {
        Button(
            onClick = {
                changeWallpaper(context)
            },
            contentPadding = PaddingValues(
                start = 40.dp,
                top = 22.dp,
                end = 40.dp,
                bottom = 22.dp
            )
        ) {
            Icon(
                Icons.Filled.Favorite,
                contentDescription = "Favorite",
                modifier = Modifier.size(ButtonDefaults.IconSize)
            )
            Spacer(Modifier.size(ButtonDefaults.IconSpacing))
            Text("With love from Tan")
        }
    }
}