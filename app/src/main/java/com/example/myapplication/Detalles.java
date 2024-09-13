package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import models.Value;

public class Detalles extends AppCompatActivity {


    Value val = new Value();
    private Button datos;
    private Button resultado;
    private TextView ficha;
    private TextView valor;
    private TextView recargo;
    private TextView total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detalles);

        datos = findViewById(R.id.Datos);
        resultado = findViewById(R.id.Values);
        ficha = findViewById(R.id.Ficha);
        valor = findViewById(R.id.Valor);
        recargo = findViewById(R.id.Recargo);
        total = findViewById(R.id.Total);

        datos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ficha.setText(" FICHA AUTOMOTIZ:  " + val.getNombre() + "  " +
                        "        Año: " + val.getAño() + "      " +
                        "        Estado: " + val.getEstado());
                Toast.makeText(getApplicationContext(),"Valores Encontrados",Toast.LENGTH_LONG).show();
            }
        });

        resultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valor.setText(" DETALLE DE VENTA :    "  + "      ." +
                        "" +
                        "      Precio: " + val.getPrecio() + " Millones " + "              Delivery: " + val.getDelivery());
                recargo.setText("+" + val.getRecargo() + " Recarga");
                total.setText("TOTAL: " + val.SUMS(val.getRecargo(),val.getPrecio()));
            }
        });
    }
}