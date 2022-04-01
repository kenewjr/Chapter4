package and5.abrar.chapter4.keempat

import and5.abrar.chapter4.R
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main_sf2.*

class MainSf2 : AppCompatActivity() {
    lateinit var sf :SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_sf2)
        sf = getSharedPreferences("contoh", Context.MODE_PRIVATE)
        val getnama = sf.getString("NAMA","")
        get_nama.text = getnama
        keluar.setOnClickListener {
            logout()
        }
    }
    fun logout(){
        val logoutsf = sf.edit()
        logoutsf.clear()
        logoutsf.apply()
        startActivity(Intent(this,Mainsf::class.java))
        finish()
    }
}