/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author Usuario
 */
public class EquivalenteHora {
    private int horas;
    private int minutos;
    private int segundos;
    private double dias;
    
    public void establecerHoras(int a){
        horas = a;
    }
    public void establecerMinutos(){
        minutos = horas * 60;
    }
    public void establecerSegundos(){
        segundos = horas * 3600;
    }
    public void establecerDias(){
        dias = (double)horas/24;
    }
    
    public int obtenerHoras(){
        return horas;
    }
    public int obtenerMinutos(){
        return minutos;
    }
    public int obtenerSegundos(){
        return segundos;
    }
    public double obtenerDias(){
        return dias;
    }
}
