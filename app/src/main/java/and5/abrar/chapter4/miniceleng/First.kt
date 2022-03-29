package and5.abrar.chapter4.miniceleng

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import and5.abrar.chapter4.R
import and5.abrar.chapter4.pertama.Pertama
import android.content.Intent
import android.widget.Toast
import androidx.navigation.Navigation
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_first.*

class First : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        muncul.setOnClickListener {
            val data = edit1.text.toString()
            Toast.makeText(requireContext(), "halo $data", Toast.LENGTH_LONG).show()
        }
        muncul1.setOnClickListener {
            Snackbar.make(it, "ini snackbar pindah", Snackbar.LENGTH_INDEFINITE)
                .setAction("pindah"){
                    Navigation.findNavController(view).navigate(R.id.action_first_to_second)
                }
                .show()
        }
    }
}