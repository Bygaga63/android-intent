package com.example.activites;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ViewActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        textView = findViewById(R.id.textView);
        Bundle args = getIntent().getExtras();
        if (args != null){
            Person p = (Person) args.getSerializable(Person.class.getSimpleName());
            textView.setText(p.toString());

        }
    }
}
