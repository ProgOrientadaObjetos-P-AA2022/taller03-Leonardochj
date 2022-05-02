/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author Usuario
 */
public class Terreno {

    private double valorAncho;
    private double valorLargo;
    private double valorMetroCuadrado;
    private double valorAreaTerreno;
    private double valorCostoTerreno;

    public void establecerValorAncho(double c) {
        valorAncho = c;
    }

    public void establecerValorLargo(double c) {
        valorLargo = c;
    }

    public void establecerValorMetroCuadrado(double c) {
        valorMetroCuadrado = c;
    }

    // public void establecerValorFactura(){
    public void calcularAreaTerreno() {
        valorAreaTerreno = valorAncho * valorLargo;
    }

    public void calcularCostoTerreno() {
        valorCostoTerreno = valorAreaTerreno * valorMetroCuadrado;
    }

    public double obtenerValorAncho() {
        return valorAncho;
    }

    public double obtenerValorLargo() {
        return valorLargo;
    }

    public double obtenerValorMetroCuadrado() {
        return valorMetroCuadrado;
    }

    public double obtenerAreaTerreno() {
        return valorAreaTerreno;
    }

    public double obtenerCostoTerreno() {
        return valorCostoTerreno;
    }
}
