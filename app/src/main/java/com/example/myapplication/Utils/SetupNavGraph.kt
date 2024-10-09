package com.example.myapplication.Utils

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.myapplication.Screen.HomeScreen
import com.example.myapplication.Screen.LoginScreen
import com.example.myapplication.ViewModel.LoginViewModel

@Composable
fun SetupNavGraph(navController: NavHostController, loginViewModel: LoginViewModel) {
    NavHost(navController = navController, startDestination = "login_screen") {
        composable("login_screen") {
            LoginScreen(navController = navController) { username,password ->
                loginViewModel.login(username,password)
            }
        }
        composable("home_screen") {
            HomeScreen(viewModel = loginViewModel)
        }
    }
}
