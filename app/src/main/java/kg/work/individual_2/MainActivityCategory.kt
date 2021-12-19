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
    val cloth = findViewById<Button>(R.id.button_cloth)

        .setOnClickListener {
            startActivity(Intent(this,MainActivityClothes::class.java))
        }
    val interior = findViewById<Button>(R.id.button_interior)

        .setOnClickListener {
            startActivity(Intent(this,MainActivityInterior::class.java))
        }
    val visualization = findViewById<Button>(R.id.button_3d)

        .setOnClickListener {
            startActivity(Intent(this,MainActivityVisualization::class.java))
        }
    val product = findViewById<Button>(R.id.button_product)

        .setOnClickListener {
            startActivity(Intent(this,MainActivityProduct::class.java))
        }
    val website = findViewById<Button>(R.id.button_site)

        .setOnClickListener {
            startActivity(Intent(this,MainActivityWebsite::class.java))
        }
}