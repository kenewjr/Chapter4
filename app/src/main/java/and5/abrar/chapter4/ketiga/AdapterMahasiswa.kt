package and5.abrar.chapter4.ketiga

import and5.abrar.chapter4.R
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_mhs_adapter.view.*
import java.util.ArrayList

class AdapterMahasiswa(val listdata : ArrayList<DataMhs>):RecyclerView.Adapter<AdapterMahasiswa.ViewHolder>() {

    class ViewHolder(layout: View):RecyclerView.ViewHolder(layout) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterMahasiswa.ViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.item_mhs_adapter,parent,false)
        return ViewHolder(layout)
    }

    override fun onBindViewHolder(holder: AdapterMahasiswa.ViewHolder, position: Int) {
        holder.itemView.tv_nama.text = listdata[position].nama
        holder.itemView.tv_umur.text = listdata[position].umur
        holder.itemView.img_vw.setImageResource(listdata[position].gambar)
    }

    override fun getItemCount(): Int {
     return listdata.size
    }
}