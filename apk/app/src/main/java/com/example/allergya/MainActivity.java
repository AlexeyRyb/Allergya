package com.example.allergya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private Button changeToAlarm;
    private TextView textDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
        changeDate();
    }

    public void addListenerOnButton()
    {

        changeToAlarm = findViewById(R.id.alarmButton);

        changeToAlarm.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intentAlarm = new Intent(".alarmActivity");
                        startActivity(intentAlarm);
                    }
                }
        );
    }

    public void changeDate()
    {

        textDate = findViewById(R.id.date);

        Date date = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat((" dd.MM.yyyy hh.mm.ss"));

        textDate.setText(formatForDateNow.format(date));
    }
}
