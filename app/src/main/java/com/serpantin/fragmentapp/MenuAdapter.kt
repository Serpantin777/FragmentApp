package com.serpantin.fragmentapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MenuAdapter(private val menuList: List<String>) : RecyclerView.Adapter<MenuViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {

        val menuItemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.menu_list_item, parent, false)

        return MenuViewHolder(menuItemView)
    }

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        val menuName = menuList[position]
        holder.bind(menuName)
    }

    override fun getItemCount(): Int {
        return menuList.size
    }
}