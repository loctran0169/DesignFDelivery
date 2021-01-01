package com.watasolutions.designfdelivery

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    lateinit var tabLayout: TabLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.order_activity)
        val listTab = listOf<String>("Tất cả", "Chờ giao hàng", "Chờ nhận hàng", "Đang giao", "Hoàn tất")
        tabLayout = findViewById<TabLayout>(R.id.tabhost)
        listTab.forEach {
            tabLayout.addTab(tabLayout.newTab().setText(it))
        }
        findViewById<TextView>(R.id.detail1).setOnClickListener {
            startActivity(Intent(this, DetailActivity::class.java))
        }
    }
}