package com.example.fragmentos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1Frag.setOnClickListener(this)
        btn2.setOnClickListener(this)
        btn3.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
    var f:Fragment?=null

        when(v!!.id){
            R.id.btn1Frag-> {
                f = PrimerFragment.newInstance("","")
            }
            R.id.btn2-> {
                f = SegundoFragment.newInstance("", "")
            }
            R.id.btn3-> {
                f = TercerFragment.newInstance("", "")
            }
        }

        supportFragmentManager.beginTransaction().replace(R.id.container, f!!).commitNow()


    }
}
