package and5.abrar.chapter4.pertama

import and5.abrar.chapter4.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_pertama.*

class Pertama : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pertama)

        btn_toast.setOnClickListener {
            val data = "awe"
            Toast.makeText(this, "this is example $data", Toast.LENGTH_LONG).show()
        }
        btn_snack.setOnClickListener {
            Snackbar.make(it,"ini snackbar",Snackbar.LENGTH_LONG).show()
        }
        btn_snack2.setOnClickListener {
            Snackbar.make(it, "snackbardua", Snackbar.LENGTH_INDEFINITE)
                .setAction("show toast"){
                    Toast.makeText(this, "ini toast dari snackbar", Toast.LENGTH_LONG).show()
                }.show()
        }
        btn_snack3.setOnClickListener {
           val aa = Snackbar.make(it, "snackbardua", Snackbar.LENGTH_INDEFINITE)
               aa.setAction("Dismiss"){
                    aa.dismiss()
                }
            aa.show()
        }

    }
}