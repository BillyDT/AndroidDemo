package com.dt.billy.androiddemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class AutoCompleteTextViewTest extends AppCompatActivity {

    String[] books = new String[]{
            "疯狂Java讲义",
            "疯狂Ajax讲义",
            "疯狂Android讲义",
            "疯狂XML讲义"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete_text_view_test);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout
                .simple_dropdown_item_1line, books);
        AutoCompleteTextView autoCompleteTextView = findViewById(R.id.auto2_5_3);
        MultiAutoCompleteTextView multiAutoCompleteTextView = findViewById(R.id.mauto2_5_3);

        autoCompleteTextView.setAdapter(adapter);
        multiAutoCompleteTextView.setAdapter(adapter);
        //为MultiAutoCompleteTextView设置分隔符
        multiAutoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }
}
