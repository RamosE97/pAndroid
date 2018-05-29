package com.curso.app01;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    //Declaración de variables
    Button btnRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Inicializando controles
        this.btnRegistrar =(Button)findViewById(R.id.btnRegistrar);
        //Codificando el evento
        this.btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = ((EditText)findViewById(R.id.txtNombreUsuario)).getText().toString();
                String apellido = ((EditText)findViewById(R.id.txtApellidosUsuario)).getText().toString();
                String email = ((EditText)findViewById(R.id.txtEmail)).getText().toString();
                String passw = ((EditText)findViewById(R.id.txtPassword)).getText().toString();
                Intent intento = new Intent(getApplicationContext(), Second.class);
                intento.putExtra("Nombre", nombre);
                intento.putExtra("Apellido", apellido);
                intento.putExtra("Email", email);
                intento.putExtra("Passw", passw);
                startActivity(intento);
            }
        });

    }

}
