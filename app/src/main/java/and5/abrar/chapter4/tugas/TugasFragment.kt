package and5.abrar.chapter4.tugas

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import and5.abrar.chapter4.R
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.fragment_tugas.*
import kotlinx.android.synthetic.main.tugas_dialog.view.*

class TugasFragment : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tugas, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_prosesfragment1.setOnClickListener {
            val barang = in_barang1.text.toString()
            val jumlah = in_jumlah1.text.toString().toInt()
            val harga = in_harga1.text.toString().toInt()
            val total = harga*jumlah
            val aa = AlertDialog.Builder(requireContext()).create()
            aa.setTitle("Total Belanja")
            aa.setMessage("= $total")
            val customdialog = LayoutInflater.from(requireContext()).inflate(R.layout.tugas_dialog, null, false)
            aa.setView(customdialog)
            aa.create()
            customdialog.tugas_alert.setOnClickListener {
                val bayar = customdialog.in_bayar.text.toString().toInt()
                val kembalian = bayar-total
                out_barang1.text = "Barang : "+barang
                out_jumlah1.text = "Jumlah Barang : " + jumlah.toString()
                out_harga1.text = "Harga barang : "+harga.toString()
                out_total1.text = "Total : "+total.toString()
                out_kembalian1.text = "Kembalian : "+kembalian.toString()
                aa.dismiss()
            }
            aa.show()

        }
    }
}