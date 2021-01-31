package com.watasolutions.designfdelivery

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        findViewById<ImageButton>(R.id.detail_back).setOnClickListener {
            onBackPressed()
        }

        findViewById<ImageButton>(R.id.chat).setOnClickListener {
            startActivity(Intent(this, ChattingActivity::class.java))
        }
    }
}