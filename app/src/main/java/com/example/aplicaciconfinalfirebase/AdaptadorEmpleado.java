package com.example.aplicaciconfinalfirebase;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Vicente FN on 27/02/2018.
 */

public class AdaptadorEmpleado extends ArrayAdapter<CEmpleado> {


    ArrayList<CEmpleado> empleados;
    Context c;

    public AdaptadorEmpleado(Context c, ArrayList<CEmpleado> empleados){
        super(c,R.layout.itemempleado,empleados);
        this.c = c;
        this.empleados = empleados;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.itemempleado,null);

        //TextView Nombre
        TextView tv_nombre=(TextView)item.findViewById(R.id.tvmombreitem);
        tv_nombre.setText(empleados.get(position).getNombre());

        //TextView DNI
        TextView tv_actor=(TextView)item.findViewById(R.id.tvDNIitem);
        tv_actor.setText(empleados.get(position).getDNI());

        //TextView PROFESION
        TextView tv_descripcion=(TextView)item.findViewById(R.id.tvprofesionitem);
        tv_descripcion.setText(empleados.get(position).getProfesion());



        return item;



    }



}
