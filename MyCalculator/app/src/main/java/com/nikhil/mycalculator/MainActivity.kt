package com.nikhil.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
//ST10315122 Nikhil Rajkumar
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //First gain access to components
        var edtTextNumber1 = findViewById<EditText>(R.id.edtTextNumber1)
        var edtTextNumber2 = findViewById<EditText>(R.id.edtTextNumber2)

        var edtTextMainAnswer = findViewById<TextView>(R.id.edtTextMainAnswer)


        //Gain access to component
        var btnAddition = findViewById<Button>(R.id.btnAddition)
        //Set a Onclick event with the button
        btnAddition.setOnClickListener {

            //Make variables for the 2 numbers used
            var Number1 : Int = edtTextNumber1.text.toString().toInt()
            var Number2 : Int = edtTextNumber2.text.toString().toInt()

            //Process the inputs to get an answer
            var additionAnswer = Number1 + Number2

            //Display the answer
            edtTextMainAnswer.text = String.format("$Number1"+"+"+"$Number2"+"="+"$additionAnswer")

        }

        //Gain access to component
        var btnSubtraction = findViewById<Button>(R.id.btnSubtraction)
        //Set a Onclick event with the button
        btnSubtraction.setOnClickListener {

            //Make variables for the 2 numbers used
            var Number1 : Int = edtTextNumber1.text.toString().toInt()
            var Number2 : Int = edtTextNumber2.text.toString().toInt()

            //Process the inputs to get an answer
            var SubtractionAnswer = Number1 - Number2

            //Display the answer
            edtTextMainAnswer.text = String.format("$Number1"+"-"+"$Number2"+"="+"$SubtractionAnswer")

        }

        //Gain access to component
        var btnMultiplication = findViewById<Button>(R.id.btnMultiplication)
        //Set a Onclick event with the button
        btnMultiplication.setOnClickListener {

            //Make variables for the 2 numbers used
            var Number1 : Int = edtTextNumber1.text.toString().toInt()
            var Number2 : Int = edtTextNumber2.text.toString().toInt()

            //Process the inputs to get an answer
            var MultiplicationAnswer = Number1 * Number2

            //Display the answer
            edtTextMainAnswer.text = String.format("$Number1"+"×"+"$Number2"+"="+"$MultiplicationAnswer")

        }

        //Gain access to component
        var btnDivision = findViewById<Button>(R.id.btnDivision)
        //Set a Onclick event with the button
        btnDivision.setOnClickListener {

            //Make variables for the 2 numbers used
            var Number1 : Int = edtTextNumber1.text.toString().toInt()
            var Number2 : Int = edtTextNumber2.text.toString().toInt()

            //Process the inputs to get an answer
            var DivisionAnswer = Number1 / Number2

            //Display the answer
            edtTextMainAnswer.text = String.format("$Number1"+"÷"+"$Number2"+"="+"$DivisionAnswer")

        }


    }
}