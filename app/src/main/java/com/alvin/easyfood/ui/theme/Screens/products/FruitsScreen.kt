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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.outlined.DateRange
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
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
fun FruitScreen(navController: NavHostController) {

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
            FruitScreen(
                imagePainter = painterResource(id = R.drawable.banana),
                title = "Banana",
                price = "50",

                )
        }
        item {
            FruitScreen(
                imagePainter = painterResource(id = R.drawable.blueberry),
                title = "Blue Berry",
                price = "100",

                )

        }
        item {
            FruitScreen(
                imagePainter = painterResource(id = R.drawable.strawberries),
                title = "Strawberry",
                price = "50",

                )
        }
        item {
            FruitScreen(
                imagePainter = painterResource(id = R.drawable.grapes),
                title = "Grapes",
                price = "70",

                )

        }
        item {
            FruitScreen(
                imagePainter = painterResource(id = R.drawable.mangoes),
                title = "Mamgo",
                price = "30",

                )
        }
        item {
            FruitScreen(
                imagePainter = painterResource(id = R.drawable.orange),
                title = "Orange",
                price = "30",

                )
        }
        item {
            FruitScreen(
                imagePainter = painterResource(id = R.drawable.plum),
                title = "Plum",
                price = "100",

                )
        }
        item {
            FruitScreen(
                imagePainter = painterResource(id = R.drawable.watermelon),
                title = "Water Melon",
                price = "50",

                )
        }

    }
}

@Composable
fun FruitScreen(
    title: String = "",
    price: String = "",
    discountPercent: Int = 0,
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
    FruitScreen(rememberNavController())


}

