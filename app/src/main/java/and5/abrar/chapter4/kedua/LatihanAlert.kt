package and5.abrar.chapter4.kedua

import and5.abrar.chapter4.R
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_latihan_alert.*

class LatihanAlert : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_alert)

        alertstd.setOnClickListener {
            AlertDialog.Builder(this).setTitle("alert dialog standart")
                .setMessage("haloo")
                .setIcon(R.drawable.ic_launcher_background)
                .show()
        }
        alertdsms.setOnClickListener {
            val aa = AlertDialog.Builder(this)
            val ab = aa.create()
            val angka1=angka1.text.toString().toInt()
            val angka2=angka2.text.toString().toInt()
            val hasil =angka1*angka2
            AlertDialog.Builder(this).setTitle("No Title")
                aa.setMessage("hasil $angka1 x $angka2 = $hasil")
                aa.setNeutralButton("dimiss"){dialoginterface:DialogInterface, i : Int ->
                    ab.dismiss()
            }
            aa.show()
        }
    }
}