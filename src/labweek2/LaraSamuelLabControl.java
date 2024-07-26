/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labweek2;

import java.util.Scanner;

public class LaraSamuelLabControl {

    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        lea.useDelimiter("\n");
        
        int opcion=0;
        
        while(opcion!=4){
        System.out.println(" ");
        System.out.println("***MENU***");
        System.out.println("1 - Cadena");
        System.out.println("2 - Notas");
        System.out.println("3 - Clases");
        System.out.println("4 - Salir del sistema");
        System.out.print("Ingresar actividad a realizar: ");
        opcion=lea.nextInt();
        
        if(opcion==1){
            
            System.out.println(" ");
            System.out.print("Ingresar una cadena de caracteres: ");
            String cadena=lea.next().toLowerCase();

            int maxFrecuencia = 0;
            char caracterMasFrecuente = ' ';
            
            //samuel.charAt(contador)
            //012345
            
            int contador = 0;
            while (contador < cadena.length()) {
                char caracterActual = cadena.charAt(contador);
                int frecuenciaActual = 0;

                int cont = 0;
                while (cont< cadena.length()) {
                    if (cadena.charAt(cont) == caracterActual) {
                        frecuenciaActual+=1;
                        
                    }
                    cont+=1;
                }

                if (frecuenciaActual > maxFrecuencia) {
                    maxFrecuencia = frecuenciaActual;
                    caracterMasFrecuente = caracterActual;
                }
                contador+=1;
            }

            System.out.println("El caracter mas frecuente es: '" + caracterMasFrecuente +
                               "' con una frecuencia de: " + maxFrecuencia);
        }
    
        else if(opcion==2){
            
            
            
        }else if(opcion==3){
            String fecha;
            
            System.out.println(" ");
            System.out.println("CLASES");
            System.out.print("Ingrese la fecha actual con el formato (día, DD/MM): ");
            fecha=lea.next();
            
        }else{
            System.out.println("Opcion no valida."); 
        }
        }
    }
    
}
