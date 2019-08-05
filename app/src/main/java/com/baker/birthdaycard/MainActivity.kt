package com.baker.birthdaycard

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun submitBday (view: View) {
        if (editNameTxt.text.isNotEmpty() && editAgeTxt.text.isNotEmpty()) {
            val name = editNameTxt.text.toString()
            val age = editAgeTxt.text.toString()
            happyBDayTxt.text = "Happy Birthday"
            nameTxt.text = "${name.capitalize()}."
            ageTodayTxt.text = "${age} today!!"
            editNameTxt.text.clear()
            editAgeTxt.text.clear()
        } else {
            ageTodayTxt.text = "Please enter a name AND age first"
        }
    }
}
