package com.watasolutions.designfdelivery

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    var id = R.id.home

    @SuppressLint("CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
            .replace(R.id.host, FragmentOrder(), "order")
            .commit()

        findViewById<BottomNavigationView>(R.id.bottom).selectedItemId = R.id.order

        findViewById<BottomNavigationView>(R.id.bottom).setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.order -> {
                    try {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.host, FragmentOrder(), "order")
                            .commit()
                        id = R.id.order
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
                        id = R.id.chat
                        true
                    } catch (ex: Exception) {
                        true
                    }
                }
                R.id.menu -> {

                    true
                }
                else -> true
            }
        }
    }

    override fun onResume() {
        super.onResume()
        findViewById<BottomNavigationView>(R.id.bottom).selectedItemId = id
    }
}