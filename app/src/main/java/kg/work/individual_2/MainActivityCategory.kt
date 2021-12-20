package kg.work.individual_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivityCategory : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_category)
    }
    val next = findViewById<Button>(R.id.button_graph)

        .setOnClickListener {
            startActivity(Intent(this,MainActivityGraphic::class.java))
        }

}