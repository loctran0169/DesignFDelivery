package com.watasolutions.designfdelivery

import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.tabs.TabLayout

class VoteAllActivity : AppCompatActivity() {

    lateinit var tabLayout: TabLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vote_all)

        val listTab =
            listOf<String>("Tất cả", "Tích cực", "Tiêu cực", "Bình chọn")
        tabLayout = findViewById<TabLayout>(R.id.tabhost)
        listTab.forEach {
            tabLayout.addTab(tabLayout.newTab().setText(it))
        }

        findViewById<ImageButton>(R.id.back).setOnClickListener {
            onBackPressed()
        }

        findViewById<RecyclerView>(R.id.rcvVoteAll).run {
            layoutManager = LinearLayoutManager(context)
            adapter = AdapterComment()
        }
    }
}