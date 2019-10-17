package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*


// : = extends
class MainActivity : AppCompatActivity() {

    //onCreate = main()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //setContentView = create the UI
        //R = resources (res)
        setContentView(R.layout.activity_main)
        //TODO  =  Continue work here
        //declare a reference
        //val = value , var = variable
        //JAVA int x ; Kotlin val x : Int
        //findViewById = link program to UI
        val buttonPlayMe : Button = findViewById(R.id.buttonPlayMe)
        buttonPlayMe.setOnClickListener{showMessage()}
        val buttonBack : Button = findViewById(R.id.buttonBack)
        buttonBack.setOnClickListener{showMessage1()}

    }

    private fun showMessage1() {
        val textViewMessenge : TextView = findViewById(R.id.textViewMessage)
        textViewMessage.setText(getString(R.string.back))
    }

    private fun showMessage() {
        val textViewMessenge : TextView = findViewById(R.id.textViewMessage)
        textViewMessage.setText(getString(R.string.hello))
    }

}
