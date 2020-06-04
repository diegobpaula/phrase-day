package com.ferratone.frasedodia;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){

        String[] frases = {"O importante não é vencer todos os dias, mas lutar sempre. - Waldemar Valle Martins",
                "Maior que a tristeza de não haver vencido é a vergonha de não ter lutado! - Rui Barbosa",
        "É melhor conquistar a si mesmo do que vencer mil batalhas. - Buda",
        "Quem ousou conquistar e saiu pra lutar, chega mais longe! - Charlie Brown Jr",
        "Enquanto houver vontade de lutar haverá esperança de vencer. - Santo Agostinho",
        "Difícil é ganhar um amigo em uma hora; fácil é ofendê-lo em um minuto. - Provérbio Chinês",
        "O medo de perder tira a vontade de ganhar. - Wanderley Luxemburgo",
        "Escolher o seu tempo é ganhar tempo. - Francis Bacon",
        "Perder para a razão, sempre é ganhar. - Aldo Novak",
        "Arriscamo-nos a perder quando queremos ganhar demais. - Jean de La Fontaine"};

        TextView novaFrase = findViewById(R.id.texto_Id);

        int gerarFrase = new Random().nextInt(10);
        novaFrase.setText("" + frases[gerarFrase]);

    }

    public void displayAlert() {

        new AlertDialog.Builder(MainActivity.this)
                .setTitle("Message")
                .setMessage("Deleted phrase - Press OK to close")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                }).show();
    }

    public void clear(View view){
        TextView novaFrase = findViewById(R.id.texto_Id);
        novaFrase.setText("");
            this.displayAlert();
    }
}
