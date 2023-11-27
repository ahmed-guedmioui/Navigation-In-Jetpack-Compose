package com.ahmedapps.composenavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.ahmedapps.composenavigation.ui.theme.NavigationInComposeORIGINALTheme

/**
 * @author Android Devs Academy (Ahmed Guedmioui)
 */

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigationInComposeORIGINALTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination = Screen.Home.rout
                    ) {
                        composable(Screen.Home.rout) {
                            HomeScreen(navController = navController)
                        }

                        composable(
                            Screen.Second.rout + "/{url}/{counter}",
                            arguments = listOf(
                                navArgument("url") { type = NavType.StringType },
                                navArgument("counter") { type = NavType.IntType },
                            )
                        ) { backStackEntry ->

                            SecondScreen(
                                backStackEntry = backStackEntry,
                                navController = navController
                            )
                        }

                        composable(Screen.Last.rout) {
                            LastScreen(navController = navController)
                        }
                    }

                }
            }
        }
    }
}











