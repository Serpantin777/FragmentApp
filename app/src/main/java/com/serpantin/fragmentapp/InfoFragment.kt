package com.serpantin.fragmentapp

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment

class InfoFragment : Fragment() {


    private lateinit var resultTextView: TextView
    private lateinit var websiteButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_info, container, false)

        resultTextView = view.findViewById(R.id.in_development_info)
        websiteButton = view.findViewById(R.id.button_website)


        val intent = Intent(Intent.ACTION_SEND)
        intent.type = "text/plain"
        intent.putExtra(Intent.EXTRA_TEXT, getString(R.string.app_name))

        val chooser = Intent.createChooser(intent, "Поделиться!!!")

        websiteButton.setOnClickListener {
            startActivity(chooser)
        }

        return view


    }


}