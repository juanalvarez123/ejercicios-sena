
package guia2;

import java.util.Scanner;

public class Matriz {
    
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int x=5,y=5;
        
        
        System.out.println("Bienvenido a su ´programa lista de contactos");
        System.out.println("Este programa le permite guardar de forma organizada una lista de contatos:");
        System.out.println("------------------------");
                
        String [][] matriz= new String [x][y];
               
            for (int i=0; i<x; i++){
            	System.out.println("nombre");
                System.out.println("sexo");
                System.out.println("fecha de cumpleaños");
                System.out.println("estado civil");
                System.out.println("teléfono");
            for (int j=0; j<y; j++){
                matriz[i][j]=leer.nextLine();
                }
         }
        for (int i=0; i<x; i++){
            for (int j=0; j<y; j++){
            System.out.print(matriz[i][j]+" ");
            } 
            System.out.println();
           }
        leer.close();
     }
}

