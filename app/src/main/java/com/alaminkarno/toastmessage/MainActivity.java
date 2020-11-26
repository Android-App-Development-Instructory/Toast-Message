package com.alaminkarno.toastmessage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button(View view) {

        Log.v("alamin","Button clicked");

        Toast.makeText(this, "This is a Toast", Toast.LENGTH_SHORT).show();
    }

    public void toast(View view) {

        Log.v("alamin","Toast clicked");

        Toast toast = Toast.makeText(MainActivity.this,"This is custom Toast",Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.show();
    }
}