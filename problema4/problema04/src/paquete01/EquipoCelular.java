/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author Usuario
 */
public class EquipoCelular {

    private String sistemaOperativo;
    private String tamañoPantalla;
    private double costoInicial;
    private int porcentajeIva;
    private double ivaCostoInicial;
    private String direccionMac;
    private String IMEI;
    private double costoFinal;

    public void establecerSistemaOperativo(String a) {
        sistemaOperativo = a;
    }

    public void establecerTamañoPantalla(String b) {
        tamañoPantalla = b;
    }

    public void establecerCostoInicial(double c) {
        costoInicial = c;
    }

    public void establecerPorcentajeIva(int d) {
        porcentajeIva = d;
    }

    public void establecerIvaCostoInicial(double e) {
        ivaCostoInicial = e;
    }

    public void establecerDireccionMac(String f) {
        direccionMac = f;
    }

    public void establecerIMEI(String g) {
        IMEI = g;
    }

    public void establecerCostoFinal() {
        costoFinal = costoInicial + ivaCostoInicial;
    }
    

    public String obtenerSistemaOperativo() {
        return sistemaOperativo;
    }

    public String obtenerTamañoPantalla() {
        return tamañoPantalla;
    }

    public double obtenerCostoInicial() {
        return costoInicial;
    }

    public int obtenerPorcentajeIva() {
        return porcentajeIva;
    }

    public double obtenerIvaCostoInicial() {
        return ivaCostoInicial;
    }

    public String obtenerDireccionMac() {
        return direccionMac;
    }

    public String obtenerIMEI() {
        return IMEI;
    }

    public double obtenerCostoFinal() {
        return costoFinal;
    }
}
