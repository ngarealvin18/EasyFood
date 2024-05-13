package com.main.easyfood.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.alvin.easyfood.ui.theme.Screens.payment.PaymentScreen
import com.alvin.easyfood.ui.theme.Screens.products.DrinkScreen
import com.alvin.easyfood.ui.theme.Screens.products.FoodScreen
import com.alvin.easyfood.ui.theme.Screens.products.FruitScreen
import com.alvin.easyfood.ui.theme.Screens.products.MainScreen
import com.main.easyfood.ui.theme.Screens.home.HomeScreen
import com.main.easyfood.ui.theme.Screens.login.LoginScreen
import com.main.easyfood.ui.theme.Screens.register.RegisterScreen
import com.main.easyfood.ui.theme.Screens.splash.SplashScreen

@Composable
fun AppNavHost(modifier: Modifier = Modifier,
               navController: NavHostController= rememberNavController(),
               startDestination:String= ROUTE_REGISTER)
{
    NavHost(navController = navController,modifier=modifier, startDestination =startDestination )
    {
        composable(ROUTE_LOGIN){
            LoginScreen(navController)
        }
        composable(ROUTE_REGISTER){
            RegisterScreen(navController)
        }
        composable(ROUTE_HOME){
            HomeScreen(navController)
        }
        composable(ROUTE_SPLASH){
            SplashScreen(navController)
        }
        composable(ROUTE_MAIN){
            MainScreen(navController)
        }
        composable(ROUTE_DRINKS){
            DrinkScreen(navController)
        }
        composable(ROUTE_FOOD){
            FoodScreen(navController)
        }
        composable(ROUTE_FRUIT){
            FruitScreen(navController)
        }
        composable(ROUTE_PAY){
            PaymentScreen(navController)
        }

        }
    }

