package com.alvin.easyfood.ui.theme.Screens.products

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
import com.main.easyfood.navigation.ROUTE_DRINKS
import com.main.easyfood.navigation.ROUTE_FOOD
import com.main.easyfood.navigation.ROUTE_FRUIT


@Composable
fun MainScreen (navController: NavHostController) {
    Column(
        modifier = Modifier

            .fillMaxSize()
            .paint(
                painterResource(id = R.drawable.bacon_and_cheese_heaven),
                contentScale = ContentScale.FillBounds
            ),
        horizontalAlignment = Alignment.CenterHorizontally) {

        Text(
            text = "",
            color = Color.Green,
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.Bold,
            fontSize = 50.sp
        )

        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = "WELCOME TO EASY FOOD",
            color = Color.Green,
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Below are Categories Of Our Items ",
            color = Color.Green,
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )
        Spacer(modifier = Modifier.height(100.dp))
        Button(onClick = {
            navController.navigate(ROUTE_FOOD)
        }, modifier = Modifier.fillMaxWidth()) {
            Text(
                text = "Foods",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp
            )
        }
        Spacer(modifier = Modifier.height(100.dp))
        Button(onClick = {
            navController.navigate(ROUTE_DRINKS)
        }, modifier = Modifier.fillMaxWidth()) {
            Text(
                text = "Drinks",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp
            )
        }
        Spacer(modifier = Modifier.height(100.dp))
        Button(onClick = {
            navController.navigate(ROUTE_FRUIT)
        }, modifier = Modifier.fillMaxWidth()) {
            Text(
                text = "Fruits",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp
            )
        }
    }


}


@Preview
@Composable
private fun MainScreenPrev() {
    MainScreen(rememberNavController())

}
