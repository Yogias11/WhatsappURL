package com.example.urlwa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.util.Linkify;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText tx1;
    Button btn;
    TextView tx2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tx1 = findViewById(R.id.txtNoWA);
        btn = findViewById(R.id.btnGenerateURL);
        tx2 = findViewById(R.id.txtURL);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputWA = tx1.getText().toString();
                if (inputWA.startsWith("0")) {
                    inputWA = inputWA.replaceFirst("0","62");}
                tx2.setText("https://api.whatsapp.com/send?phone="+inputWA);
                Linkify.addLinks(tx2, Linkify.ALL);
            }
        });
    }
}