package com.example.tdc.trabajandodesdecasa;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Trabajando_Desde_Casa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trabajando__desde__casa);
        Button zapatos =  (Button) findViewById(R.id.zapatos);

        zapatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               TDCDialog().show();


            }
        });



    }
    public AlertDialog TDCDialog(){
        final AlertDialog.Builder builder = new AlertDialog.Builder(Trabajando_Desde_Casa.this);

        final AlertDialog Transaccion = builder.create();

        LayoutInflater Inflater = Trabajando_Desde_Casa.this.getLayoutInflater();

        View v = Inflater.inflate(R.layout.transaccion, null);

        Transaccion.setView(v);

        Button Ofertar = (Button) v.findViewById(R.id.ofertar);
        Button Comprar = (Button) v.findViewById(R.id.comprar);
        Button regresar = (Button) v.findViewById(R.id.regresar);

        Ofertar.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent login = new Intent(Trabajando_Desde_Casa.this, login.class);
                        startActivity(login);



                    }
                }
        );

        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Transaccion.dismiss();
            }
        });





        return Transaccion;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
