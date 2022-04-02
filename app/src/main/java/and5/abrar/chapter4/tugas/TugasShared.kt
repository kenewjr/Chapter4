package and5.abrar.chapter4.tugas

import and5.abrar.chapter4.R
import and5.abrar.chapter4.keempat.MainSf2
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_mainsf.*
import kotlinx.android.synthetic.main.activity_tugas_shared.*

class TugasShared : AppCompatActivity() {
    lateinit var sharedf : SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tugas_shared)
        if(getSharedPreferences("TgsSf",Context.MODE_PRIVATE).contains("user")){
            startActivity(Intent(this,TugasHomeShared::class.java))
            finish()
        }
        sharedf = getSharedPreferences("TgsSf", Context.MODE_PRIVATE)
        SharedPref()


    }
    fun SharedPref(){
        btn_login.setOnClickListener {
            val dtuser = in_user.text.toString()
            val dtpass = in_pass.text.toString()
            val sf = sharedf.edit()
            sf.putString("user",dtuser)
            sf.putString("pass",dtpass)
            sf.apply()
            startActivity(Intent(this, TugasHomeShared::class.java))
            finish()
        }
    }
}