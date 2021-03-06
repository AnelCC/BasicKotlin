package com.example.ctsuser1.myapplicationkotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_random.*
import java.util.*

class RandomActivity : AppCompatActivity() {


    private var textView: TextView? = null

    companion object {
        const val TOTAL_COUNT = "total_count"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random)

        textView = findViewById<TextView>(R.id.textView)
        showRandomNumber()
    }


    fun showRandomNumber() {
        // Get the count from the intent extras
        val count = intent.getIntExtra(TOTAL_COUNT, 0)

        // Generate the random number
        val random = Random()
        var randomInt = 0
        // Add one because the bound is exclusive
        if (count > 0) {
            // Add one because the bound is exclusive
            randomInt = random.nextInt(count + 1)
        }

        // Display the random number.
        textView!!.text = Integer.toString(randomInt)

        // Substitute the max value into the string resource
        // for the heading, and update the heading
       // textView!!.text = getString(R.string.random_heading, count)
    }
}
