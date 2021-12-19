package kg.work.individual_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivityRegister : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_register)
    }
    val textView = findViewById<TextView>(R.id.textView_next)

        .setOnClickListener {
            startActivity(Intent(this,MainActivityCategory::class.java))
        }
}