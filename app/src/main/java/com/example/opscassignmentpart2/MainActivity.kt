package com.example.opscassignmentpart2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.sql.Date
import java.sql.Time

class MainActivity : AppCompatActivity() {

    object TaskManager {
        val taskList = ArrayList<Task>()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.start)

        val intent = Intent(this, TaskPage::class.java)
        startActivity(intent)
        }

}
