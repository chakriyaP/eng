package th.ac.kku.coe.fragmentstutorial

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


public final class ExampleFragment : Fragment(R.layout.example_fragment) {
    // TODO: Rename and change types of parameters


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater?.inflate(
            R.layout.example_fragment,
            container, false
        )
        val button = view.findViewById<Button>(R.id.button)
        button.setOnClickListener{
            val editText = view.findViewById<EditText>(R.id.editText)
            val resultText = view.findViewById<TextView>(R.id.textView)
            resultText.text = editText.text.toString()
        }
        return view
    }

}