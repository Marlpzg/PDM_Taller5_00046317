package com.example.naveditor

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(),
    FirstFragment.OnFragmentInteractionListener,
    SecondFragment.OnFragmentInteractionListener,
    ThirdFragment.OnFragmentInteractionListener,
    FourthFragment.OnFragmentInteractionListener{

    override fun onFragmentInteraction(uri: Uri) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
