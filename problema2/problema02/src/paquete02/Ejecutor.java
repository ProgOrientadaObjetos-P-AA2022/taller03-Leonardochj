/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete02;

import paquete01.EquivalenteHora;

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
        EquivalenteHora equivalente = new EquivalenteHora();
        int horas = 6;

        equivalente.establecerHoras(horas);
        equivalente.establecerMinutos();
        equivalente.establecerSegundos();
        equivalente.establecerDias();

        System.out.println();

        EquivalenteHora equivalente2 = new EquivalenteHora();
        int horas2 = 12;

        equivalente2.establecerHoras(horas2);
        equivalente2.establecerMinutos();
        equivalente2.establecerSegundos();
        equivalente2.establecerDias();

        System.out.printf("Cantidad de horas: %d\nEquivalente a Minutos son: %d\n"
                + "Equivalente a segundos son: %d\nEquivalente a dias son: %.3f\n",
                equivalente.obtenerHoras(),
                equivalente.obtenerMinutos(), equivalente.obtenerSegundos(),
                equivalente.obtenerDias());

        System.out.println("-------------------------------------------");

        System.out.printf("Cantidad de horas 2: %d\n"
                + "Equivalente a Minutos son: %d\n"
                + "Equivalente a segundos son: %d\n"
                + "Equivalente a dias son: %.3f\n",
                equivalente2.obtenerHoras(),
                equivalente2.obtenerMinutos(), equivalente2.obtenerSegundos(),
                equivalente2.obtenerDias());
    }

}
