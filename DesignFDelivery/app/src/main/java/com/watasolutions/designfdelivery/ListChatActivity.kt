package com.watasolutions.designfdelivery

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListChatActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_chat)

        findViewById<RecyclerView>(R.id.rcvUserChat).run {
            layoutManager = LinearLayoutManager(context)
            adapter = AdapterUserChat()
        }
    }
}