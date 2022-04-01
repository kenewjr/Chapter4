package and5.abrar.chapter4.keempat

import and5.abrar.chapter4.R
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_mainsf.*

class Mainsf : AppCompatActivity() {
    lateinit var frefs : SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainsf)

        if(getSharedPreferences("contoh",Context.MODE_PRIVATE).contains("NAMA")){
            startActivity(Intent(this,MainSf2::class.java))
            finish()
        }

        frefs = getSharedPreferences("contoh",Context.MODE_PRIVATE)
        SharedPrefExample()
    }

    fun SharedPrefExample(){
        tombol.setOnClickListener {
            val dtnama = in_name.text.toString()
            val sf = frefs.edit()
            sf.putString("NAMA",dtnama)
            sf.apply()

            startActivity(Intent(this,MainSf2::class.java))
            finish()
        }
    }
}