package com.mycompany.poligono;
import java.util.Scanner;
public class main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char opcion, decision;
        float ladoA,ladoB,ladoC;
        int nTriangulos, nRectangulos;
        Rectangulo [] rectangulo;
        Triangulo [] triangulo;
        
        do{
            System.out.println("\n¿Calcualar un poligono ? s/n");
            decision = entrada.next().charAt(0);
            
            if(decision == 's'||decision == 'S'){
            System.out.println("Triangulo o Rectangulo (T/R)");
            opcion = entrada.next().charAt(0);
            
            if((opcion == 't') || (opcion == 'T')){
                System.out.println("¿Cuántos triangulos?");
                nTriangulos = entrada.nextInt();
                triangulo = new Triangulo[nTriangulos];
                for(int i = 0;i< triangulo.length;i++){
                    System.out.println("Medidas de los tres lados ");
                    System.out.println("¿Lado A?");
                    ladoA = entrada.nextFloat();
                    System.out.println("¿Lado B?");
                    ladoB = entrada.nextFloat();
                    System.out.println("¿Lado C?");
                    ladoC = entrada.nextFloat();
                    triangulo[i]= new Triangulo(ladoA, ladoB, ladoC);
                    
                }
                    System.out.println("Mostrando area Triangulos ");
                    for(int i=0;i<triangulo.length;i++){
                        
                        System.out.println("Area rectangulo "+(i+1)+" "+ triangulo[i].hallarArea());
                    }
                }
            else{
                        
                    System.out.println("¿Cuántos rectangulos? ");
                    nRectangulos = entrada.nextInt();
                    rectangulo = new Rectangulo[nRectangulos];
                    for(int i = 0;i< rectangulo.length;i++){
                        System.out.println("Medidas de los dos lados triangulo "+(i+1));
                        System.out.println("¿Lado A? ");
                        ladoA = entrada.nextFloat();
                        System.out.println("¿Lado B? ");
                        ladoB = entrada.nextFloat();  
                        rectangulo[i]= new Rectangulo(ladoA, ladoB);
                        }
                        
                    System.out.println("Mostrando area rectangulos ");
                    for(int i=0;i<rectangulo.length;i++){
                        System.out.println("Area rectangulo "+(i+1)+" "+ rectangulo[i].hallarArea());
               
                    } 
            }
         }
            
        }while(decision == 's' || decision == 'S');    
     

   }
}
