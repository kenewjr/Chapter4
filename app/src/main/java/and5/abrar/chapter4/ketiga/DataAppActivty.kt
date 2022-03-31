package and5.abrar.chapter4.ketiga

import and5.abrar.chapter4.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_data_app_activty.*
import kotlinx.android.synthetic.main.activity_data_mahassiwa_activty.*

class DataAppActivty : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_app_activty)

        val dataapp = arrayListOf(
            DataApp(R.drawable.tabibito,"github","metaverse","social","6.0","100mb","100m+"),
            DataApp(R.drawable.tabibito,"kaskus","scorpio","education","4.0","200mb","300m+"),
            DataApp(R.drawable.uwuga,"kobokan","aqua","minuman","6.0","10mb","500m+")
        )
        val adapet = AdapaterApp(dataapp)
        val laymanager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        rvapp.layoutManager = laymanager
        rvapp.adapter = adapet
    }
}