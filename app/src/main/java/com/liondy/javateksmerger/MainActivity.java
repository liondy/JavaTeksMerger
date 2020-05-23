package com.liondy.javateksmerger;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText text1,text2;
    private TextView hasil;
    private Button btnMerge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.text1 = (EditText) findViewById(R.id.text1);
        this.text2 = (EditText) findViewById(R.id.text2);
        this.hasil = (TextView) findViewById(R.id.hasil);
        this.btnMerge = (Button) findViewById(R.id.btnMerge);

        this.btnMerge.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                hasil.setText(text1.getText()+" "+text2.getText());
                text1.setText("");
                text2.setText("");
            }
        });
    }
}
