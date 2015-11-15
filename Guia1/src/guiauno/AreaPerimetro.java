package guiauno;

import java.util.Scanner;

public class AreaPerimetro {
   
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        byte opc;
        double pi=3.14;
        double radio, perimetro,area, b, h;
        String unidad;
        
        System.out.println("Bienvenido a su programa área y perímetro de su figura");
        System.out.println("Este programa calcula el área y perímetro de un circulo o un rectángulo según la opción que desee");
        System.out.println("1. Área y perímetro de un circulo \n2. Área y perímetro de un rectángulo");
        System.out.println("Por favor digite la opción:");
                opc=leer.nextByte();
                
                switch (opc){
                    case 1: {
                        do{
                        System.out.println("Por favor digite la unidad de medida");
                            unidad=leer.next();
                            
                        System.out.println("Por favor digite el radio de su circulo");
                            radio=leer.nextDouble();
                                               
                        if (radio<=0){
                            System.out.println("¡Error, el radio no puede ser igual o menor de cero.");
                            }                    
                        }
                        while(radio<=0);
                                                                 
                        perimetro=2*radio*pi;
                        area=pi*Math.pow(radio, 2);
                        
                        System.out.println("El perímetro de un circulo es: "+perimetro+" "+unidad+ "^2");
                        System.out.println("El área de un circulo es: "+area+" "+unidad+ "^2");
                       
                    }
                    break;
                    
                    case 2:{
                        do{
                            System.out.println("Por favor digite la unidad de medida");
                                unidad=leer.next();
                                
                            System.out.println("Por favor digite la base del rectángulo");
                                b=leer.nextDouble();
                                
                            System.out.println("Por favor digite la altura del rectángulo");
                                h=leer.nextDouble();
                          
                        if (b==h){
                            System.out.println("¡Error, La base y la altura no pueden ser iguales.");
                            }
                        }
                        while(b==h);
                                                                     
                        perimetro=2*(b+h);
                        area=b*h;
                        
                        System.out.println("El perímetro de un circulo es: "+perimetro+" "+unidad+ "^2");
                        System.out.println("El área de un circulo es: "+area+" "+unidad+ "^2");           
                        }
                        break;
                        
                        default:
                        System.out.println("¡Error, opción no válida!");
                }
        }
}

