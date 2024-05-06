package com.example.middleexam

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import androidx.navigation.NavHostController

@Composable
fun Apage(navController: NavController) {
    Column {
        Text(text = "教师信息")
        Image(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription ="")
        Text(text = "Android")
        Button(onClick = {
            navController.navigate("Home") }) {
            Text(text = "home")
        }
    }
}
