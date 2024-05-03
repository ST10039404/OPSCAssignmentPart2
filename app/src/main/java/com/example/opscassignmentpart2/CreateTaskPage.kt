package com.example.opscassignmentpart2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.sql.Date
import java.sql.Time

class CreateTaskPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.create_task)


        val backButton = findViewById<Button>(R.id.BackButton1)
        backButton.setOnClickListener {
            val intent = Intent(this, TaskPage::class.java)
            startActivity(intent)
        }

        val submitButton = findViewById<Button>(R.id.SubmitTaskButton)
        submitButton.setOnClickListener {
        addTask()
        }
    }

    private fun addTask() {
        if (findViewById<EditText>(R.id.TaskNameInput).text.toString() != ("") || findViewById<EditText>(R.id.CategoryInput).text.toString() != "") {
            try {

                val taskNameInput = findViewById<EditText>(R.id.TaskNameInput).text.toString()
                val categoryInput = findViewById<EditText>(R.id.CategoryInput).text.toString()
                val startDateInput =
                    Date.valueOf(findViewById<EditText>(R.id.startDateInput).text.toString())
                val endDateInput =
                    Date.valueOf(findViewById<EditText>(R.id.endDateInput).text.toString())
                val startTimeInput =
                    Time.valueOf(findViewById<EditText>(R.id.startTimeInput).text.toString())
                val endTimeInput =
                    Time.valueOf(findViewById<EditText>(R.id.endTimeInput).text.toString())

                MainActivity.TaskManager.taskList.add(
                    Task(
                        taskNameInput,
                        categoryInput,
                        startDateInput,
                        endDateInput,
                        startTimeInput,
                        endTimeInput
                    )
                )

            } finally {
                findViewById<EditText>(R.id.TaskNameInput).setText("")
                findViewById<EditText>(R.id.CategoryInput).setText("")
                findViewById<EditText>(R.id.startDateInput).setText("")
                findViewById<EditText>(R.id.endDateInput).setText("")
                findViewById<EditText>(R.id.startTimeInput).setText("")
                findViewById<EditText>(R.id.endTimeInput).setText("")
            }
        }
    }
}
