package and5.abrar.chapter4.ketiga

import and5.abrar.chapter4.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_data_mahassiwa_activty.*

class DataMahassiwaActivty : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_mahassiwa_activty)

        val datamahasiswa = arrayListOf(
            DataMhs(R.drawable.uwuga,"abrar","24"),
            DataMhs(R.drawable.tabibito,"okamyu","22"),
            DataMhs(R.drawable.uwuga,"kobokan","30"),
            DataMhs(R.drawable.tabibito,"theresa","24"),
            DataMhs(R.drawable.uwuga,"yelan","31"),
            DataMhs(R.drawable.tabibito,"raze","21")
        )
        val adapet = AdapterMahasiswa(datamahasiswa)
        val laymanager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        rvmahasiswa.layoutManager = laymanager
        rvmahasiswa.adapter = adapet
    }
}