package and5.abrar.chapter4.kedua

import and5.abrar.chapter4.R
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_alert_dialog.*
import kotlinx.android.synthetic.main.custom_dialog.*
import kotlinx.android.synthetic.main.custom_dialog.view.*

class AlertDialogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialog)
        alertsatu.setOnClickListener {
            AlertDialog.Builder(this).setTitle("alert dialog standart")
                .setMessage("haloo")
                .setIcon(R.drawable.ic_launcher_background)
                .show()
        }
        alertdua.setOnClickListener {
            AlertDialog.Builder(this).setTitle("yakin hapus data")
                .setMessage("yakin hapus data?")
                .setPositiveButton("ya"){dialogInterface : DialogInterface, i: Int ->
                    Toast.makeText(this, "data terhapus", Toast.LENGTH_LONG).show()

                }
                .setNegativeButton("Tidak"){dialogInterface:DialogInterface,i: Int ->
                    Toast.makeText(this, "tidak jadi", Toast.LENGTH_LONG).show()
                }.show()
        }
        alerttiga.setOnClickListener {
            val aa = AlertDialog.Builder(this)
            val ab = aa.create()
            aa.setTitle("Example of dismiss")
            aa.setMessage("isi Message dari example dismiss")
            aa.setPositiveButton("ya"){dialoginterface : DialogInterface, i: Int ->
                Toast.makeText(this, "data anda terhapus", Toast.LENGTH_LONG).show()
            }
            aa.setNeutralButton("dimiss"){dialoginterface:DialogInterface, i : Int ->
                ab.dismiss()
            }
            aa.show()
        }
        alertempat.setOnClickListener {
            val customdialog =  LayoutInflater.from(this).inflate(R.layout.custom_dialog, null, false)
            val ab = AlertDialog.Builder(this)
                .setView(customdialog)
                .create()
            customdialog.custom_alert.setOnClickListener {
                val nama = customdialog.et_nama.text.toString()
                Toast.makeText(this, "nama saya $nama",Toast.LENGTH_LONG).show()
                ab.dismiss()
            }
            ab.show()

        }

        alertlima.setOnClickListener {
            AlertDialogFragment().show(supportFragmentManager, "abcx")
        }
    }
}