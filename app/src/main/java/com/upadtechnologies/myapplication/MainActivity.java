package com.upadtechnologies.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button myButton = findViewById(R.id.my_button);
        final TextView textView = findViewById(R.id.my_text_view);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("");
                counter++;
                textView.setText(Integer.toString(counter));

            }
        });
    }
}
