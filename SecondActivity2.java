package com.example.Currency;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import com.example.helloandroid.R;

import java.util.Objects;

public class SecondActivity2 extends AppCompatActivity {
public String str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);

 str = getIntent().getStringExtra("currency");

 @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView txt = findViewById(R.id.CurrenciesDisplay);
txt.setText(str);


    }
    public void FromUSD(View v){
        double canadian = 1.26, yen = 109.94, euro = 0.85, ans;
        EditText first = (EditText) findViewById(R.id.Text1);
        EditText second = (EditText) findViewById(R.id.Text2);

       String american, foreing;


        if (Objects.equals(str, "CAD")){
            american = first.getText().toString();
            double dollar = Double.parseDouble(american);
            ans = dollar*canadian;
            foreing = Double.toString(ans);
            second.setText(foreing);
        }
        if (Objects.equals(str, "YEN")){
            american = first.getText().toString();
            double dollar = Double.parseDouble(american);
            ans = dollar *yen;
            foreing = Double.toString(ans);
            second.setText(foreing);

        }
        if(Objects.equals(str, "EUR")){
            american = first.getText().toString();
            double dollar = Double.parseDouble(american);
            ans = dollar * euro;
            foreing = Double.toString(ans);
            second.setText(foreing);
        }
    }

    public void toUSD(View v) {
        double canadian = 1.26, yen = 109.94, euro = 0.85, ans;
        EditText first = (EditText) findViewById(R.id.Text1);
        EditText second = (EditText) findViewById(R.id.Text2);

        String american, foreing;

        if(str.compareTo("CAD")==0)
        {
            foreing = second.getText().toString();
            double exchange = Double.parseDouble(foreing);
            ans = exchange / canadian;
            american = Double.toString(ans);
            first.setText(american);
        }

        if(str.compareTo("YEN")==0)
        {
            foreing = second.getText().toString();
            double exchange = Double.parseDouble(foreing);
            ans = exchange / yen;
            american = Double.toString(ans);
            first.setText(american);
        }
        if(str.compareTo("EUR")==0){
            foreing = second.getText().toString();
            double exchange = Double.parseDouble(foreing);
            ans = exchange / euro;
            american = Double.toString(ans);
            first.setText(american);
        }

    }







    public void OnBack(View v){
        finish();
    }
}
