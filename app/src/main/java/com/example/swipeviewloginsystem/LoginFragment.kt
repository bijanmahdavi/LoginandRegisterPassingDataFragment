package com.example.swipeviewloginsystem

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_login.*
import kotlinx.android.synthetic.main.fragment_login.view.*

var listener: LoginFragment.OnFragmentInteraction? = null

class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_login, container, false)
        init(view)
        return view
    }

    private fun init(view: View) {

        view.submit_button_to_login.setOnClickListener {
            listener?.loginButtonPressed()
        }

        view.to_register_screen_text_button.setOnClickListener {
            listener?.toRegisterButtonPressed()
        }
    }

    interface OnFragmentInteraction{
        fun toRegisterButtonPressed()
        fun loginButtonPressed()
    }



    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = context as MainActivity
    }
}