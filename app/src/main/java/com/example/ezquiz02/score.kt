package com.example.ezquiz02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ezquiz02.one.Companion.s
import kotlinx.android.synthetic.main.activity_score.*

class score : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)

        var ans = s
        score.setText("$ans")
    }
}