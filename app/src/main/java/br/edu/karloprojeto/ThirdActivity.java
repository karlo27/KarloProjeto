package br.edu.karloprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity {

    private Button ok;
    private Button ok2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        ok = findViewById(R.id.button3);
        ok2 = findViewById(R.id.button4);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentsecond = new Intent(ThirdActivity.this, SecondActivity.class);
                startActivity(intentsecond);
            }
        });

        ok2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentthird = new Intent(ThirdActivity.this, MainActivity.class);
                startActivity(intentthird);

            }
        });
    }
}
