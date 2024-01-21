package com.example.Currency;
import androidx.appcompat.app.AppCompatActivity;

import android.content.IntentFilter;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.example.helloandroid.R;
public class MainActivity extends AppCompatActivity {

      RadioGroup radioGroup;
      RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.Group);

    }
    public void ButtonClick(View v){

        int selectId = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(selectId);


        Intent myIntent = new Intent(this, SecondActivity2.class);

        myIntent.putExtra("currency", radioButton.getText());

        startActivity(myIntent);

    }
}
