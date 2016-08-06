/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sustentacion;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Sustentacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opc;
        Producto p = new Producto ("Fab",3,500);
        do{
            Scanner lec = new Scanner(System.in);
            System.out.println("Peluchitos.com(Menu)");
            System.out.println("1. Agregar Producto");
            System.out.println("2. Buscar Producto");
            System.out.println("3. Eliminar Producto");
            System.out.println("4. Mostrar Inventario");
            System.out.println("5. Realizar Venta");
            System.out.println("6. Ganancias Totales");
            System.out.println("0. Salir");
            opc = lec.nextInt();
            switch (opc) {
                case 1:
                    p.Agregar_Producto();
                    break;
                case 2:
                    p.Buscar_Producto();
                    break;
                case 3:
                    p.Eliminar_Producto();
                    break;
                case 4:
                     p.Mostrar_Inventario();
                    break;
                case 5:
                    p.Realizar_Ventas();
                    break;
                case 6:
                    p.Ganancias_Totales();
                    break;
            }
        }while(opc!=0);
    }
    
}
