package kg.work.individual_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class MainActivityRegistration : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_registration)
    }
    val textView = findViewById<TextView>(R.id.register)

        .setOnClickListener {
            startActivity(Intent(this,MainActivityRegister::class.java))
        }
}


