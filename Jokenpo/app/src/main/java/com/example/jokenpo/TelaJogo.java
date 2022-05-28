package com.example.jokenpo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TelaJogo extends AppCompatActivity {
    int pontoJogador = 0, pontoApp = 0;

    EditText editJogador;
    Button btnJogar, btnlimpar;
    TextView txtApp, txtResultado, txtPontoJogador, txtPontoApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_jogo2);

        editJogador     = findViewById(R.id.editJogador);
        txtApp          = findViewById(R.id.txtApp);
        txtResultado    = findViewById(R.id.txtResultado);
        txtPontoJogador = findViewById(R.id.txtPontoJogador);
        txtPontoApp     = findViewById(R.id.txtPontoApp);
        btnJogar        = findViewById(R.id.btnJogar);
        btnlimpar       = findViewById(R.id.btnLimpar);



        btnJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int jogador = Integer.parseInt(editJogador.getText().toString());
                int app = ((int) (Math.random() * 3 + 1));


                switch (jogador) {
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

                    switch (app) {
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

                    if (jogador == 1 && app == 3) {
                        txtResultado.setText("PEDRA vence TESOURA \n\nJogador venceu!");
                        pontoJogador += 1;
                        txtPontoJogador.setText(Integer.toString(pontoJogador));

                    } else if (jogador == 2 && app == 1) {
                        txtResultado.setText("PAPEL vence PEDRA \n\nJogador venceu!");
                        pontoJogador += 1;
                        txtPontoJogador.setText(Integer.toString(pontoJogador));

                    } else if (jogador == 3 && app == 2) {

                        txtResultado.setText("TESOURA vence PAPEL \n\nJogador venceu!");
                        pontoJogador += 1;
                        txtPontoJogador.setText(Integer.toString(pontoJogador));

                    } else if (jogador == app) {

                        txtResultado.setText("EMPATE");

                    } else if (app == 1 && jogador == 3) {

                        txtResultado.setText("PEDRA vence TESOURA \n\nAplicativo venceu!");
                        pontoApp += 1;
                        txtPontoApp.setText(Integer.toString(pontoApp));

                    } else if (app == 2 && jogador == 1) {

                        txtResultado.setText("PAPEL vence PEDRA \n\nAplicativo venceu!");
                        pontoApp += 1;
                        txtPontoApp.setText(Integer.toString(pontoApp));

                    } else if (app == 3 && jogador == 2) {

                        txtResultado.setText("TESOURA vence PAPEL \n\nAplicativo venceu!");
                        pontoApp += 1;
                        txtPontoApp.setText(Integer.toString(pontoApp));
                    }

                    if (pontoJogador == 10){
                        pontoApp = 0;
                        pontoJogador = 0;
                        txtPontoApp.setText(Integer.toString(pontoApp));
                        txtPontoApp.setText(Integer.toString(pontoJogador));
                        Intent intent = new Intent(TelaJogo.this, TelaVencedor.class);
                        startActivity(intent);
                    } else if(pontoApp == 10){
                        pontoApp = 0;
                        pontoJogador = 0;
                        txtPontoApp.setText(Integer.toString(pontoApp));
                        txtPontoApp.setText(Integer.toString(pontoJogador));
                        Intent intent = new Intent(TelaJogo.this, TelaPerdedor.class);
                        startActivity(intent);
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