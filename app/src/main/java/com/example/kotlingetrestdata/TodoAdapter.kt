package com.example.kotlingetrestdata

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlingetrestdata.databinding.ItemTodoBinding

class TodoAdapter(
    var items:List<TodoModel>
):RecyclerView.Adapter<TodoAdapter.TodoViewHolder>() {

    inner  class  TodoViewHolder(var binding: ItemTodoBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
      val layoutInflater=LayoutInflater.from(parent.context)
        val binding=ItemTodoBinding.inflate(layoutInflater,parent,false)
        return TodoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
    holder.binding.apply {
       tvDone.text=items[position].item
        cbDone.isChecked=items[position].isChecked
    }
    }

    override fun getItemCount(): Int {
      return  items.size
    }
}
