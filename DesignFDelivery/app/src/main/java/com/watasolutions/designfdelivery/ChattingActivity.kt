package com.watasolutions.designfdelivery

import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class ChattingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chatting)

        findViewById<ImageButton>(R.id.back).setOnClickListener {
            onBackPressed()
        }
    }
}