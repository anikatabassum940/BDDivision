package com.anika.bddivision;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    Button btnDhaka,btnCtg,btnRajshahi,btnBarishal,btnKhulna,btnSylhet,btnRangpur,btnMymensingh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnDhaka=findViewById(R.id.btn_dhaka);
        btnCtg=findViewById(R.id.btn_ctg);
        btnKhulna=findViewById(R.id.btn_khulna);
        btnRajshahi=findViewById(R.id.btn_rajshahi);
        btnBarishal=findViewById(R.id.btn_barishal);
        btnSylhet=findViewById(R.id.btn_sylhet);
        btnRangpur=findViewById(R.id.btn_rangpur);
        btnMymensingh=findViewById(R.id.btn_mymensingh);

        btnDhaka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Home.this,Details.class);
                intent.putExtra("id","1");
                startActivity(intent);

            }
        });

        btnCtg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Home.this,Details.class);
                intent.putExtra("id","2");
                startActivity(intent);

            }
        });

        btnKhulna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Home.this,Details.class);
                intent.putExtra("id","3");
                startActivity(intent);

            }
        });

        btnRajshahi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Home.this,Details.class);
                intent.putExtra("id","4");
                startActivity(intent);

            }
        });

        btnBarishal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Home.this,Details.class);
                intent.putExtra("id","5");
                startActivity(intent);

            }
        });

        btnSylhet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Home.this,Details.class);
                intent.putExtra("id","6");
                startActivity(intent);

            }
        });

        btnRangpur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Home.this,Details.class);
                intent.putExtra("id","7");
                startActivity(intent);

            }
        });

        btnMymensingh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Home.this,Details.class);
                intent.putExtra("id","8");
                startActivity(intent);

            }
        });


    }
}
