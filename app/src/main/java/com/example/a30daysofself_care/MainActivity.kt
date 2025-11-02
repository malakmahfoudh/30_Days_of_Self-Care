package com.example.a30daysofself_care

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.a30daysofself_care.data.Datasource
import com.example.a30daysofself_care.model.SelfCareDay
import com.example.a30daysofself_care.ui.theme._30DaysOfSelfCareTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            _30DaysOfSelfCareTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SelfCareApp()
                }
            }
        }
    }
}

@Composable
fun SelfCareApp() {
    val selfCareList = Datasource().loadSelfCareDays()

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(selfCareList) { day ->
            SelfCareCard(
                title = stringResource(day.titleResourceId),
                description = stringResource(day.descriptionResourceId),
                imageResId = day.imageResourceId
            )
        }
    }
}

@Composable
fun SelfCareCard(
    title: String,
    description: String,
    imageResId: Int
) {
    val dayNumber = title.split(" ")[1].trimEnd(':').toIntOrNull() ?: 1

    val containerColor = when (dayNumber % 4) {
        0 -> Color(0xFFFFF0F5) // Soft pink
        1 -> Color(0xFFFFF5F0) // Warm peach
        2 -> Color(0xFFFFF0FA) // Lavender blush
        else -> Color(0xFFFFFAF0) // Creamy nude
    }

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(20.dp),
        elevation = CardDefaults.elevatedCardElevation(defaultElevation = 6.dp),
        colors = CardDefaults.cardColors(containerColor = containerColor)
    ) {
        Column(
            modifier = Modifier.padding(20.dp)
        ) {
            Text(
                text = title,
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.SemiBold,
                color = MaterialTheme.colorScheme.onSurface,
                modifier = Modifier.padding(bottom = 12.dp)
            )

            // ✅ IMAGES NOW APPEAR FULLY
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp)
                    .clip(RoundedCornerShape(16.dp))
            ) {
                Image(
                    painter = painterResource(id = imageResId),
                    contentDescription = title,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
            }

            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = description,
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurface,
                lineHeight = 22.sp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SelfCareCardPreview() {
    _30DaysOfSelfCareTheme {
        SelfCareCard(
            title = "Day 1: Go Out Alone",
            description = "Take a walk, sit in a café, or browse a store — just you. No agenda, no distractions. Let the world pass by while you simply exist. Sometimes, being alone is the most powerful way to reconnect with yourself.",
            imageResId = R.drawable.day1_go_out_alone
        )
    }
}