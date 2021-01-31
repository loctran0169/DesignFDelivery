package com.watasolutions.designfdelivery

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayout

class FragmentOrder : Fragment() {
    lateinit var tabLayout: TabLayout
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val listTab =
            listOf<String>("Tất cả", "Chờ giao hàng", "Chờ nhận hàng", "Đang giao", "Hoàn tất")
        tabLayout = view.findViewById<TabLayout>(R.id.tabhost)
        listTab.forEach {
            tabLayout.addTab(tabLayout.newTab().setText(it))
        }
        view.findViewById<TextView>(R.id.detail1).setOnClickListener {
            requireContext().startActivity(Intent(requireContext(), DetailActivity::class.java))
        }

        view.findViewById<ImageButton>(R.id.rating).setOnClickListener {
            requireContext().startActivity(Intent(requireContext(), VoteActivity::class.java))
        }


    }
}