package and5.abrar.chapter4.pertama

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import and5.abrar.chapter4.R
import android.content.Intent
import android.widget.Toast
import androidx.navigation.Navigation
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_frament1.*


class Frament1 : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_frament1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        toast.setOnClickListener {
            Toast.makeText(requireContext(), "halo",Toast.LENGTH_LONG).show()
        }
        snackbar.setOnClickListener {
            Snackbar.make(it,"next",Snackbar.LENGTH_INDEFINITE)
                .setAction("pindah"){
                    Navigation.findNavController(view).navigate(R.id.action_frament1_to_fragment2)
                }.show()
        }
    }
}