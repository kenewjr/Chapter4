package and5.abrar.chapter4

import and5.abrar.chapter4.kedua.AlertDialogActivity
import and5.abrar.chapter4.kedua.AlertDialogFragment
import and5.abrar.chapter4.kedua.LatihanAlert
import and5.abrar.chapter4.keempat.Mainsf
import and5.abrar.chapter4.keempat.Testsf
import and5.abrar.chapter4.ketiga.DataAppActivty
import and5.abrar.chapter4.ketiga.DataMahassiwaActivty
import and5.abrar.chapter4.miniceleng.Latihan1
import and5.abrar.chapter4.pertama.Pertama
import and5.abrar.chapter4.tugas.TugasActivty
import and5.abrar.chapter4.tugas.TugasFragment
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
        mini.setOnClickListener {
            startActivity(Intent(this,Latihan1::class.java))
        }
        kedua.setOnClickListener {
            startActivity(Intent(this,AlertDialogActivity::class.java))
        }
        tugas.setOnClickListener {
            startActivity(Intent(this,TugasActivty::class.java))
        }
        tugasfragment.setOnClickListener {
            TugasFragment().show(supportFragmentManager, "abcx")
        }
        btndata.setOnClickListener {
            startActivity(Intent(this,DataMahassiwaActivty::class.java))
        }
        btnapp.setOnClickListener {
            startActivity(Intent(this,DataAppActivty::class.java))
        }
        SFact.setOnClickListener {
            startActivity(Intent(this,Mainsf::class.java))
        }
        Tfact.setOnClickListener {
            startActivity(Intent(this,Testsf::class.java))
        }
    }
}