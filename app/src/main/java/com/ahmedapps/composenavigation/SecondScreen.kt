package com.ahmedapps.composenavigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavHostController

/**
 * @author Android Devs Academy (Ahmed Guedmioui)
 */

@Composable
fun SecondScreen(
    navController: NavHostController,
    backStackEntry: NavBackStackEntry
) {

    val url = backStackEntry.arguments?.getString("url")
    val counter = backStackEntry.arguments?.getInt("counter")


    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Second Screen, url: $url - counter: $counter",
            fontSize = 20.sp
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            navController.navigate(Screen.Last.rout)
        }) {
            Text(
                text = "Go To Last",
            )
        }
    }
}







