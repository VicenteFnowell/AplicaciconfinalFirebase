package com.example.aplicaciconfinalfirebase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvEmpleados;
    ArrayList <CEmpleado> lista_empleados = new ArrayList<CEmpleado>();
    static final String EXTRA_EMPLEADO = "EMPLEADO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cargarDatos();

        lvEmpleados = (ListView) findViewById(R.id.lvempleados);
        AdaptadorEmpleado adaptador = new AdaptadorEmpleado(this, lista_empleados);
        lvEmpleados.setAdapter(adaptador);

        lvEmpleados.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                CEmpleado c = ((CEmpleado) parent.getItemAtPosition(position));
                String DNI = c.getDNI();
                String Nombre = c.getNombre();
                String Profesion = c.getProfesion();



                CEmpleado empleado= new CEmpleado(Nombre,DNI,Profesion);

                Intent empleadolista = new Intent(getApplicationContext(), FormularioeditarActivity.class);

                empleadolista.putExtra(EXTRA_EMPLEADO,empleado);

                startActivity(empleadolista);
            }


        });
        lvEmpleados.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Vas a eliminar",Toast.LENGTH_LONG).show();
                return true;
            }
        });
    }//FIN ONCREATE


    public void clickbtnnuevoempleado (View view){
        Intent i=new Intent(getApplicationContext(),FormularioeditarActivity.class);
        startActivity(i);


    }




    private void cargarDatos(){

        lista_empleados.add(new CEmpleado("75839402P", "Raul","Bombero"));
        lista_empleados.add(new CEmpleado("77428493K", "Miguelín","Ciclista"));
        lista_empleados.add(new CEmpleado("32475849B", "Antonio","Carnicero"));
        lista_empleados.add(new CEmpleado("84723849K", "Juanfran","Director de Cine"));
        lista_empleados.add(new CEmpleado("66384929U", "Juanin","Cartero Real"));
        lista_empleados.add(new CEmpleado("37663384O", "Manuela","Mecánica"));

    }



}//FIN MAINACTIVITY
