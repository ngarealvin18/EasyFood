package com.alvin.easyfood.ui.theme.Screens.products

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.alvin.easyfood.R

@Composable
fun DrinkScreen(navController: NavHostController) {
    Text(text = "A Good Combination",
        textAlign = TextAlign.Center,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp,
    )
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            DrinkScreen(
                imagePainter = painterResource(id = R.drawable.coconut_water),
                title = "bacon_and_cheese_heaven",
                price = "500",

                )
        }
        item {
            DrinkScreen(
                imagePainter = painterResource(id = R.drawable.drinks),
                title = "Mixed Fruits",
                price = "100",


                )
        }
        item {
            DrinkScreen(
                imagePainter = painterResource(id = R.drawable.mint_lemonade),
                title = "bacon_and_cheese_heaven",
                price = "100",

                )
        }
        item {
            DrinkScreen(
                imagePainter = painterResource(id = R.drawable.green_tea_latte),
                title = "bacon_and_cheese_heaven",
                price = "150",

                )

        }
        item {
            DrinkScreen(
                imagePainter = painterResource(id = R.drawable.berry_blast_smoothie),
                title = "BerryBlast Smothie",
                price = "300",

                )
        }
        item {
            DrinkScreen(
                imagePainter = painterResource(id = R.drawable.mango_tango_slush),
                title = "Mango Slush",
                price = "100",

                )
        }
        item {
            DrinkScreen(
                imagePainter = painterResource(id = R.drawable.espresso_martini),
                title = "Espresso martini",
                price = "250",

                )
        }
        item {
            DrinkScreen(
                imagePainter = painterResource(id = R.drawable.gin_cocktail),
                title = "Gin Cocktail",
                price = "250",

                )
        }
        item {
            DrinkScreen(
                imagePainter = painterResource(id = R.drawable.fresh_orange_juice),
                title = "Orange Juice",
                price = "100",

                )
        }
        item {
            DrinkScreen(
                imagePainter = painterResource(id = R.drawable.craftsoftdrink),
                title = "Craft Soft Drink",
                price = "200",

                )
        }
        item {
            DrinkScreen(
                imagePainter = painterResource(id = R.drawable.redbull),
                title = "RedBull",
                price = "300",

                )
        }



    }
}

@Composable
fun DrinkScreen(
    title: String = "",
    price: String = "",
    imagePainter: Painter
) {
    Card(
        Modifier
            .fillMaxWidth()
            .width(160.dp)
    ) {
        Column(
            Modifier
                .padding(bottom = 32.dp)
        ) {
            Image(
                painter = imagePainter, contentDescription = "",
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(1f),
                contentScale = ContentScale.Fit
            )
            Column(
                Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp)
            ) {
                Text(text = title, fontWeight = FontWeight.Bold)
                Row {
                    Text(
                        "Kes ${price}"
                    )


                }
                Spacer(modifier = Modifier.height(8.dp))
                // A button
                Button(
                    onClick = {/* navigated page*/ },
                    modifier = Modifier.align(Alignment.End)
                ) {
                    Text("Buy This - Kes $price")
                }
            }
        }
    }
}



@Preview
@Composable
private fun FoodScreenPrev() {
    DrinkScreen(rememberNavController())


}