package com.example.juurbani.einzelbeispiel;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText eingabe1;
    private EditText eingabe2;
    private Button division;
    private TextView ergebnis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eingabe1 = (EditText) findViewById(R.id.zahl1);
        eingabe2 = (EditText) findViewById(R.id.zahl2);
        ergebnis = (TextView) findViewById(R.id.ergebnis);
        division = (Button) findViewById(R.id.btn_calculate);


        division.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                double zahl1;
                double zahl2;
                double ergebnis_zahl;

                zahl1 = Double.parseDouble(eingabe1.getText().toString());
                zahl2 = Double.parseDouble(eingabe2.getText().toString());

                if(zahl2 == 0){
                    ergebnis.setText("Sie können nicht durch 0 dividieren!");

                }else if(zahl1 == 0){
                    ergebnis.setText("0");

                }else {
                    ergebnis_zahl = zahl1 / zahl2;
                    ergebnis.setText(ergebnis_zahl + "");
                }
            }
        });

    }
}
