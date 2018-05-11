package com.example.miichang.datapickersample

import android.app.DatePickerDialog
import android.content.DialogInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)
        val textView: TextView = findViewById(R.id.textView)
        textView.text = calendar.get(Calendar.YEAR).toString() + calendar.get(Calendar.MONTH).toString() + calendar.get(Calendar.DATE).toString()

        val dateDialog = DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
            textView.text = year.toString() + month.toString() + day.toString()
            Log.i("year", year.toString())
            Log.i("month", month.toString())
            Log.i("day", dayOfMonth.toString())
        }, year, month, day)
        

        val button: Button = findViewById(R.id.button)

        button.setOnClickListener {
            dateDialog.show()
        }

    }
}
