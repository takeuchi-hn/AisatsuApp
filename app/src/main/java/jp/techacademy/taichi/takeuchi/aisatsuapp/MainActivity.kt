package jp.techacademy.taichi.takeuchi.aisatsuapp

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        if (v.id == R.id.button1) {
            showTimePickerDialog()
            Log.d("UI_PARTS", "ボタン押した")
        }
    }

    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
                this,
                TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                    Log.d("UI-PARTS", "$hour:$minute")
                },
                13, 0, true)
        timePickerDialog.show()
        /*if (timePickerDialog$hour >= 18 || timePickerDialog.hour == 1){
            textView.text = "こんばんわ"
        }else　if(timePickerDialog.hour >= 10){
            textView.text = "こんにちわ"
        }else　if(timePickerDialog.hour >= 2){
            textView.text = "おはよう"
        }:*/
    }


}