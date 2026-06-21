package com.mycompany.actividadformativa2poo;

//Aquí definimos la clase, que será automovil en este caso//
public class Automovil {
    //atributos de el automovil//
    private String marca; //Por ejemplo, honda o toyota//
    private String modelo; //de la misma marca, ya sea HRV o Corolla//
    private int año; //el año de la camioneta//
    private double nivelCombustible; //porcentaje de la gasolina//
    private boolean disponible; //estado en el que se encuentra, disponible o vendido//
    
    public Automovil(String marca, String modelo, int año) {
       this.marca = marca;
       this.modelo = modelo;
       this.año = año;
       this.disponible = true;
}
    
public boolean isDisponible(){
    return disponible;
}
public void cambiarDisponibilidad(boolean estatus){
    this.disponible = estatus;
    
}
public void mostrarDatos() {
    System.out.println("-" + marca + " " + modelo + "(" + año +")");
}
}