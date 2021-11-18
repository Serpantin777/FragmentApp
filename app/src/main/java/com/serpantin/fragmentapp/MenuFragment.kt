package com.serpantin.fragmentapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MenuFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?


    ): View? {

        val view = inflater.inflate(R.layout.fragment_menu, container, false)

        val menuList: List<String> = listOf(
            "Картофель", "Морковь", "Лук", "Капуста",
            "Свекла", "Молоко", "Яйца", "Мука", "Макароны", "Гречка", "Манка", "Рис"
        )

        val menuRecyclerView: RecyclerView = view.findViewById(R.id.menu_recycler_view)
        menuRecyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        menuRecyclerView.adapter = MenuAdapter(menuList)


                return view



    }


}