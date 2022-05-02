/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete02;

import paquete01.InstitucionEducativa;

/**
 *
 * @author Usuario
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        InstitucionEducativa institucion = new InstitucionEducativa();
        String nombre = "Cordillera";
        String tipoInstitucion = "Privada";
        int numeroAlumnos = 180;
        int numeroDocentes = 60;
        int numeroSedes = 50;
        double gastoAlumno = 1750.42;

        institucion.establecerNombre(nombre);
        institucion.establecerTipoInstitucion(tipoInstitucion);
        institucion.establecerNumeroAlumnos(numeroAlumnos);
        institucion.establecerNumeroDocentes(numeroDocentes);
        institucion.establecerNumeroSedes(numeroSedes);
        institucion.establecerGastoAlumno(gastoAlumno);
        institucion.establecerPresupuesto();
        
        System.out.println();
        
        InstitucionEducativa institucion2 = new InstitucionEducativa();
        String nombre2 = "Bernardo Valdivieso";
        String tipoInstitucion2 = "Pública";
        int numeroAlumnos2 = 220;
        int numeroDocentes2 = 90;
        int numeroSedes2 = 110;
        double gastoAlumno2 = 1640.22;
        
        institucion2.establecerNombre(nombre2);
        institucion2.establecerTipoInstitucion(tipoInstitucion2);
        institucion2.establecerNumeroAlumnos(numeroAlumnos2);
        institucion2.establecerNumeroDocentes(numeroDocentes2);
        institucion2.establecerNumeroSedes(numeroSedes2);
        institucion2.establecerGastoAlumno(gastoAlumno2);
        institucion2.establecerPresupuesto();

        System.out.printf("Datos de la institucion educativa\n\n"
                + "Nombre de la institucion: %s\nTipo de institucion: %s\n"
                + "Numero de alumnos: %d\nNumero de docentes: %d\n"
                + "Numero de sedes: %d\nGasto proyectado por el alumno: %.2f\n"
                + "Presupuesto: %.2f\n\n", institucion.obtenerNombre(),
                institucion.obtenerTipoInstitucion(), 
                institucion.obtenerNumeroAlumnos(), 
                institucion.obtenerNumeroDocentes(), 
                institucion.obtenerNumeroSedes(), 
                institucion.obtenerGastoAlumno(), 
                institucion.obtenerPresupuesto());
        
        System.out.println("-------------------------------------------");
        
        System.out.printf("Datos de la institucion educativa 2\n\n"
                + "Nombre de la institucion: %s\nTipo de institucion: %s\n"
                + "Numero de alumnos: %d\nNumero de docentes: %d\n"
                + "Numero de sedes: %d\nGasto proyectado por el alumno: %.2f\n"
                + "Presupuesto: %.2f\n", institucion2.obtenerNombre(),
                institucion2.obtenerTipoInstitucion(), 
                institucion2.obtenerNumeroAlumnos(), 
                institucion2.obtenerNumeroDocentes(), 
                institucion2.obtenerNumeroSedes(), 
                institucion2.obtenerGastoAlumno(), 
                institucion2.obtenerPresupuesto());
    }

}
