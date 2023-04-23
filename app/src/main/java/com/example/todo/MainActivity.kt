package com.example.todo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.TextView
import android.widget.Toast
import com.example.todo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val  taskList = arrayListOf<String>()
        taskList.add("GO for Interview")
        taskList.add("Do House work ")
        taskList.add("Learn Android Dev ")

        val adapterFormTasklet = ArrayAdapter( this , android.R.layout.simple_list_item_1 , taskList)
        binding.listView.adapter = adapterFormTasklet

        binding.listView.setOnItemClickListener { adapterView, view, i, l ->
            val text = "clicked  on item " + (view as TextView).text.toString()
            Toast.makeText(this, text , Toast.LENGTH_SHORT).show()
        }


    }
}