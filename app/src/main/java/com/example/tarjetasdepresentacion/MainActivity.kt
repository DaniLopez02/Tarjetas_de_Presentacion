package com.example.tarjetasdepresentacion

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType.Companion.Uri
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tarjetasdepresentacion.ui.theme.TarjetasDePresentacionTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TarjetasDePresentacionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    fondo()
                }
            }
        }
    }
}

@Composable
fun fondo(modifier: Modifier = Modifier) {
    val contacto = painterResource(R.drawable.contactos)
    val fondo1 = painterResource(R.drawable._1716dbf_151f_472d_a2ef_98fde8107690)
    val localUriHandler = LocalUriHandler.current
    Box {
        Image(
            painter = fondo1,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.9F,
            modifier = Modifier.fillMaxSize()
        )
        Column(modifier = Modifier.padding(top = 100.dp),
            horizontalAlignment = Alignment.CenterHorizontally ) {
            //Primer cuadrado 
            Row(modifier = modifier.padding(start = 20.dp)) {
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = stringResource(R.string.Nombre),
                        textAlign = TextAlign.Start,
                        fontWeight = FontWeight.Bold,
                        fontSize = 25.sp,
                        //modifier = Modifier.padding(top = 20.dp)
                    )
                    Text(
                        text = stringResource(R.string.Titulo2),
                        textAlign = TextAlign.Start,
                        fontWeight = FontWeight.Bold,
                        fontStyle = FontStyle.Italic,
                        fontSize = 20.sp,
                        modifier = Modifier.padding(top = 20.dp)
                    )
                }
                Image(
                    painter = contacto,
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .padding(end = 20.dp)
                        .weight(1f)
                        .clip(RoundedCornerShape(40.dp))
                )
            }
            //Este colum es la parte de abajo
            Column(modifier = Modifier
                .fillMaxWidth()
                .padding(top = 40.dp)) {
               Row(
                   Modifier
                       .fillMaxWidth(1F)
                       .padding(25.dp)
                       .height(40.dp)
                       .clip(RoundedCornerShape(40.dp))
                       .background(Color(238, 130, 238))){
                   Icon(
                       Icons.Rounded.Call,
                       contentDescription = null,
                       modifier = Modifier
                           .size(50.dp)
                           .clip(RoundedCornerShape(16.dp))
                   )
                   Text(text = "+34 695666689",
                       modifier = Modifier
                           .fillMaxSize()
                           .padding(start = 20.dp),
                       textAlign = TextAlign.Center,
                       fontSize = 25.sp)
               }
                Row(
                    Modifier
                        .fillMaxWidth(1F)
                        .padding(25.dp)
                        .height(40.dp)
                        .clip(RoundedCornerShape(40.dp))
                        .background(Color(238, 130, 238))){
                    Icon(
                        Icons.Rounded.Email,
                        contentDescription = null,
                        modifier = Modifier
                            .size(50.dp)
                            .clip(RoundedCornerShape(16.dp))
                    )
                    Text(text = "Daniel.lg@gmail.com",
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(start = 20.dp),
                        textAlign = TextAlign.Center,
                        fontSize = 25.sp)
                }
                Row(
                    Modifier
                        .fillMaxWidth(1F)
                        .padding(25.dp)
                        .height(40.dp)
                        .clip(RoundedCornerShape(40.dp))
                        .background(Color(238, 130, 238))){
                    Icon(
                        Icons.Rounded.Home,
                        contentDescription = null,
                        modifier = Modifier
                            .size(50.dp)
                            .clip(RoundedCornerShape(16.dp))
                    )
                    Text(text = "Virgen de la Paloma",
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(start = 20.dp),
                        textAlign = TextAlign.Center,
                        fontSize = 25.sp)
                }

            }
            //Metemos el boton que lleve al enlace de github
            Button(onClick =  {
                localUriHandler.openUri("https://github.com/DaniLopez02")
            },
                modifier = Modifier
                    .padding(top = 40.dp)
                    .width(150.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(238, 130, 238),
                    contentColor = Color.Black
                )
            ){
                Text(text = "Link GitHub")
            }
            Row (
                Modifier
                    .fillMaxSize()
                    .padding(35.dp)
                    .weight(1f),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center)
            {
                Icon(
                    Icons.Rounded.Share,
                    contentDescription = null,
                    modifier = Modifier
                        .size(50.dp)
                        .weight(1f)
                )
                Icon(
                    Icons.Rounded.Add,
                    contentDescription = null,
                    modifier = Modifier
                        .size(80.dp)
                        .weight(1f)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TarjetasDePresentacionTheme {
        fondo()
    }
}