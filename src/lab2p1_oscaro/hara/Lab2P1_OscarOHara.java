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
            opcion=leer.nextInt();
            
            if (opcion == 1){
                int divn=0;
                int divs=0;
                int res=0;
                System.out.println("Ingrese el Dividendo");
                divn=leer.nextInt();
                System.out.println("Ingrese el Divisor");
                divs=leer.nextInt();
                while(divs<=divn){
                    divn=divn-divs;
                    res=res+1;}
                System.out.println("La division es:" + res);
                System.out.println("El residuo:"+ divn);
            }// if division
            else if(opcion == 2){
                
                    
                        }
            
    }
  
    }
}