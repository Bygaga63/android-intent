package com.example.activites;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText nameText;
    private EditText ageText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = findViewById(R.id.button);
        nameText = findViewById(R.id.name);
        ageText = findViewById(R.id.age);

        Log.e("k", Person.class.getSimpleName());

        b.setOnClickListener((v) -> {
            Person p = new Person();
            p.setName(nameText.getText().toString());
            p.setAge(Integer.parseInt(ageText.getText().toString()));

            Intent intent = new Intent(MainActivity.this, ViewActivity.class);
            intent.putExtra("Exampe", "Hello!!");
            intent.putExtra(Person.class.getSimpleName(), p);
            startActivity(intent);
        });
    }
}
