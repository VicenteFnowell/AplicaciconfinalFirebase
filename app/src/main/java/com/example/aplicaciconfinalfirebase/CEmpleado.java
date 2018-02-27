package com.example.aplicaciconfinalfirebase;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Vicente FN on 27/02/2018.
 */

public class CEmpleado implements Parcelable {

    String DNI;
    String nombre;
    String profesion;

    public static final Parcelable.Creator<CEmpleado> CREATOR = new
            Parcelable.Creator<CEmpleado>() {
                public CEmpleado createFromParcel(Parcel in) {
                    return new CEmpleado(in);
                }
                public CEmpleado[] newArray(int size) {
                    return new CEmpleado[size];
                }
            };

    public CEmpleado(String DNI, String nombre, String profesion) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.profesion = profesion;
    }

    public CEmpleado(Parcel p) {
        readFromParcel(p);
    }

    public CEmpleado(){
        //Es obligatorio incluir constructor vacío por defecto
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    //Metodos implementados de la clase Parcelable
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.DNI);
        dest.writeString(this.nombre);
        dest.writeString(this.profesion);
    }

    private void readFromParcel(Parcel p) {

        this.DNI = p.readString();
        this.nombre= p.readString();
        this.profesion = p.readString();

    }



}
