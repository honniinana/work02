package com.example.honhon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var editname: EditText = findViewById(R.id.User)
        var editpass: EditText = findViewById(R.id.Password)
        var editcpass: EditText = findViewById(R.id.Confirm)
        var ok: Button = findViewById(R.id.buttonOK)
        var clear: Button = findViewById(R.id.buttonclear)

        clear.setOnClickListener() {
            editname.setText("")
            editpass.setText("")
            editcpass.setText("")
            val toast = Toast.makeText(applicationContext, "ลบสำเร็จ!!!", Toast.LENGTH_LONG)
            toast.show()
        }
        ok.setOnClickListener() {
            var user = editname.text.toString()
            var pass1 = editpass.text.toString()
            var pass2 = editcpass.text.toString()
            if(user == "" || pass1 == "" || pass2 == ""){
            Toast.makeText(applicationContext, "กรุณากรอกให้ครบ", Toast.LENGTH_LONG).show()
        }
            else if(user == pass1 && user == pass2) {
            Toast.makeText(applicationContext, "อย่ากรอกUsernameตรงกับPassword", Toast.LENGTH_LONG).show()
        }
        else if(pass1 != pass2){
            Toast.makeText(applicationContext, "กรุณากรอกพาสให้ตรงกัน", Toast.LENGTH_LONG).show()

        }
        else{
            Toast.makeText(applicationContext, "OK", Toast.LENGTH_LONG).show()
        }
        }


    }
}