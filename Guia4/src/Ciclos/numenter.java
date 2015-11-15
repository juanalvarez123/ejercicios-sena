package Ciclos;

import java.util.Scanner;

class numenter {

    public void enteros(){
        
        Scanner leer = new Scanner(System.in);
        int mayor,menor;
        
        System.out.println("Por favor digite el primer número");
        int x=leer.nextInt();
        
        System.out.println("Por favor digite el segundo número");
        int x2=leer.nextInt();
        
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
