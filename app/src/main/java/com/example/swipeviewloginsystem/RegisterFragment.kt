package com.example.swipeviewloginsystem

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_register.*
import kotlinx.android.synthetic.main.fragment_register.view.*

var registerListener: RegisterFragment.OnFragmentInteraction? = null

class RegisterFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_register, container, false)
        init(view)
        return view
    }

    private fun init(view: View) {
        view.submit_button_to_register.setOnClickListener {
            var username: String = view.username_login_edit_text.text.toString()
            var email: String = view.email_edit_text.text.toString()
            registerListener?.registerButtonPressed(username, email)
        }
        view.to_login_screen_text_button.setOnClickListener {
            registerListener?.toLoginButtonPressed()
        }
    }

    interface OnFragmentInteraction{
        fun toLoginButtonPressed()
        fun registerButtonPressed(username: String, email: String)
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        registerListener = context as MainActivity
    }
}