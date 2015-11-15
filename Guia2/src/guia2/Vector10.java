package guia2;

import java.util.Scanner;

public class Vector10 {

    public static void main(String[] args) {

        Scanner leer = new Scanner (System.in);
        int x=10, opc;
        int[]vector = new int[x];
        int aux;
        boolean transforma=false;
        
        do{
        System.out.println("Bienvenido a su programa vector");
        System.out.println("Este programa le mostrará de forma ascendente o descendente"
                + " diez números que usted digite, según la opción que desea:");
        System.out.println("opcion 1: Ascendente");
        System.out.println("Opción 2; Descendente");
        System.out.println("Opción 3; Salir");
      
        opc=leer.nextByte();
        
        switch (opc){
            case 1:
            {
            System.out.println("Digite los numeros de su vector"); 
            for (int i =0; i<x; i++){
            vector[i]=leer.nextInt();
           
            }
              for (int i=0; i<x;i++){
              System.out.print(vector[i]+" ");
           }
          System.out.println();      
          break;
            }
            case 2:
            {
            System.out.println("Digite los numeros de su vector"); 
            for (int i =0; i<x; i++){
            vector[i]=leer.nextInt();
            }
            for (int i=0; i<x;i++){
            System.out.print(vector[i]+" ");
                }
              System.out.println();
                break;
            }
            case 3:
            {
                System.out.println("Gracias por participar, Adios");
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
