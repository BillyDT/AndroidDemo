package com.dt.billy.androiddemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class SpinnerTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_test);

        Spinner spinner = findViewById(R.id.spinner2_5_6);
        String[] arr = {"猪八戒", "孙悟空", "唐僧"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout
                .simple_list_item_multiple_choice, arr);
        spinner.setAdapter(adapter);
    }
}
