/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author Usuario
 */
public class InstitucionEducativa {

    private String nombre;
    private String tipoInstitucion;
    private int numeroAlumnos;
    private int numeroDocentes;
    private int numeroSedes;
    private double gastoAlumno;
    private double presupuesto;

    public void establecerNombre(String a) {
        nombre = a;
    }

    public void establecerTipoInstitucion(String b) {
        tipoInstitucion = b;
    }

    public void establecerNumeroAlumnos(int c) {
        numeroAlumnos = c;
    }

    public void establecerNumeroDocentes(int d) {
        numeroDocentes = d;
    }

    public void establecerNumeroSedes(int e) {
        numeroSedes = e;
    }

    public void establecerGastoAlumno(double f) {
        gastoAlumno = f;
    }

    public void establecerPresupuesto() {
        presupuesto = gastoAlumno * numeroAlumnos;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerTipoInstitucion() {
        return tipoInstitucion;
    }

    public int obtenerNumeroAlumnos() {
        return numeroAlumnos;
    }

    public int obtenerNumeroDocentes() {
        return numeroDocentes;
    }

    public int obtenerNumeroSedes() {
        return numeroSedes;
    }

    public double obtenerGastoAlumno() {
        return gastoAlumno;
    }

    public double obtenerPresupuesto() {
        return presupuesto;
    }
}
