//package eu.tutorials.actouchcontrol
//
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.Canvas
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.size
//import androidx.compose.foundation.layout.width
//import androidx.compose.foundation.shape.CircleShape
//import androidx.compose.material3.Button
//import androidx.compose.material3.ButtonDefaults
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.runtime.setValue
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.graphics.StrokeCap
//import androidx.compose.ui.graphics.drawscope.Stroke
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            MaterialTheme {
//                ACTouchControlUI()
//            }
//        }
//    }
//}
//
//@Composable
//fun ACTouchControlUI() {
//    var temperature by remember { mutableStateOf(29) }
//
//    // Background color: dark navy blue
//    Box(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(Color(0xFF001F3F)) // Dark navy blue
//    ) {
//        Column(
//            modifier = Modifier.fillMaxSize(),
//            verticalArrangement = Arrangement.Center,
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//            // AQI display (e.g., "AQI 50")
//            Text(
//                text = "AQI 50",
//                fontSize = 30.sp,
//                color = Color(0xFF00FF00),
//                modifier = Modifier.padding(bottom = 45.dp)
//            )
//
//            // Row to hold the circular temperature display and +/- buttons
//            Row(
//                modifier = Modifier.fillMaxWidth(),
//                horizontalArrangement = Arrangement.Center,
//                verticalAlignment = Alignment.CenterVertically
//            ) {
//                // Minus button
//                Button(
//                    onClick = {
//                        if (temperature > 16) temperature--
//                    },
//                    colors = ButtonDefaults.buttonColors(
//                        containerColor = Color(0xFF007BFF), // Blue color
//                        contentColor = Color.White
//                    ),
//                    modifier = Modifier
//                        .size(60.dp)
//                        .clip(CircleShape)
//                ) {
//                    Text(text = "-", fontSize = 30.sp)
//                }
//
//                Spacer(modifier = Modifier.width(40.dp))
//
//                // Circular temperature display with dynamic blue progress
//                CircularTemperatureDisplay(temperature)
//
//                Spacer(modifier = Modifier.width(40.dp))
//
//                // Plus button
//                Button(
//                    onClick = {
//                        if (temperature < 32) temperature++
//                    },
//                    colors = ButtonDefaults.buttonColors(
//                        containerColor = Color(0xFF007BFF), // Blue color
//                        contentColor = Color.White
//                    ),
//                    modifier = Modifier
//                        .size(60.dp)
//                        .clip(CircleShape)
//                ) {
//                    Text(text = "+", fontSize = 30.sp)
//                }
//            }
//        }
//        // Title at the top, centered horizontally
//        Box(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(top = 16.dp), // Adjust padding to move the title close to the top
//            contentAlignment = Alignment.TopCenter // Align at the top center
//        ) {
//            Text(
//                text = "AC Touch Control",
//                fontSize = 36.sp,
//                color = Color.White
//            )
//        }
//
//    }
//}
//
//@Composable
//fun CircularTemperatureDisplay(temperature: Int) {
//    Box(
//        contentAlignment = Alignment.Center,
//        modifier = Modifier.size(200.dp)
//    ) {
//        // Calculate sweep angle based on temperature range (16 to 32)
//        val sweepAngleBlue = ((temperature - 16) / 16f) * 360f
//
//        // Black part of the ring (full circle)
//        Canvas(modifier = Modifier.size(200.dp)) {
//            drawArc(
//                color = Color.Black,
//                startAngle = -90f, // Starting from the top
//                sweepAngle = 360f, // Full circle as the background
//                useCenter = false,
//                style = Stroke(
//                    width = 10.dp.toPx(),
//                    cap = StrokeCap.Round
//                )
//            )
//
//            // Blue part of the ring (dynamic based on temperature)
//            drawArc(
//                color = Color.Blue,
//                startAngle = -90f, // Starting from the top
//                sweepAngle = sweepAngleBlue, // Dynamically change the sweep angle
//                useCenter = false,
//                style = Stroke(
//                    width = 10.dp.toPx(),
//                    cap = StrokeCap.Round
//                )
//            )
//        }
//
//        // Temperature text
//        Text(
//            text = "$temperature°",
//            fontSize = 48.sp,
//            color = Color.White
//        )
//    }
//}


package eu.tutorials.actouchcontrol

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.layout.weight
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                ACTouchControlUI()
            }
        }
    }
}

