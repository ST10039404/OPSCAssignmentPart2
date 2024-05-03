package com.example.opscassignmentpart2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.sql.Date
import java.sql.Time

class TaskPage : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var taskAdapter: TaskAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.task)

        recyclerView = findViewById(R.id.taskRecyclerView);
        recyclerView.layoutManager = LinearLayoutManager(this)

        val taskList = MainActivity.TaskManager.taskList;
        taskAdapter = TaskAdapter(taskList)
        recyclerView.adapter = taskAdapter


        val createTaskPageButton = findViewById<Button>(R.id.AddNewTaskButton)
        createTaskPageButton.setOnClickListener {
            val intent = Intent(this, TaskPage::class.java)
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        taskAdapter.updateTaskList(MainActivity.TaskManager.taskList)
    }
}