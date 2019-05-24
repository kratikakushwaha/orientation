package com.example.orientation;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   private static  String TAG=MainActivity.class.getSimpleName();

  private EditText e1;
  TextView txt;
  Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"is method onCreate");
        e1=findViewById(R.id.editText);
        txt=findViewById(R.id.textView);
        btn=findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ettxt=e1.getText().toString();
                txt.setText(ettxt);


            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"is method onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"is method onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"is method onPause");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG,"is method onSaveInstanceState");
        String save=txt.getText().toString();
        outState.putString("name",save);

    }

   @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG,"is method onRestoreInstanceState");

        txt.setText(savedInstanceState.getString("name"));
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"is method onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"is method onDestroy");
    }
}
