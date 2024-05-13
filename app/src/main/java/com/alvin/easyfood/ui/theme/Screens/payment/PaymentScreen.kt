package com.alvin.easyfood.ui.theme.Screens.payment

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.alvin.easyfood.R
import com.main.easyfood.navigation.ROUTE_MAIN

@Composable
fun PaymentScreen(navController :NavHostController) {
    Column(
    modifier = Modifier

        .fillMaxSize()
        .paint(
            painterResource(id = R.drawable.white),
            contentScale = ContentScale.FillBounds
        ),
    horizontalAlignment = Alignment.CenterHorizontally) {

    Text(
        text = "Thankyou for shopping with us",
        color = Color.Green,
        fontFamily = FontFamily.Cursive,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    )
        Text(
            text = "Your payment is Succesful processed",
            color = Color.Green,
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )

}
    Spacer(modifier = Modifier.height(400.dp))
    Button(onClick = {
        navController.navigate(ROUTE_MAIN)
    }, modifier = Modifier.fillMaxWidth()) {
        Text(
            text = "Go back",
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp
        )
    }
    }


@Preview
@Composable
private fun PaymentScreenPrev() {
    PaymentScreen(rememberNavController())

}