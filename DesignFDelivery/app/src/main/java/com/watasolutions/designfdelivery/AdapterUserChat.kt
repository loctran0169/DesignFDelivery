package com.watasolutions.designfdelivery

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class AdapterUserChat : RecyclerView.Adapter<AdapterUserChat.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterUserChat.ViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_user_chat, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: AdapterUserChat.ViewHolder, position: Int) {
        if (position % 2 != 0)
            holder.run {
                num.visibility = View.INVISIBLE
                online.visibility = View.INVISIBLE
            }
        else {
            holder.run {
                message.setTextColor(Color.BLACK)
                message.typeface = Typeface.DEFAULT_BOLD;
            }
        }
        holder.itemView.setOnClickListener {
            it.context.startActivity(Intent(it.context, ChattingActivity::class.java))
        }
    }

    override fun getItemCount(): Int {
        return 10
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val num = view.findViewById<TextView>(R.id.num)
        val message = view.findViewById<TextView>(R.id.message)
        val online = view.findViewById<CircleImageView>(R.id.online)
    }
}