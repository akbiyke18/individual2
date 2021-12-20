package kg.work.individual_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivitySettings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_settings)
    }
    val imageView = findViewById<ImageView>(R.id.imageView18)

        .setOnClickListener {
            startActivity(Intent(this,MainActivityProfile::class.java))
        }
}