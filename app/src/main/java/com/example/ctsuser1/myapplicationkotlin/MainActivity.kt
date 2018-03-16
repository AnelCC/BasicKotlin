package com.example.ctsuser1.myapplicationkotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var textView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        textView = findViewById<TextView>(R.id.txt_hello)
    }

    fun toastMe(view: View) {
        // val myToast = Toast.makeText(this, message, duration);
        val myToast = Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT)
        myToast.show()
    }
    fun countMe (view: View) {
        // Get the value of the text view.
        val countString = textView?.text.toString()

        // Convert value to a number and increment it
        var count: Int = Integer.parseInt(countString)
        count++


        // Display the new value in the text view.
        textView!!.text = count.toString();
    }

    fun randomMe (view: View) {
        // Create an Intent to start the second activity
        val randomIntent = Intent(this, RandomActivity::class.java)

        // Get the current value of the text view.
        val countString = textView?.text.toString()

        // Convert the count to an int
        val count = Integer.parseInt(countString)

        // Add the count to the extras for the Intent.
        randomIntent.putExtra(RandomActivity.TOTAL_COUNT, count)

        // Start the new activity.
        startActivity(randomIntent)
    }
}
