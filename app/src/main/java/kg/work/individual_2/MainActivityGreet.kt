package kg.work.individual_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivityGreet : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_greet)
    }
    val imageView = findViewById<ImageView>(R.id.imageView)

    .setOnClickListener {
        startActivity(Intent(this,MainActivityRegistration::class.java))
    }
}


