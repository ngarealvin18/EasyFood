package com.alvin.easyfood.ui.theme.Screens.products

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.alvin.easyfood.R

@Composable
fun FoodScreen(navController: NavHostController) {

    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            FoodScreen(
                imagePainter = painterResource(id = R.drawable.bacon_and_cheese_heaven),
                title = "bacon_and_cheese_heaven",
                price = "500",

                )
        }
        item {
            FoodScreen(
                imagePainter = painterResource(id = R.drawable.bacon_wrapped_filet_mignon),
                title = "bacon_wrapped_filet_mignon",
                price = "300",

                )
        }
        item {
            FoodScreen(
                imagePainter = painterResource(id = R.drawable.bbq_chicken_delight),
                title = "BBQ ChickenDelight",
                price = "800",

                )
        }
        item {
            FoodScreen(
                imagePainter = painterResource(id = R.drawable.bbq_ranch_delight),
                title = "BBQ RanchDelight",
                price = "600",

                )
        }
        item {
            FoodScreen(
                imagePainter = painterResource(id = R.drawable.beef_stir_fry_with_broccoli),
                title = "BeefFry with Broccoli",
                price = "250",

                )
        }

        item {
            FoodScreen(
                imagePainter = painterResource(id = R.drawable.california_roll),
                title = "California ROll",
                price = "100",

                )
        }
        item {
            FoodScreen(
                imagePainter = painterResource(id = R.drawable.chicago_style_hot_dog),
                title = "ChicagoStyle Hotdog",
                price = "150",

                )
        }
        item {
            FoodScreen(
                imagePainter = painterResource(id = R.drawable.chicken_avocado_bliss),
                title = "Chicken AvocadoBliss",
                price = "200",

                )
        }
        item {
            FoodScreen(
                imagePainter = painterResource(id = R.drawable.chili_cheese_dog),
                title = "Chili CheeseDog",
                price = "150",

                )
        }
        item {
            FoodScreen(
                imagePainter = painterResource(id = R.drawable.classic_beef_burger),
                title = "Classic BeefBurger",
                price = "200",

                )
        }
        item {
            FoodScreen(
                imagePainter = painterResource(id = R.drawable.classic_beef_hot_dog),
                title = "Classic Beef Hotdog",
                price = "150",

                )
        }
        item {
            FoodScreen(
                imagePainter = painterResource(id = R.drawable.dragon_roll),
                title = "Dragon Roll",
                price = "100",

                )
        }
        item {
            FoodScreen(
                imagePainter = painterResource(id = R.drawable.four_cheese_delight),
                title = "Four CheeseDelight",
                price = "50",

                )
        }
        item {
            FoodScreen(
                imagePainter = painterResource(id = R.drawable.garlic_parmesan_chicken),
                title = "Garlic ParmesanChicken",
                price = "500",

                )
        }
        item {
            FoodScreen(
                imagePainter = painterResource(id = R.drawable.grilled_ribeye_steak),
                title = "Grilled RibeyeSteak",
                price = "300",

                )
        }
        item {
            FoodScreen(
                imagePainter = painterResource(id = R.drawable.hawaiian_bbq_dog),
                title = "Hawaiian BBgDg",
                price = "250",

                )
        }
        item {
            FoodScreen(
                imagePainter = painterResource(id = R.drawable.hawaiian_paradise),
                title = "Hawaiian Paradise",
                price = "500",

                )
        }
        item {
            FoodScreen(
                imagePainter = painterResource(id = R.drawable.honey_mustard_glazed_tenders),
                title = "HoneyMustard GlazedTenders",
                price = "150",

                )
        }
        item {
            FoodScreen(
                imagePainter = painterResource(id = R.drawable.kimchi_hot_dog),
                title = "Kimich HotDog",
                price = "100",

                )
        }
        item {
            FoodScreen(
                imagePainter = painterResource(id = R.drawable.korean_bbq_short_ribs),
                title = "Korean BBG ShortRibs",
                price = "200",

                )
        }
        item {
            FoodScreen(
                imagePainter = painterResource(id = R.drawable.korean_fried_chicken),
                title = "Korean FriedChicken",
                price = "200",

                )
        }
        item {
            FoodScreen(
                imagePainter = painterResource(id = R.drawable.lemon_pepper_chicken),
                title = "Lemon Pepper Chicken",
                price = "200",

                )
        }
        item {
            FoodScreen(
                imagePainter = painterResource(id = R.drawable.margherita),
                title = "Margherita",
                price = "400",

                )
        }
        item {
            FoodScreen(
                imagePainter = painterResource(id = R.drawable.margherita_flatbread),
                title = "Margherita Flatbread",
                price = "300",

                )
        }
        item {
            FoodScreen(
                imagePainter = painterResource(id = R.drawable.meat_feast_pizza),
                title = "MeatFeast Pizza",
                price = "800",

                )
        }
        item {
            FoodScreen(
                imagePainter = painterResource(id = R.drawable.mediterranean_joy),
                title = "Mediterranean Joy",
                price = "400",

                )
        }
        item {
            FoodScreen(
                imagePainter = painterResource(id = R.drawable.mushroom_swiss_delight),
                title = "Mushroom SwissDelight",
                price = "400",

                )
        }
        item {
            FoodScreen(
                imagePainter = painterResource(id = R.drawable.original_crispy_chicken),
                title = "Original CripsyChicken",
                price = "300",

                )
        }
        item {
            FoodScreen(
                imagePainter = painterResource(id = R.drawable.pan_seared_garlic_butter_sirloin),
                title = "Garlic Butter Sirloin",
                price = "200",

                )
        }
        item {
            FoodScreen(
                imagePainter = painterResource(id = R.drawable.pasta_carbonara),
                title = "Pasta Carbonara",
                price = "100",

                )
        }
        item {
            FoodScreen(
                imagePainter = painterResource(id = R.drawable.pepperoni_lovers),
                title = "Pepperoni lovers",
                price = "600",

                )
        }
        item {
            FoodScreen(
                imagePainter = painterResource(id = R.drawable.pretzel_bun_dog),
                title = "Pretzel BunDog",
                price = "100",

                )
        }
        item {
            FoodScreen(
                imagePainter = painterResource(id = R.drawable.quinoa_salad_bowl),
                title = "QuinoaSalad Bowl",
                price = "100",

                )
        }
        item {
            FoodScreen(
                imagePainter = painterResource(id = R.drawable.rainbow_roll),
                title = "Rainbow ROll",
                price = "100",

                )
        }
        item {
            FoodScreen(
                imagePainter = painterResource(id = R.drawable.reuben_style_hotdog),
                title = "ReubenStyle Hotdog",
                price = "100",

                )
        }
        item {
            FoodScreen(
                imagePainter = painterResource(id = R.drawable.salmon_nigiri),
                title = "bacon_wrapped_filet_mignon",
                price = "100",

                )
        }
        item {
            FoodScreen(
                imagePainter = painterResource(id = R.drawable.sashimi_platter),
                title = "Sashimi Platter",
                price = "100",

                )
        }
        item {
            FoodScreen(
                imagePainter = painterResource(id = R.drawable.shrimp_scampi),
                title = "Shrimp Scampi",
                price = "100",

                )
        }


        item {
            FoodScreen(
                imagePainter = painterResource(id = R.drawable.smoked_bbq_brisket),
                title = "Smoked BBQ Brisket",
                price = "100",

                )
        }
        item {
            FoodScreen(
                imagePainter = painterResource(id = R.drawable.southern_style_chicken_biscuit),
                title = "SouthernStyle ChickenBiscuit",
                price = "100",

                )
        }
        item {
            FoodScreen(
                imagePainter = painterResource(id = R.drawable.spicy_buffalo_wings),
                title = "Spicy BufalloWings",
                price = "100",

                )
        }
        item {
            FoodScreen(
                imagePainter = painterResource(id = R.drawable.spicy_jalapeno_burger),
                title = "Spicy Jalapeno Burger",
                price = "100",

                )
        }
        item {
            FoodScreen(
                imagePainter = painterResource(id = R.drawable.spicy_moroccan_lamb_chops),
                title = "Spicy Morocan LambChops",
                price = "100",

                )
        }
        item {
            FoodScreen(
                imagePainter = painterResource(id = R.drawable.spicy_tuna_roll),
                title = "Spicy TunaRoll",
                price = "100",

                )
        }
        item {
            FoodScreen(
                imagePainter = painterResource(id = R.drawable.spinach_and_feta_stuffed_chicken),
                title = "Spinach & Feta Chicken",
                price = "100",

                )
        }
        item {
            FoodScreen(
                imagePainter = painterResource(id = R.drawable.stuffed_bell_peppers_with_ground_turkey),
                title = "BellPeppers & Ground.Turkey",
                price = "100",

                )
        }
        item {
            FoodScreen(
                imagePainter = painterResource(id = R.drawable.tempura_shrimp_roll),
                title = "Tempura ShrimpRoll",
                price = "100",

                )
        }
        item {
            FoodScreen(
                imagePainter = painterResource(id = R.drawable.teriyaki_chicken_wings),
                title = "Teriyaki ChickenWings",
                price = "100",

                )
        }
        item {
            FoodScreen(
                imagePainter = painterResource(id = R.drawable.teriyaki_glazed_chicken_thighs),
                title = "bacon_wrapped_filet_mignon",
                price = "100",

                )
        }
        item {
            FoodScreen(
                imagePainter = painterResource(id = R.drawable.teriyaki_pineapple_pleasure),
                title = "Teriyaki PineapplePleasure",
                price = "100",

                )
        }
        item {
            FoodScreen(
                imagePainter = painterResource(id = R.drawable.thai_red_curry),
                title = "Thai RedCurry",
                price = "100",

                )
        }
        item {
            FoodScreen(
                imagePainter = painterResource(id = R.drawable.vegetarian_pad_thai),
                title = "Vegeterian PadThai",
                price = "100",

                )
        }
        item {
            FoodScreen(
                imagePainter = painterResource(id = R.drawable.veggie_dog_with_sauerkraut),
                title = "VegieDog Sauerkraut",
                price = "100",

                )
        }
        item {
            FoodScreen(
                imagePainter = painterResource(id = R.drawable.veggie_extravaganza),
                title = "Veggie Extravaganza",
                price = "100",

                )
        }
        item {
            FoodScreen(
                imagePainter = painterResource(id = R.drawable.veggie_roll),
                title = "Veggie Roll",
                price = "100",

                )
        }
        item {
            FoodScreen(
                imagePainter = painterResource(id = R.drawable.veggie_supreme),
                title = "Veggie Supreme",
                price = "100",

                )
        }

    }
}

@Composable
fun FoodScreen(
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
                    .fillMaxHeight()
                    .fillMaxSize()
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
    FoodScreen(rememberNavController())


}