package com.example.holamundo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class HelloWorldActivity extends AppCompatActivity {
    private TextView tvMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helloworldactivity);
        tvMessage= (TextView)findViewById(R.id.tvMessage);
        tvMessage.setText(R.string.tvAdiosMundo);

        tvMessage.setTextColor(ContextCompat.getColor(this,R.color.Dark_blue));
        //tvMessage.setTextColor(getColor(R.color.Dark_blue)); Esto es otra opción para poner el color.
    }
}