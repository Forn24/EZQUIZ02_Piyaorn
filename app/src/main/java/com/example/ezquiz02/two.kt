package com.example.ezquiz02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.ezquiz02.one.Companion.s
import kotlinx.android.synthetic.main.activity_one.*

class two : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)

        a.setOnClickListener {
            val builder = AlertDialog.Builder(this).apply {
                setMessage("ตอบผิด")
                setPositiveButton("ไปยังข้อถัดไป",{dialog,which ->
                    val intent = Intent(this@two, three::class.java)
                    startActivity(intent)
                })
            }
            val alertDialog = builder.create()
            alertDialog.show()
        }

        b.setOnClickListener {
            val builder = AlertDialog.Builder(this).apply {
                setMessage("ตอบผิด")
                setPositiveButton("ไปยังข้อถัดไป",{dialog,which ->
                    val intent = Intent(this@two, three::class.java)
                    startActivity(intent)
                })
            }
            val alertDialog = builder.create()
            alertDialog.show()
        }

        c.setOnClickListener {
            val builder = AlertDialog.Builder(this).apply {
                setMessage("ตอบผิด")
                setPositiveButton("ไปยังข้อถัดไป",{dialog,which ->
                    val intent = Intent(this@two, three::class.java)
                    startActivity(intent)
                })
            }
            val alertDialog = builder.create()
            alertDialog.show()
        }

        d.setOnClickListener {
            s++
            val intent = Intent(this@two, three::class.java)
            startActivity(intent)
        }
    }
}