package com.example.lemonadeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lemonadeapp.ui.theme.LemonadeAppTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LemonadeAppTheme() {
                LemonadeApp()
            }
        }
    }
}

@Composable
fun LemonadeApp() {
    var clickCount by remember { mutableStateOf(0) }
    var step by remember { mutableStateOf(1) }

    Column(

    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(45.dp).background(Color(0xFFE6E6FA)),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.End,
        ) {
            Text(
                text = stringResource(R.string.title),
                fontStyle = FontStyle.Italic,
                fontSize = 20.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(vertical = 10.dp, horizontal = 10.dp),

                )

        }


        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color(0xFFFFFFE0)
        ) {
            when (step) {
                1 -> {
                    LemonTextAndImage(
                        contentDesc = R.string.lemon_tree_desc,
                        img = R.drawable.lemon_tree,
                        text = R.string.lemon_tree,
                        onBtnClick = {
                            step = 2
                            clickCount = (2..4).random()
                        }
                    )
                }

                2 -> {
                    LemonTextAndImage(
                        contentDesc = R.string.lemon_desc,
                        img = R.drawable.lemon_squeeze,
                        text = R.string.lemon_squeeze,
                        onBtnClick = {
                            clickCount--
                            if (clickCount == 0) {
                                step = 3
                            }
                        }
                    )
                }

                3 -> {
                    LemonTextAndImage(
                        contentDesc = R.string.glass_of_lemonade_desc,
                        img = R.drawable.lemon_drink,
                        text = R.string.lemon_drink,
                        onBtnClick = {
                            step = 4
                        }
                    )
                }

                4 -> {
                    LemonTextAndImage(
                        contentDesc = R.string.empty_glass_desc,
                        img = R.drawable.lemon_restart,
                        text = R.string.lemon_restart,
                        onBtnClick = {
                            step = 1
                        }
                    )
                }
            }
        }



    }


}




@Composable
fun LemonTextAndImage(
    contentDesc: Int,
    img: Int,

    text: Int,
    onBtnClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize().padding(bottom = 175.dp)
        ) {
            Text(
                text = stringResource(text),
                fontSize = 20.sp
            )
            Spacer(modifier = Modifier.padding(bottom = 30.dp))
            Button(
                onClick = onBtnClick,
                colors = ButtonDefaults.buttonColors(Color(0xFFBC8F8F)),
                shape = RoundedCornerShape(100.dp)
            ) {
                Image(
                    painter = painterResource(img),
                    contentDescription = stringResource(contentDesc),
                )
            }



        }
    }
}


@Preview
@Composable
fun LemonPreview() {
    LemonadeAppTheme() {
        LemonadeApp()
    }
}