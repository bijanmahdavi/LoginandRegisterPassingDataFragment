package com.example.swipeviewloginsystem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_login.*
import kotlinx.android.synthetic.main.fragment_register.*

class MainActivity : AppCompatActivity(), LoginFragment.OnFragmentInteraction, RegisterFragment.OnFragmentInteraction {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {

        var myAdapter = MyAdapter(supportFragmentManager)
        view_pager.adapter = myAdapter
        tab_layout.setupWithViewPager(view_pager) // tab nav bar on top

        tab_layout.getTabAt(0)?.setIcon(R.drawable.ic_baseline_open_in_browser_24)
        tab_layout.getTabAt(1)?.setIcon(R.drawable.ic_baseline_how_to_reg_24)
    }


    override fun toRegisterButtonPressed() {
        tab_layout.getTabAt(1)?.select()
    }
    override fun loginButtonPressed() {
        Toast.makeText(this, "Try using the other tab to register!", Toast.LENGTH_SHORT).show()
        //startActivity(Intent(this, HomeActivity::class.java))
    }
    override fun toLoginButtonPressed() {
        tab_layout.getTabAt(0)?.select()
    }

    override fun registerButtonPressed(username: String, email: String ) {
        username_edit_text.setText(username)
        email_login_edit_text.setText(email)
        tab_layout.getTabAt(0)?.select()
    }
}