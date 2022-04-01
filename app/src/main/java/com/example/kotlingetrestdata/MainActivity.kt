package com.example.kotlingetrestdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var todoList= mutableListOf(
            TodoModel("bulaşıklar",false),
            TodoModel("çamaşırlar",false),
            TodoModel("ders",false),
            TodoModel("uyku",false),
            TodoModel("banyo",true),
            TodoModel("Kodlama yapmka dawdawd",true),
            TodoModel("hayatı sorgula",true),)

        val adapter=TodoAdapter(todoList)
     rvTodo.adapter=adapter
        rvTodo.layoutManager=LinearLayoutManager(this)

        btnTodo.setOnClickListener {
            val title=etTodo.text.toString()

            val itemTodo=TodoModel(title,false)
            todoList.add(
                itemTodo
            )
            adapter.notifyItemInserted(todoList.size-1)
            etTodo.text.clear()
        }
    }
}