package jp.techacademy.toshihiro.ishikawa.greetingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import android.app.TimePickerDialog
import androidx.core.util.lruCache
import android.widget.TimePicker;


class MainActivity: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(
                object : View.OnClickListener {
                    override fun onClick(v: View?): Unit {
                        showTimePickerDialog()
                    }
                }
        )
    }
    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
            this,ß
            TimePickerDialog.OnTimeSetListener { _, hour, minute ->
                if (hour>=18 && minute >= 0) {
                    textView.text="こんばんは"
                                                             } else if(hour >= 10 && minute >= 0) {
                                                                 textView.text="こんにちは"
                                                             } else if (hour >= 2 && minute >= 0) {
                                                                 textView.text="おはようございます"
                                                             }else if (hour>=0 && minute>=0){
                                                                 textView.text="こんばんは"
                }

            },
            13, 0, true)
        timePickerDialog.show()
    }



//    private fun showTimePickerDialog() {
//        val timePickerDialog = TimePickerDialog(
//                this,
//            new TimePickerDialog.OnTimeSetListener{
//                                                         @Override
//                                                         fun onTimeSet(TimePicker view,int hourOfDay,int minute){
//                                                             if (hourOfDay >= 2  && minute >= 0) {
//                                                                 textView.text="おはようございます"
//                                                             } else if(hourOfDay >= 10 && minute >= 0) {
//                                                                 textView.text="こんにちわ"
//                                                             } else if (hourOfDay >= 18 && minute >= 0) {
//                                                                 textView.text="こんばんは"
//                                                             }
//                                                         }
//                },
//                13, 0, true)
//        timePickerDialog.show()
    }


