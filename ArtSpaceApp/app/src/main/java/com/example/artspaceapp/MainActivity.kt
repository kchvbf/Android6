package com.example.artspaceapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
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
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artspaceapp.ui.theme.ArtSpaceAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtSpaceAppTheme {
                ArtSpaceAppLayout()
            }
        }
    }
}

@Composable
fun ArtSpaceAppLayout() {
    var step by remember { mutableStateOf(1) }

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        color = Color(0xFF2F4F4F)
    ) {
        when (step) {

            1 -> {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(20.dp)
                ) {
                    PhotoPanel(
                        resourceDrawable = R.drawable.photo1,
                        contentDescription = R.string.photo_content_desc
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    PhotoDesc(
                        name = R.string.photo1_label,
                        photographer = R.string.author,
                        data = R.string.year
                    )
                    Spacer(modifier = Modifier.height(30.dp))
                    BtnRow(
                        onBackBtnClick = { step = 9 },
                        onNextBtnClick = { step = 2 }
                    )
                }
            }


            2 -> {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(20.dp)
                ) {
                    PhotoPanel(
                        resourceDrawable = R.drawable.photo2,
                        contentDescription = R.string.photo_content_desc
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    PhotoDesc(
                        name = R.string.photo2_label,
                        photographer = R.string.author,
                        data = R.string.year
                    )
                    Spacer(modifier = Modifier.height(30.dp))
                    BtnRow(
                        onBackBtnClick = { step = 1 },
                        onNextBtnClick = { step = 3 })
                }
            }

            3 -> {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(20.dp)
                ) {
                    PhotoPanel(
                        resourceDrawable = R.drawable.photo3,
                        contentDescription = R.string.photo_content_desc
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    PhotoDesc(
                        name = R.string.photo3_label,
                        photographer = R.string.author,
                        data = R.string.year
                    )
                    Spacer(modifier = Modifier.height(30.dp))
                    BtnRow(
                        onBackBtnClick = { step = 2 },
                        onNextBtnClick = { step = 4 })
                }
            }

            4 -> {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(20.dp)
                ) {
                    PhotoPanel(
                        resourceDrawable = R.drawable.photo4,
                        contentDescription = R.string.photo_content_desc
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    PhotoDesc(
                        name = R.string.photo4_label,
                        photographer = R.string.author,
                        data = R.string.year
                    )
                    Spacer(modifier = Modifier.height(30.dp))
                    BtnRow(
                        onBackBtnClick = { step = 3 },
                        onNextBtnClick = { step = 5 })
                }
            }

            5 -> {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(20.dp)
                ) {
                    PhotoPanel(
                        resourceDrawable = R.drawable.photo5,
                        contentDescription = R.string.photo_content_desc
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    PhotoDesc(
                        name = R.string.photo5_label,
                        photographer = R.string.author,
                        data = R.string.year
                    )
                    Spacer(modifier = Modifier.height(30.dp))
                    BtnRow(
                        onBackBtnClick = { step = 4 },
                        onNextBtnClick = { step = 6 })
                }
            }

            6 -> {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(20.dp)
                ) {
                    PhotoPanel(
                        resourceDrawable = R.drawable.photo6,
                        contentDescription = R.string.photo_content_desc
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    PhotoDesc(
                        name = R.string.photo6_label,
                        photographer = R.string.author,
                        data = R.string.year
                    )
                    Spacer(modifier = Modifier.height(30.dp))
                    BtnRow(
                        onBackBtnClick = { step = 5 },
                        onNextBtnClick = { step = 7 })
                }
            }

            7 -> {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(20.dp)
                ) {
                    PhotoPanel(
                        resourceDrawable = R.drawable.photo7,
                        contentDescription = R.string.photo_content_desc
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    PhotoDesc(
                        name = R.string.photo7_label,
                        photographer = R.string.author,
                        data = R.string.year
                    )
                    Spacer(modifier = Modifier.height(30.dp))
                    BtnRow(
                        onBackBtnClick = { step = 6 },
                        onNextBtnClick = { step = 8 })
                }
            }

            8 -> {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(20.dp)
                ) {
                    PhotoPanel(
                        resourceDrawable = R.drawable.photo8,
                        contentDescription = R.string.photo_content_desc
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    PhotoDesc(
                        name = R.string.photo8_label,
                        photographer = R.string.author,
                        data = R.string.year
                    )
                    Spacer(modifier = Modifier.height(30.dp))
                    BtnRow(
                        onBackBtnClick = { step = 7 },
                        onNextBtnClick = { step = 9 })
                }
            }

            9 -> {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(20.dp)
                ) {
                    PhotoPanel(
                        resourceDrawable = R.drawable.photo9,
                        contentDescription = R.string.photo_content_desc
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    PhotoDesc(
                        name = R.string.photo9_label,
                        photographer = R.string.author,
                        data = R.string.year
                    )
                    Spacer(modifier = Modifier.height(30.dp))
                    BtnRow(
                        onBackBtnClick = { step = 8 },
                        onNextBtnClick = { step = 1 })
                }
            }


        }
    }
}


@Composable
fun PhotoPanel(
    resourceDrawable: Int,
    contentDescription: Int
) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(455.dp)
            .border(BorderStroke(3.dp, Color(0xFFC0C0C0))
            ),
        color = Color(0xFFFA8072),
        shadowElevation = 50.dp
    ) {
        Image(
            painter = painterResource(resourceDrawable),
            contentDescription = stringResource(contentDescription),
            modifier = Modifier
                .padding(20.dp)
        )
    }
}

@Composable
fun PhotoDesc(
    data: Int,
    name: Int,
    photographer: Int
) {

    Surface(
        shadowElevation = 50.dp,
        color = Color(0xFFC0C0C0),
        shape = RoundedCornerShape(100.dp)
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(name),
                fontSize = 20.sp,
                color = Color.Black
            )
            Text(
                text = stringResource(photographer),
                fontSize = 20.sp,
                color = Color.Black

            )
            Text(
                text = stringResource(data),
                fontSize = 20.sp,
                color = Color.Black
            )
        }
    }
}

@Composable
fun BtnRow(
    onBackBtnClick: () -> Unit,
    onNextBtnClick: () -> Unit
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.SpaceEvenly,
    ) {
        Button(
            onClick = onBackBtnClick,
            shape = RectangleShape,
            colors = ButtonDefaults.buttonColors(Color(0xFFD2691E)),
        ) {
            Text(
                text = stringResource(R.string.back_btn_text),
                fontSize = 18.sp,
                color = Color(0xFFFFE4E1),
                textAlign = TextAlign.Center,
                modifier = Modifier.height(25.dp).width(50.dp),
            )
        }
        Button(
            onClick = onNextBtnClick,
            shape = RectangleShape,
            colors = ButtonDefaults.buttonColors(Color(0xFFD2691E)),
        ) {
            Text(
                text = stringResource(id = R.string.next_btn_text),
                fontSize = 18.sp,
                color = Color(0xFFFFE4E1),
                textAlign = TextAlign.Center,
                modifier = Modifier.height(25.dp).width(50.dp),
            )
        }
    }
}

@Preview
@Composable
fun ArtSpaceAppPreview() {
    ArtSpaceAppTheme {
        ArtSpaceAppLayout()
    }
}