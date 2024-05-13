package com.main.easyfood.ui.theme.Screens.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.alvin.easyfood.data.AuthViewModel
import com.main.easyfood.navigation.ROUTE_REGISTER


@Composable
fun LoginScreen(navController:NavHostController) {

    var email by remember { mutableStateOf(TextFieldValue("")) }
    var pass by remember { mutableStateOf(TextFieldValue("")) }
    var context= LocalContext.current
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally) {

        Spacer(modifier = Modifier.height(50.dp))

//        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
//            val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.animation))
//            val progress by animateLottieCompositionAsState(composition)
//            LottieAnimation(composition,progress,
//                modifier=Modifier.size(450.dp))
//        }

        OutlinedTextField(
            value =email ,
            onValueChange = {email=it},
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "Email")},
            label = { Text(text = "Enter Email",
                color = Color.White,
                fontWeight = FontWeight.Bold
            ) },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),

            )
        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value =pass ,
            onValueChange = {pass=it},
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "Password")},
            label = { Text(text = "Enter Password",
                color = Color.White,
                fontWeight= FontWeight.Bold) },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {
            val mylogin= AuthViewModel(navController, context )
            mylogin.login(email.text.trim(),pass.text.trim())
        }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Log In")
        }
        Spacer(modifier = Modifier.height(20.dp))

        TextButton(onClick = {
            navController.navigate(ROUTE_REGISTER)
        }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "Don't have account? Click to Register",
                textAlign = TextAlign.End,
                color = Color.White,
                fontWeight = FontWeight.Bold)
        }

    }


}
@Preview
@Composable
fun Loginpage() {
    LoginScreen(rememberNavController())
}