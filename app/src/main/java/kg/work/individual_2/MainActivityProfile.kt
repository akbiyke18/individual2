package kg.work.individual_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivityProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_profile)
    }
    val imageView = findViewById<ImageView>(R.id.imageView_set)

        .setOnClickListener {
            startActivity(Intent(this,MainActivitySettings::class.java))
        }
}