package com.watasolutions.designfdelivery

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    lateinit var tabLayout: TabLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val listTab = listOf<String>("Tất cả", "Chờ giao hàng", "Chờ nhận hàng", "Đang giao", "Hoàn tất")
//        tabLayout = findViewById<TabLayout>(R.id.tabhost)
//        listTab.forEach {
//            tabLayout.addTab(tabLayout.newTab().setText(it))
//        }
//        findViewById<TextView>(R.id.detail1).setOnClickListener {
//            startActivity(Intent(this, DetailActivity::class.java))
//        }

        supportFragmentManager.beginTransaction()
            .replace(R.id.host, FragmentOrder(), "order")
            .commit()

        val listener =
            findViewById<BottomNavigationView>(R.id.bottom).setOnNavigationItemSelectedListener {
                println("### click")
                when (it.itemId) {
                    R.id.order -> {
                        try {
                            supportFragmentManager.beginTransaction()
                                .replace(R.id.host, FragmentOrder(), "order")
                                .commit()
                            true
                        } catch (ex: Exception) {
                            true
                        }
                    }
                    R.id.chat -> {
                        try {
                            supportFragmentManager.beginTransaction()
                                .replace(R.id.host, FragmentChat(), "chat")
                                .commit()
                            true
                        } catch (ex: Exception) {
                            true
                        }
                    }
                    else -> true
                }
            }
    }
}