package Ciclos;

import java.util.Scanner;

public class Menu {
   
    public static void main(String[] args) {

        int opc;
        
            Scanner leer=new Scanner(System.in);
        
        do{
            System.out.println("Bienvenido a su programa ciclos:");
            System.out.println("Por favor digite la opción que desea.");
            System.out.println("1. Lee dos números mostrando los enteros comprendidos entre ellos");
            System.out.println("2. Lee un número entero determinando la suma del número ingresado a 1 o viceversa");
            System.out.println("3. Lee un número entero y determina sus digitos");
            System.out.println("4. Lee un número entero y determina el mayor de sus digitos");
        
        opc=leer.nextInt();
        
        switch (opc){
            
            case 1: 
            {
                numenter enteros= new numenter();
                enteros.enteros();
                break;
            }
           
            case 2:
            {
                numsuma entero= new numsuma();
                entero.sumaenter();
                break;
            }
         
            case 3:
            {
                digent dig=new digent();
                dig.entedig();
                break;
            }
              
            case 4:
            {
               maydig may=new maydig();
                may.digmay();
                break;
            }
            
            case 5:
            {
                System.out.println("Gracias por participar");
                break;
            }
            default:
            {
                System.out.println("¡Error, opción no válida!");
            }  
            }
       }
        while (opc!=0);
    }
}