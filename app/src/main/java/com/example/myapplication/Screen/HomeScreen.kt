package com.example.myapplication.Screen

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ViewModel.LoginViewModel
import java.util.Calendar

@Composable
fun HomeScreen(viewModel: LoginViewModel) {
    val username = viewModel.getUsername()

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.TopCenter
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Spacer(modifier = Modifier.height(30.dp))
            Text(text = generateGreetingMessage(username),
                style = TextStyle(
                    fontSize =25.sp,
                    fontWeight = FontWeight.Bold
                ))

        }
    }
}

private fun generateGreetingMessage(username: String): String {
    val currentHour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY)
    val greeting = when (currentHour) {
        in 0..11 -> "Good Morning"
        in 12..17 -> "Good Afternoon"
        else -> "Good Evening"
    }
    return "$greeting, $username!"
}
