package and5.abrar.chapter4.tugas

import and5.abrar.chapter4.R
import and5.abrar.chapter4.keempat.Mainsf
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_testsf.*
import kotlinx.android.synthetic.main.activity_tugas_home_shared.*

class TugasHomeShared : AppCompatActivity() {
    lateinit var sharedf : SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tugas_home_shared)
        sharedf = getSharedPreferences("TgsSf", Context.MODE_PRIVATE)
        tampil()
        logout.setOnClickListener {
            logout()
        }
    }
    fun tampil(){
        welcome.text ="Hello, " + sharedf.getString("user","")
    }
    fun logout(){
            AlertDialog.Builder(this).setTitle("Logout")
                .setMessage("yakin Logout?")
                .setPositiveButton("ya"){ dialogInterface : DialogInterface, i: Int ->
                    val logoutsf = sharedf.edit()
                    logoutsf.clear()
                    logoutsf.apply()
                    startActivity(Intent(this, TugasShared::class.java))
                    finish()
                    Toast.makeText(this, "data terhapus", Toast.LENGTH_LONG).show()

                }
                .setNegativeButton("Tidak"){ dialogInterface: DialogInterface, i: Int ->
                    Toast.makeText(this, "tidak jadi", Toast.LENGTH_LONG).show()
                }.show()

    }
}