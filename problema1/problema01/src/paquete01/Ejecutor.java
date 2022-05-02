/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

import paquete02.Terreno;

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
        Terreno terreno = new Terreno();
        double valorAncho = 20.5;
        double valorLargo = 40.2;
        double valorMetroCuadrado = 30.1;

        terreno.establecerValorAncho(valorAncho);
        terreno.establecerValorLargo(valorLargo);
        terreno.establecerValorMetroCuadrado(valorMetroCuadrado);
        terreno.calcularAreaTerreno();
        terreno.calcularCostoTerreno();
        
        System.out.println();
        
        Terreno terreno2 = new Terreno();
        double valorAncho2 = 100.20;
        double valorLargo2 = 150.10;
        double valorMetroCuadrado2 = 80.26;

        terreno2.establecerValorAncho(valorAncho2);
        terreno2.establecerValorLargo(valorLargo2);
        terreno2.establecerValorMetroCuadrado(valorMetroCuadrado2);
        terreno2.calcularAreaTerreno();
        terreno2.calcularCostoTerreno();
        
        System.out.printf("Datos y el costo del terreno\n\n"
                + "Valor del ancho: %.2f metros\nValor del largo: %.2f metros\n"
                + "Valor del Metro: %.2f metros cuadrado\n"
                + "Valor del area del terreno: %.2f metros cuadrados\n"
                + "Valor del costo del terreno: %.2f\n\n",
                terreno.obtenerValorAncho(),
                terreno.obtenerValorLargo(), 
                terreno.obtenerValorMetroCuadrado(),
                terreno.obtenerAreaTerreno(), terreno.obtenerCostoTerreno());
        
        System.out.println("--------------------------------------------");

        System.out.printf("Datos y el costo del terreno 2\n\n"
                + "Valor del ancho: %.2f metros\nValor del largo: %.2f metros\n"
                + "Valor del Metro: %.2f metros cuadrado\n"
                + "Valor del area del terreno: %.2f metros cuadrados\n"
                + "Valor del costo del terreno: %.2f\n\n",
                terreno2.obtenerValorAncho(),
                terreno2.obtenerValorLargo(), 
                terreno2.obtenerValorMetroCuadrado(),
                terreno2.obtenerAreaTerreno(), terreno2.obtenerCostoTerreno());
    }
}
