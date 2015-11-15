package Ciclos;

import java.util.Scanner;

public class numsuma {
  
    public void sumaenter(){
        
        Scanner leer = new Scanner(System.in);
        int mayor,menor,x2=1;
        
        System.out.println("Por favor digite el número");
        int x=leer.nextInt();
                
        while (x==x2){
            System.out.println("Error los números no deben ser iguales.\nPor favor vuelva a digitar el número");
            x2=leer.nextInt();
        }
        if(x>x2){
            mayor=x;
            menor=x2;
        }
        else{
            mayor=x2;
            menor=x;
        }
        System.out.println("");
        
        for (int i=menor; i<=mayor; i=i+1){
            System.out.println(i+" ");
           }
    }      
}