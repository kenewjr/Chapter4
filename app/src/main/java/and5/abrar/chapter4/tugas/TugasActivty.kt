package and5.abrar.chapter4.tugas

import and5.abrar.chapter4.R
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_tugas_activty.*
import kotlinx.android.synthetic.main.tugas_dialog.*
import kotlinx.android.synthetic.main.tugas_dialog.view.*

class TugasActivty : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tugas_activty)
        btn_prosesbiasa.setOnClickListener {
            val barang = in_barang.text.toString()
            val jumlah = in_jumlah.text.toString().toInt()
            val harga = in_harga.text.toString().toInt()
            val total = harga*jumlah
            val aa = AlertDialog.Builder(this).create()
            aa.setTitle("Total Belanja")
            aa.setMessage("= $total")
            val customdialog = LayoutInflater.from(this).inflate(R.layout.tugas_dialog, null, false)
                aa.setView(customdialog)
                aa.create()
                customdialog.tugas_alert.setOnClickListener {
                val bayar = customdialog.in_bayar.text.toString().toInt()
                val kembalian = bayar-total
                out_barang.text = "Barang : "+barang
                out_jumlah.text = "Jumlah Barang : " + jumlah.toString()
                out_harga.text = "Harga barang : "+harga.toString()
                out_total.text = "Total : "+total.toString()
                out_kembalian.text = "Kembalian : "+kembalian.toString()
                    aa.dismiss()
            }
            aa.show()

        }

    }
}