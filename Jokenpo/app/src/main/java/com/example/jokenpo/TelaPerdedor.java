package com.example.jokenpo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaPerdedor extends AppCompatActivity {

    Button btnPerdeuVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_perdedor);

        btnPerdeuVoltar = findViewById(R.id.btnPerdeuVoltar);

        btnPerdeuVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaPerdedor.this, TelaJogo.class);
                startActivity(intent);
            }
        });
    }
}