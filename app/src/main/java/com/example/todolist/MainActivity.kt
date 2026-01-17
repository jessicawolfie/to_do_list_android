package com.example.todolist

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.todolist.databinding.ActivityMainBinding
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var taskAdapter: TaskAdapter

    private val tasksList = mutableListOf<Task>()

    private val sharedPrefsName = "ToDoListPrefs"
    private val taskKey = "tasks"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupRecyclerView()
        loadTasks()
        setupListeners()
    }

    private fun setupRecyclerView() {
        taskAdapter = TaskAdapter(tasksList) { position ->
            removeTask(position)
        }

        binding.recyclerViewTasks.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = taskAdapter
        }
    }

    private fun setupListeners() {
        binding.buttonAdd.setOnClickListener {
            addTask()
        }
    }

    private fun addTask() {
        val taskName = binding.editTextTask.text.toString().trim()

        if (taskName.isEmpty()) {
            Toast.makeText(this, "Please enter a task", Toast.LENGTH_SHORT).show()
            return
        }

        val task = Task(taskName)
        tasksList.add(task)
        taskAdapter.notifyItemInserted(tasksList.size - 1)

        binding.editTextTask.text.clear()
        saveTasks()

        Toast.makeText(this, "Task added", Toast.LENGTH_SHORT).show()
    }

    private fun removeTask(position: Int) {
        tasksList.removeAt(position)
        taskAdapter.notifyItemRemoved(position)
        saveTasks()

        Toast.makeText(this, "Task removed", Toast.LENGTH_SHORT).show()
    }

    private fun saveTasks() {
        val sharedPreferences = getSharedPreferences(sharedPrefsName, MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        val gson = Gson()

        val json = gson.toJson(tasksList)
        editor.putString(taskKey, json)
        editor.apply()
    }

    private fun loadTasks() {
        val sharedPreferences = getSharedPreferences(sharedPrefsName, MODE_PRIVATE)
        val gson = Gson()
        val json = sharedPreferences.getString(taskKey, null)

        if (json != null) {
            val type = object : TypeToken<MutableList<Task>>() {}.type
            val savedTasks: MutableList<Task> = gson.fromJson(json, type)

            tasksList.clear()
            tasksList.addAll(savedTasks)
            taskAdapter.notifyDataSetChanged()
        }
    }
}
