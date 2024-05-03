package com.example.opscassignmentpart2;

import android.view.ViewGroup;
import android.view.View;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

class TaskViewHolder extends RecyclerView.ViewHolder {

    private TextView mName;
    private TextView mCategory;
    private TextView mStartDate;
    private TextView mEndDate;
    private TextView mStartTime;
    private TextView mEndTime;

    public TaskViewHolder(@NonNull View itemView) {
        super(itemView);
        mName = itemView.findViewById(R.id.taskNameDisplay);
        mCategory = itemView.findViewById(R.id.categoryDisplay);
        mStartDate = itemView.findViewById(R.id.startDateDisplay);
        mEndDate = itemView.findViewById(R.id.endDateDisplay);
        mStartTime = itemView.findViewById(R.id.startTimeDisplay);
        mEndTime = itemView.findViewById(R.id.endTimeDisplay);
    }

    public void bind(Task task) {
        mName.setText(task.getName());
        mCategory.setText(task.getCategory());
        mStartDate.setText(task.getStartDate().toString());
        mEndDate.setText(task.getEndDate().toString());
        mStartTime.setText(task.getStartTime().toString().substring(0,task.getStartTime().toString().length()-3));
        mEndTime.setText(task.getEndTime().toString().substring(0,task.getEndTime().toString().length()-3));
    }
}
