package com.example.pedra_papel_tesoura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void escolhePedra(View view) {
        this.escolhaPessoa("pedra");
    }

    public void escolhePapel(View view) {
        this.escolhaPessoa("papel");
    }

    public void escolheTesoura(View view) {
        this.escolhaPessoa("tesoura");
    }


    public void escolhaPessoa(String escolhaApp) {

        ImageView imageView = findViewById(R.id.imageEscolhaApp);


        int num = new Random().nextInt(3);
        String[] itens = {"pedra", "papel", "tesoura"};
        String opcaoApp = itens[num];

        switch (opcaoApp) {
            case "pedra":
                imageView.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                imageView.setImageResource(R.drawable.papel);
                break;

            case "tesoura":
                imageView.setImageResource(R.drawable.tesoura);
                break;
        }

        

        System.out.println("teste: " + opcaoApp);
    }


}