@Composable
fun ACTouchControlUI() {
    var temperature by remember { mutableStateOf(29) }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF001F3F)) // Dark navy blue background
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "AC Touch Control",
                fontSize = 36.sp,
                color = Color.White
            )

            Spacer(modifier = Modifier.size(16.dp))

            // 2x2 grid layout
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
                    .border(2.dp, Color.Gray) // Border for the entire grid
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f) // Allocate equal space for each row
                ) {
                    BoxWithBorder {
                        TemperatureControl(temperature) { newTemp ->
                            if (newTemp in 16..32) {
                                temperature = newTemp
                            }
                        }
                    }

                    BoxWithBorder {
                        OnOffControl(text = "AC On/Off")
                    }
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f) // Allocate equal space for each row
                ) {
                    BoxWithBorder {
                        FanSpeedControl()
                    }

                    BoxWithBorder {
                        OnOffControl(text = "Swing On/Off")
                    }
                }
            }
        }
    }
}

@Composable
fun BoxWithBorder(content: @Composable () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .weight(1f)
            .border(2.dp, Color.Gray)
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        content()
    }
}

@Composable
fun TemperatureControl(temperature: Int, onTemperatureChange: (Int) -> Unit) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .border(2.dp, Color.Gray) // Border around the temperature control
            .padding(8.dp) // Padding inside the bordered box
    ) {
        // Minus button
        Button(
            onClick = { onTemperatureChange(temperature - 1) },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF007BFF),
                contentColor = Color.White
            ),
            modifier = Modifier
                .size(60.dp)
                .clip(CircleShape)
        ) {
            Text(text = "-", fontSize = 30.sp)
        }

        Spacer(modifier = Modifier.width(20.dp))

        // Circular temperature display with dynamic blue progress
        CircularTemperatureDisplay(temperature)

        Spacer(modifier = Modifier.width(20.dp))

        // Plus button
        Button(
            onClick = { onTemperatureChange(temperature + 1) },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF007BFF),
                contentColor = Color.White
            ),
            modifier = Modifier
                .size(60.dp)
                .clip(CircleShape)
        ) {
            Text(text = "+", fontSize = 30.sp)
        }
    }
}

@Composable
fun CircularTemperatureDisplay(temperature: Int) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.size(80.dp) // Adjust size for a more compact design
    ) {
        // Calculate sweep angle based on temperature range (16 to 32)
        val sweepAngleBlue = ((temperature - 16) / 16f) * 360f

        // Black part of the ring (full circle)
        Canvas(modifier = Modifier.size(80.dp)) {
            drawArc(
                color = Color.Black,
                startAngle = -90f,
                sweepAngle = 360f,
                useCenter = false,
                style = Stroke(
                    width = 8.dp.toPx(),
                    cap = StrokeCap.Round
                )
            )

            // Blue part of the ring (dynamic based on temperature)
            drawArc(
                color = Color.Blue,
                startAngle = -90f,
                sweepAngle = sweepAngleBlue,
                useCenter = false,
                style = Stroke(
                    width = 8.dp.toPx(),
                    cap = StrokeCap.Round
                )
            )
        }

        // Temperature text
        Text(
            text = "$temperature°",
            fontSize = 22.sp,
            color = Color.White
        )
    }
}

@Composable
fun OnOffControl(text: String) {
    Button(
        onClick = { /* Logic to toggle on/off state */ },
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF007BFF),
            contentColor = Color.White
        ),
        modifier = Modifier
            .size(80.dp)
            .clip(CircleShape)
    ) {
        Text(text = text, fontSize = 14.sp, color = Color.White)
    }
}

@Composable
fun FanSpeedControl() {
    Text(
        text = "Fan Speed Control",
        fontSize = 16.sp,
        color = Color.White,
        modifier = Modifier.padding(16.dp)
    )
}

