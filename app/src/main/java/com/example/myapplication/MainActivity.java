package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

import models.Admin;

public class MainActivity extends AppCompatActivity {
    Admin ad = new Admin();
    private TextView usu;
    private TextView cl;
    private Button bt;
    private String clav ;
    private String userd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        try {
            usu =  findViewById(R.id.usuatio);
            cl =  findViewById(R.id.clave);
            bt =  findViewById(R.id.Accion);
            bt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    userd = usu.getEditableText().toString();
                    clav = cl.getEditableText().toString();

                    if (Objects.equals(userd, ad.getUsuario())) {
                        if(Objects.equals(clav, ad.getClave())){

                        Intent i = new Intent(getBaseContext(), Detalles.class);
                        startActivity(i);
    }
                    } else {
                        Toast.makeText(getApplicationContext(),"Clave o Usuario incorrectos",Toast.LENGTH_LONG).show();
                    }

                }
            });
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
