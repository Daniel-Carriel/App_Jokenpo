package com.example.jokenpo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaVencedor extends AppCompatActivity {

    Button btnVenceuVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_vencedor);

        btnVenceuVoltar = findViewById(R.id.btnVenceuVoltar);

        btnVenceuVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaVencedor.this, TelaJogo.class);
                startActivity(intent);
            }
        });
    }
}