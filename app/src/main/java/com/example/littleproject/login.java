package com.example.littleproject;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class login extends AppCompatActivity {

    Button btn_cadastre,btn_mostrar;
    EditText edtlogin,edtidade,edtnome;
    TextView tvinfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_cadastre = findViewById(R.id.btn_cadastre);
        btn_mostrar = findViewById(R.id.btn_mostrar);
        edtlogin = findViewById(R.id.edtLogin);
        edtidade = findViewById(R.id.edtIdade);
        edtnome = findViewById(R.id.edtNome);
        tvinfo = findViewById(R.id.tvinfo);

        edtlogin.requestFocus();

        btn_cadastre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences prefs = getSharedPreferences( "chaveGeral", MODE_PRIVATE);
                SharedPreferences.Editor editor = prefs.edit();
                editor.putString("chavelogin", edtlogin.getText().toString());
                editor.putString("chaveNome", edtnome.getText().toString());
                editor.putString("chaveIdade", edtidade.getText().toString());
                editor.commit();
                Toast.makeText(login.this, "Cadastrado com sucesso", Toast.LENGTH_SHORT).show();
            }
        });

btn_mostrar.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String login, nome, idade;
        SharedPreferences prefs = getSharedPreferences("chaveGeral", MODE_PRIVATE);

        login=prefs.getString("chavelogin", "");
        nome=prefs.getString("chaveNome", "");
        idade=prefs.getString("chaveIdade", "");

        tvinfo.setText("Login: "+login+"\n" +"Idade: "+idade+"\n"+"Nome: "+nome);
    }
});
    }
}