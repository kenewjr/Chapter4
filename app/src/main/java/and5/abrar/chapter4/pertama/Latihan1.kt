package and5.abrar.chapter4.pertama

import and5.abrar.chapter4.R
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_latihan.*

class Latihan1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan)

        muncul.setOnClickListener {
            val data = edit1.text.toString()
            Toast.makeText(this, "halo $data", Toast.LENGTH_LONG).show()
        }
        muncul1.setOnClickListener {
            Snackbar.make(it, "ini snackbar pindah", Snackbar.LENGTH_INDEFINITE)
                .setAction("pindah"){
                startActivity(Intent(this, Pertama::class.java))
            }
                .show()
        }
    }
}