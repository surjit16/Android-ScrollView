package com.example.surjit.scrollview;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.name);

    }

    public void doIntent(View view) {
        String a = editText.getText().toString();

        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        intent.putExtra("abc", a);
        startActivity(intent);
    }

    public void doCall(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("tel:9915094995"));
        startActivity(intent);
    }
}
