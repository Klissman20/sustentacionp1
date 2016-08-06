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
public class Producto {
    private String nombre;
    private int cant;
    private int valor;
    String[] inv_nom = new String[10];
    int[] inv_cant = new int[10];
    int[] inv_val = new int[10];
    int[] cant_venta= new int[10];
    int[] total= new int[10];
    int t=0;
    Scanner lector = new Scanner(System.in);
    
    public void Agregar_Producto(){
        System.out.print("Nombre del producto: ");
        nombre = lector.next();
        inv_nom[t]=nombre;
        System.out.print("Cantidad: ");
        cant = lector.nextInt();
        inv_cant[t]=cant;
        System.out.print("Valor: ");
        valor = lector.nextInt();
        inv_val[t]=valor;
        t+=1;
    }
    
    public void Buscar_Producto(){
        System.out.print("Ingrese nombre del producto: ");
        String aux = lector.next();
        int f=0;
        for (int i=0;i<=t;i++){
            if (aux.equals(inv_nom[i])){
                System.out.println("Nombre: "+inv_nom[i]);
                System.out.println("Cantidad: "+inv_cant[i]);
                System.out.println("Valor: "+inv_val[i]);
                f=1;
            }
        }
        if (f==0){
            System.out.println("El producto no existe.");
        }
    }
    
    public void Eliminar_Producto(){
        System.out.print("Ingrese nombre del producto a eliminar: ");
        String aux = lector.next();
        int f=0;
        for (int i=0;i<t;i++){
            if (aux.equals(inv_nom[i])){
                for (int j=i;j<t;j++){
                    inv_nom[j]=inv_nom[j+1];
                    inv_cant[j]=inv_cant[j+1];
                    inv_val[j]=inv_val[j+1];
                    f=1;
                }
                t-=1;
            }
        }
        if (f==0){
            System.out.println("El producto no existe.");
        }
    }
    
    public void Mostrar_Inventario(){
        System.out.println("Inventario: ");
        for (int i=0;i<t;i++){
            System.out.println("Nombre: "+inv_nom[i]);
            System.out.println("Cantidad: "+inv_cant[i]);
            System.out.println("Valor: "+inv_val[i]);
        }
    }
    
    public void Realizar_Ventas(){
        System.out.print("Ingrese nombre del producto a vender: ");
        String aux = lector.next();
        System.out.print("Ingrese cantidad: ");
        int canti = lector.nextInt();
        int f=0;
        for (int i=0;i<=t;i++){
            if (aux.equals(inv_nom[i])){
                cant_venta[i]=canti;
                total[i]=canti*inv_val[i];
                inv_cant[i]-=canti;
                f=1;
            }
        }
        
        if (f==0){
            System.out.println("El producto no existe.");
        }
    }
    
    public void Ganancias_Totales(){
        for (int i=0;i<t;i++){
            System.out.println("Nombre: "+inv_nom[i]);
            System.out.println("Cantidad: "+inv_cant[i]);
            System.out.println("Vendidas: "+cant_venta[i]);
            System.out.println("Total: "+total[i]);
        }
    }
    
    Producto (String n,int c,int v){
        nombre = n;
        cant = c;
        valor = v;
        inv_nom[t]=nombre;
        inv_cant[t]=cant;
        inv_val[t]=valor;
        t+=1;
    }
    
}
