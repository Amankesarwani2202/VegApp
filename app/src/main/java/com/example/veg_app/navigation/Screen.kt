package com.example.veg_app.navigation

import androidx.annotation.StringRes
import com.example.veg_app.R
sealed class Screen(val route: String, @StringRes val resourceId: Int) {
    object Splash : Screen("splash", R.string.splash)
    object OnBoarding : Screen("onboarding", R.string.onboarding)
    object Dashboard : Screen("dashboard", R.string.dashboard)
    object VegetableDetail : Screen("vegetabledetail", R.string.vegetabledetail)

}