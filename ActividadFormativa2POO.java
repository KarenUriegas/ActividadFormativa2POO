/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividadformativa2poo;

 
public class ActividadFormativa2POO {
//Se mostrará un encabezado en la pantalla del asesor//
    public static void main(String[] args) {
        System.out.println("===Sistema De Asesor de Ventas===");
        //INVENTARIO: donde se encuentran todos los automóviles//
        Automovil[] inventario = new Automovil[4];
        
        //EJEMPLOS//
        inventario[0] = new Automovil("Honda", "HR-V", 2019);
        inventario[1] = new Automovil("toyota","corolla", 2022);
        inventario[2] = new Automovil("nissan", "versa", 2018);
        inventario[3] = new Automovil("ford", "fiesta", 2023);
        
        //simulación para ver los autos disponibles//
        inventario[1].cambiarDisponibilidad(false);
        inventario[3].cambiarDisponibilidad(false);
        
        System.out.println("\n[Panel de Ventas] Buscando autos disponibles en piso...");
        System.out.println("---------------------------------------------------------");
        
        int autosLibres = 0;
        //Aquí empezarán a identificar los autos de uno en uno//
        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i].isDisponible()) {
                inventario[i].mostrarDatos(); 
                autosLibres++;
            }
        }

        System.out.println("---------------------------------------------------------");
        System.out.println("Total de opciones listas para ofrecer al cliente: " + autosLibres);
    }
}
