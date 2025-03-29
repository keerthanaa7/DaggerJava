package com.example.daggerjava

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.daggerjava.ui.theme.DaggerJavaTheme
import javax.inject.Inject

class MainActivity : ComponentActivity() {
    @Inject
    lateinit  var  smartphone: Smartphone

    @Inject
    lateinit var memoryCard: MemoryCard
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        (application as SmartPhoneApplication).smartPhoneComponent.inject(this)

    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )

    Log.d("MAINACTIVITYKT", "HELLO FROM KOTLIN")
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DaggerJavaTheme {
        Greeting("Android")
    }
}