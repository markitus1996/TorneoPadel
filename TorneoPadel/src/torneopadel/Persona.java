/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torneopadel;

/**
 * Esto es una clase persona.
 * @author Oks
 */
public abstract class Persona {
    //Atributos:
    private static int ID_PERSONA = 1;// static para hacer un id único autoincremental.
    private String nombre, apellidos, dni;
    private Direccion direccion;
    private int id, dia, mes, anio;
    
    // Constructores:

    public Persona(String nombre, String apellidos,int dia,int mes,int anio,String dni, String pais, String ciudad, String municipio,String calle,int num_calle, int cod_postal) {
        this.id=ID_PERSONA++;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dia=dia;
        this.mes=mes;
        this.anio=anio;
        this.dni=dni;
        this.direccion = new Direccion(pais,ciudad,municipio,calle,num_calle,cod_postal);
    }
    
    //getters y setters:

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public int getId() {
        return id;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    // Metodos:

    @Override
    public String toString() {
        return "Persona: " 
                + "\n nombre=" + nombre 
                + ",\n apellidos=" + apellidos 
                + ",\n dni=" + dni 
                + ",\n direccion=" + direccion 
                + ",\n id=" + id 
                + ",\n dia=" + dia + ", mes=" + mes + ", anio=" + anio;
    }
    
}
