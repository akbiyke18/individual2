package kg.work.individual_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivityGraphic : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_graphic)
    }
    val imageView = findViewById<ImageView>(R.id.imageView_graphic)

        .setOnClickListener {
            startActivity(Intent(this,MainActivityDetailed::class.java))
        }
}