package and5.abrar.chapter4.ketiga

import and5.abrar.chapter4.R
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_app_adapter.view.*
import kotlinx.android.synthetic.main.item_mhs_adapter.view.*
import java.util.ArrayList

class AdapaterApp(val listApp : ArrayList<DataApp>): RecyclerView.Adapter<AdapaterApp.ViewHolder>() {
    class ViewHolder(layout: View):RecyclerView.ViewHolder(layout) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapaterApp.ViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.item_app_adapter,parent,false)
        return AdapaterApp.ViewHolder(layout)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.img_app.setImageResource(listApp[position].imgApp)
        holder.itemView.nama_app.text = listApp[position].namaApp
        holder.itemView.dev_app.text = listApp[position].devApp
        holder.itemView.ctgry.text = listApp[position].ctgryApp
        holder.itemView.rate.text = listApp[position].rateApp
        holder.itemView.size.text = listApp[position].sizeApp
        holder.itemView.jmlh.text = listApp[position].jmlhdl

    }

    override fun getItemCount(): Int {
        return listApp.size
    }
}