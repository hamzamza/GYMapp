package com.gymapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class TrainingActivity extends AppCompatActivity {
private RecyclerView cycle ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training);
cycle = findViewById(R.id.cycletrainig);
Utils.initTrainings();
TrainingAdapter  adapter = new TrainingAdapter(Utils.getTrainings(),this) ;
cycle.setAdapter(adapter);
cycle.setLayoutManager(new GridLayoutManager(this,2));
    }
}