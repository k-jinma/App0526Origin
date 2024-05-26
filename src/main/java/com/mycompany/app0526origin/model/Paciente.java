package com.mycompany.app0526origin.model;

import java.util.List;

public class Paciente {

    private String dni;
    private String nombre;
    private String telefono;
    
    private List<Cita> citas;   //患者は複数の予約をもつ

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Cita> getCitas() {
        return citas;
    }

    public void setCitas(List<Cita> citas) {
        this.citas = citas;
    }
    
    
}
