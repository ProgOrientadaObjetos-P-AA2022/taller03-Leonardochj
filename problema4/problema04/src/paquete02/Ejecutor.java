/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete02;

import paquete01.EquipoCelular;

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
        EquipoCelular celular = new EquipoCelular();
        String sistemaOperativo = "Android";
        String tamañoPantalla = "640 x 960";
        double costoInicial = 310;
        int porcentajeIva = 12;
        double ivaCostoInicial = 37.2;
        String direccionMac = "00:8e:c3:4f:7D:2a";
        String IMEI = "582059184739201";

        celular.establecerSistemaOperativo(sistemaOperativo);
        celular.establecerTamañoPantalla(tamañoPantalla);
        celular.establecerCostoInicial(costoInicial);
        celular.establecerPorcentajeIva(porcentajeIva);
        celular.establecerIvaCostoInicial(ivaCostoInicial);
        celular.establecerDireccionMac(direccionMac);
        celular.establecerIMEI(IMEI);
        celular.establecerCostoFinal();

        System.out.println();

        EquipoCelular celular2 = new EquipoCelular();
        String sistemaOperativo2 = "IOs";
        String tamañoPantalla2 = "340 x 480";
        double costoInicial2 = 700;
        int porcentajeIva2 = 12;
        double ivaCostoInicial2 = 84.0;
        String direccionMac2 = "00:1e:c2:9e:2B:6b";
        String IMEI2 = "306939105824701";

        celular2.establecerSistemaOperativo(sistemaOperativo2);
        celular2.establecerTamañoPantalla(tamañoPantalla2);
        celular2.establecerCostoInicial(costoInicial2);
        celular2.establecerPorcentajeIva(porcentajeIva2);
        celular2.establecerIvaCostoInicial(ivaCostoInicial2);
        celular2.establecerDireccionMac(direccionMac2);
        celular2.establecerIMEI(IMEI2);
        celular2.establecerCostoFinal();

        System.out.printf("Datos del celular\n\nSistema operativo: %s\n"
                + "Tamaño de pantalla: %s\nCosto inicial: %.2f\n"
                + "Iva en porcentaje: %d\nIva del costo inicial: %.2f\n"
                + "Direccion Mac: %s\nInformacion IMEI: %s\n"
                + "Costo final: %.2f\n\n", celular.obtenerSistemaOperativo(),
                celular.obtenerTamañoPantalla(),
                celular.obtenerCostoInicial(),
                celular.obtenerPorcentajeIva(),
                celular.obtenerIvaCostoInicial(),
                celular.obtenerDireccionMac(),
                celular.obtenerIMEI(), celular.obtenerCostoFinal());

        System.out.println("-------------------------------------------");

        System.out.printf("Datos del celular 2\n\nSistema operativo: %s\n"
                + "Tamaño de pantalla: %s\nCosto inicial: %.2f\n"
                + "Iva en porcentaje: %d\nIva del costo inicial: %.2f\n"
                + "Direccion Mac: %s\nInformacion IMEI: %s\n"
                + "Costo final: %.2f\n\n", celular2.obtenerSistemaOperativo(),
                celular2.obtenerTamañoPantalla(),
                celular2.obtenerCostoInicial(),
                celular2.obtenerPorcentajeIva(),
                celular2.obtenerIvaCostoInicial(),
                celular2.obtenerDireccionMac(),
                celular2.obtenerIMEI(), celular2.obtenerCostoFinal());
    }

}
