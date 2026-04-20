package Thigk2.HoQuangHiep;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button button_cn1, button_cn2, button_cn3, button_cn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_cn1 = findViewById(R.id.button_cn1);
        button_cn2 = findViewById(R.id.button_cn2);
        button_cn3 = findViewById(R.id.button_cn3);
        button_cn4 = findViewById(R.id.button_cn4);


        button_cn1.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, ChucNang1Activity.class))
        );


        button_cn2.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, ActivityChucNang2.class))
        );


        button_cn3.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, ActivityChucNang3.class))
        );


        button_cn4.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, ActivityChucNang4.class))
        );
    }
}