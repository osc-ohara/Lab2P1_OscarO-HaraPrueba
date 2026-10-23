/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_oscaro.hara;
import java.util.Scanner;

/**
 *
 * @author oscarohara
 */
public class Lab2P1_OscarOHara {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       int opcion = 0;
        
        while (opcion != 4){
            System.out.println("Menu");
            System.out.println("1. Division");
            System.out.println("2. Serie");
            System.out.println("3. Hola Mundo");
            System.out.println("4. Salir");
            opcion=leer.nextInt();
            
            if (opcion == 1){
                int divn=0;
                int divs=0;
                int res=0;
                System.out.println("Ingrese el Dividendo");
                divn=leer.nextInt();
                System.out.println("Ingrese el Divisor");
                divs=leer.nextInt();
                if (divs<0 || divn<0) {
                    System.out.println("No se pueden ingresar numeros negativos");
               }
                
                    if (divs>=divn){
                        System.out.println("El divisor no puede ser mayor que el dividendo");
                 }
                    else{
                            while(divs<=divn){
                            divn=divn-divs;
                            res=res+1;}
                System.out.println("La division es:" + res);
                System.out.println("El residuo:"+ divn);
                
            }
            
    
            }// if division
            else if(opcion == 2){
               int c = 1;
               int revisar=c%2;
               System.out.println("Ingrese el numero limite");
               int limite=leer.nextInt();
               int a2= 0;
               int a3= 5;
               if( limite>0){
                    while (c<=limite){
                        if(revisar>0){
                            System.out.print(" " + a2);
                            a2=a2+1;
                            c=c+1;
                            }//if de uno
                        if(revisar==0);{
                            System.out.print(" " + a3);
                            a3=a3+5;
                            c=c+1; 
                        }//if de cinco
                    }//while
                    System.out.println(" Fin de conteo");
               }
               else{
                   System.out.println("El numero no puede ser menor a 0");
                        
                        }
                        }
            else if(opcion ==3){
                System.out.println("Ingrese un numero entre mayor a 1 y menor a 100");
                int lim=leer.nextInt();
                int c=0;
                while(lim>1 && lim<100 && c<lim){
                    c=c+1;
                    if(c%3==0 & c%5!=0){
                        System.out.println("Hola");
                    }
                    if(c%3!=0 & c%5==0){
                        System.out.println("Mundo");
                                }
                    if(c%3!=0 & c%5!=0){
                        System.out.println(" " + c);
                    }
                    if(c%3==0 & c%5==0){
                        System.out.println("HolaMundo");
                    }
                    }
                        
                }
            else if(opcion == 4){
                System.out.println("Gracias por visitar el programa :D");
            }
            }
            
    }
  
    }
