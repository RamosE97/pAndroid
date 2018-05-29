package com.curso.app01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Second extends AppCompatActivity {

    private TextView nombre;
    private TextView apellido;
    private TextView email;
    private TextView pasw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        nombre=(TextView)findViewById(R.id.lblNombre);
        apellido=(TextView)findViewById(R.id.lblApellido);
        email=(TextView)findViewById(R.id.lblEmail);
        pasw=(TextView)findViewById(R.id.lblPass);

        //Tomar datos del intent
        Bundle bundle=getIntent().getExtras();
        if(bundle!=null) {
            nombre.setText(bundle.getString("Nombre"));
            apellido.setText(bundle.getString("Apellido"));
            email.setText(bundle.getString("Email"));
            pasw.setText(bundle.getString("Passw"));
        }else{
            Toast.makeText(getApplicationContext(), "No hay valores", Toast.LENGTH_LONG).show();
        }

    }
}
