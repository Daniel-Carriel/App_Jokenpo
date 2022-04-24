package com.example.jokenpo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TelaJogo extends AppCompatActivity {

    EditText editJogador;
    Button btnJogar, btnlimpar;
    TextView txtApp, txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_jogo2);

        editJogador = findViewById(R.id.editJogador);
        txtApp = findViewById(R.id.txtApp);
        txtResultado = findViewById(R.id.txtResultado);
        btnJogar = findViewById(R.id.btnJogar);
        btnlimpar = findViewById(R.id.btnLimpar);

        btnJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int jogador = Integer.parseInt(editJogador.getText().toString());
                int App = ((int) (Math.random() * 3 + 1));

                txtApp.setText(Integer.toString(App));


                switch (jogador){
                    case 1:
                        editJogador.setText("PEDRA");
                        break;
                    case 2:
                        editJogador.setText("PAPEL");
                        break;
                    case 3:
                        editJogador.setText("TESOURA");
                        break;
                    default:
                        txtResultado.setText("Jogador, escolha uma opção válida!");
                }

                switch (App){
                    case 1:
                        txtApp.setText("PEDRA");
                        break;
                    case 2:
                        txtApp.setText("PAPEL");
                        break;
                    case 3:
                        txtApp.setText("TESOURA");
                        break;
                }

                if (jogador == 1 && App == 3){
                    txtResultado.setText("PEDRA vence TESOURA \n\nJogador venceu!");
                } else if (jogador == 2 && App == 1){
                    txtResultado.setText("PAPEL vence PEDRA \n\nJogador venceu!");
                } else if (jogador == 3 && App == 2){
                    txtResultado.setText("TESOURA vence PAPEL \n\nJogador venceu!");
                } else if(jogador == App) {
                    txtResultado.setText("EMPATE");
                } else if (App == 1 && jogador == 3){
                    txtResultado.setText("PEDRA vence TESOURA \n\nAplicativo venceu!");
                } else if (App == 2 && jogador == 1){
                    txtResultado.setText("PAPEL vence PEDRA \n\nAplicativo venceu!");
                } else if (App == 3 && jogador == 2){
                    txtResultado.setText("TESOURA vence PAPEL \n\nAplicativo venceu!");
                }

            }
        });

        btnlimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editJogador.setText("");
                txtApp.setText("");
                txtResultado.setText("Resultado do Jogo");
            }
        });
    }
}