package and5.abrar.chapter4.keempat

import and5.abrar.chapter4.R
import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_testsf.*

class Testsf : AppCompatActivity() {
    lateinit var tsf : SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_testsf)
        tsf = getSharedPreferences("test", Context.MODE_PRIVATE)
        tbl_save.setOnClickListener {
            save()
            Toast.makeText(this, "Data Tersimpan",Toast.LENGTH_SHORT).show()
        }
        tbl_view.setOnClickListener {
            views()
        }
        tbl_clear.setOnClickListener {
            clear()
            Toast.makeText(this, "Data Dihapus",Toast.LENGTH_SHORT).show()
        }
    }
    fun save(){
        val id = in_id.text.toString()
        val nama = in_nama.text.toString()
        val sf = tsf.edit()
        sf.putString("id",id)
        sf.putString("nama",nama)
        sf.apply()
    }
    fun views(){
        if(getSharedPreferences("test",Context.MODE_PRIVATE).contains("id")){
            out_id.text = tsf.getString("id","")
            out_nama.text = tsf.getString("nama","")
            Toast.makeText(this, "Data Ditampilkan",Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(this, "Data Kosong",Toast.LENGTH_SHORT).show()
        }
    }
    fun clear(){
        val logoutsf = tsf.edit()
        out_id.text = ""
        out_nama.text = ""
        logoutsf.clear()
        logoutsf.apply()
    }

}