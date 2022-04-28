package com.example.drsasho

import android.graphics.Color
import android.os.Bundle
import android.util.TypedValue
import android.view.Gravity
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import androidx.fragment.app.FragmentActivity
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


class MainActivity2 : AppCompatActivity() {

    private lateinit var adapters: Adapters
    private lateinit var viewPager: ViewPager2
    private lateinit var tabLayout: TabLayout
    private val tabNames: Array<String> = arrayOf(
        "Желаем тебе: свежести сознания",
        "Много интересного контента",
        "Новых идей и озарений",
        "Не стесняться себя",
        "Поменьше стрессов в жизни",
        "Теплых и уютных вечеров",
        "Чувства полета и воздушности",
        "Вдоволь высыпаться",
        "Побольше котиков и ласки",
        "Не иметь жалоб на работе",
        "Больше отдыхать",
        "Много удачных фотографий",
        "Всегда оставаться элегантным",
        "Поменьше есть всякую гадость",
        "Иметь подход к сотрудникам",
        "Не отчаиваться и быть стойким",
        "Жить в комфорте и достатке",
        "Быть красивым всегда и везде",
        "Господствовать в хаосе",
        "Вкусно и сладко кушать",
        "Иметь хорошего парикмахера",
        "Видеть на шаг вперед",
        "Стареть красиво и стильно",
        "Быть всегда здоровым",
        "Не бояться опасностей",
        "Иметь тело Апполона",
        "Любить нас долго и сильно!"
    )

    //-----------------------------------------------------

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //---------------------------------------

        var list = mutableListOf<Int>()

        list.add(R.drawable.a)
        list.add(R.drawable.b)
        list.add(R.drawable.c)
        list.add(R.drawable.d)
        list.add(R.drawable.e)
        list.add(R.drawable.f)
        list.add(R.drawable.g)
        list.add(R.drawable.h)
        list.add(R.drawable.i)
        list.add(R.drawable.j)
        list.add(R.drawable.k)
        list.add(R.drawable.l)
        list.add(R.drawable.m)
        list.add(R.drawable.n)
        list.add(R.drawable.o)
        list.add(R.drawable.p)
        list.add(R.drawable.q)
        list.add(R.drawable.s)
        list.add(R.drawable.t)
        list.add(R.drawable.u)
        list.add(R.drawable.v)
        list.add(R.drawable.w)
        list.add(R.drawable.x)
        list.add(R.drawable.y)
        list.add(R.drawable.z)
        list.add(R.drawable.zz)
        list.add(R.drawable.xx)

        adapters = Adapters(this)
        adapters.setContentList(list)
        viewPager = findViewById(R.id.viewpager1)
        viewPager.adapter = adapters

        //------------------------------------------

        tabLayout = findViewById(R.id.tab_layout)
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = tabNames[position]
        }.attach()

    }

}