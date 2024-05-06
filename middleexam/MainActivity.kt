package com.example.middleexam

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.middleexam.ui.theme.MiddleExamTheme
import org.intellij.lang.annotations.Language

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MiddleExamTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

class Greeting(s: String) {

}

@Composable
fun LauncherPage(navController: NavHostController) {
    TODO("Not yet implemented")
}

@Composable
fun Navigator() {
    val navController: NavHostController = rememberNavController()
    NavHost(navController = navController, startDestination = "Home") {
        composable("Launcher") { LauncherPage(navController) }
        composable("Home") { HomePage(navController) }
        composable("A") { Apage(navController) }
        composable("B") { Apage(navController) }
        composable("C") { Apage(navController) }
    }


@Composable
fun HomePage(navController: NavHostController) {
    Column {
        Button(onClick = {
            navController.navigate("A")}){
            Text(text = "A")
        }
        Button(onClick ={
            navController.navigate("B")
        }) {
            Text(text = "B")

        }
        Button(onClick ={
            navController.navigate("C")
        }) {
            Text(text = "C")
        }
    }

}

}

@Composable
fun HomePage(navController: NavHostController) {

}

@Composable
@Preview(showSystemUi = true)
fun previeHost(){
    Navigator()
}


