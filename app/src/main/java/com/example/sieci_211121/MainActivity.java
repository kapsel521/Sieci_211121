package com.example.sieci_211121;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button buttonConnect;
    Button buttonOn;
    Button buttonOff;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        buttonConnect = findViewById(R.id.button_connect);
        buttonOn = findViewById(R.id.button_on);
        buttonOff = findViewById(R.id.button_off);
        textView = findViewById(R.id.textView);
    }

    public void onClickConnect(View v){
        textView.setText("Button Connect został kliknięty");
        textView.setVisibility(View.VISIBLE);
    }

    public void onClickOn(View v){
        textView.setText("Button On został kliknięty");
        textView.setVisibility(View.VISIBLE);
    }

    public void onClickOff(View v){
        textView.setText("Button Off został kliknięty");
        textView.setVisibility(View.VISIBLE);
    }
}