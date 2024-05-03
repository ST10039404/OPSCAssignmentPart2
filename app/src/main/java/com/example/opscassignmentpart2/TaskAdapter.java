package com.example.opscassignmentpart2;

import android.view.ViewGroup;
import android.view.View;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TaskAdapter extends RecyclerView.Adapter<TaskViewHolder> {
    private List<Task> taskList;
    public TaskAdapter( List<Task> taskList) {
        this.taskList = taskList;
    }
    public void updateTaskList(List<Task> newTaskList) {
        this.taskList = newTaskList;
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public TaskViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_task_item, parent, false);
        return new TaskViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TaskViewHolder holder, int position) {
        Task task = taskList.get(position);
        holder.bind(task);
    }

    @Override
    public int getItemCount() {
        return taskList.size();
    }
}
