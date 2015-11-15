package Ciclos;

import java.util.Scanner;

class maydig {

     public void digmay(){

        Scanner leer = new Scanner(System.in);
       
      long x=0;
      int i=0;
      int mayor,menor;
      
        System.out.println("Por favor digite un número de varias cifras");
        x=leer.nextLong();
        
        while (x!=0) {
                x=(x/10);
                i++;
        }
        System.out.println(" El número de digitos que contiene el número son: " +i);
    }
}
