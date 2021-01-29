package com.watasolutions.designfdelivery

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class VoteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vote)
        findViewById<ImageView>(R.id.btnComment).setOnClickListener {
            startActivity(Intent(this, CommentActivity::class.java))
        }

        findViewById<RecyclerView>(R.id.rcvVote).run {
            layoutManager = LinearLayoutManager(context)
            adapter = AdapterComment()
        }

        findViewById<TextView>(R.id.comment).setOnClickListener {
            startActivity(Intent(this, VoteAllActivity::class.java))
        }
    }
}