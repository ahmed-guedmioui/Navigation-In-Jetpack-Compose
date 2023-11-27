package com.ahmedapps.composenavigation

/**
 * @author Android Devs Academy (Ahmed Guedmioui)
 */
sealed class Screen(val rout: String) {
    object Home : Screen("home")
    object Second : Screen("second")
    object Last : Screen("last")
}
