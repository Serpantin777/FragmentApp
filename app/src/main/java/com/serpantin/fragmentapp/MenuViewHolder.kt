package com.serpantin.fragmentapp

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MenuViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(menuName: String) {
      val menuNameTextView:TextView = itemView.findViewById(R.id.menu_name_text_view)
        menuNameTextView.text = menuName
    }


}