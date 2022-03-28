package and5.abrar.chapter4

import and5.abrar.chapter4.pertama.Pertama
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        pertama.setOnClickListener {
            startActivity(Intent(this, Pertama::class.java))
        }
    }
}