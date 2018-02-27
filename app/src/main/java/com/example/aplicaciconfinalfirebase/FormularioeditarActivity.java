package com.example.aplicaciconfinalfirebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class FormularioeditarActivity extends AppCompatActivity {

    TextView etNombre,etDNI,etProfesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formularioeditar);

        etNombre = (EditText)findViewById(R.id.etnombreformulario);
        etDNI = (EditText)findViewById(R.id.etDNIformulario);
        etProfesion = (EditText)findViewById(R.id.etprofesionformulario);

        Bundle b=getIntent().getExtras();

        if (b!=null){
            CEmpleado empleado=b.getParcelable(MainActivity.EXTRA_EMPLEADO);
            etNombre.setText(empleado.getNombre());
            etDNI.setText(empleado.getDNI());
            etProfesion.setText(empleado.getProfesion());

        }else{

            
        }


    }
}
