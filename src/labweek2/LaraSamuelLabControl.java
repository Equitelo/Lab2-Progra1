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
            
            int cantidad=0;
            int contador=1;
            double sumaNotas=0;
            double nota=0;
            double promedio=0;
            double notaMayor=0;
            double notaMenor=100;
            
            System.out.print("Ingresar la cantidad de notas: ");
            cantidad=lea.nextInt();
            
            while(contador<=cantidad){
                System.out.println("Ingresar nota #"+contador+": ");
                nota=lea.nextDouble();
                
                if(nota>=0&&nota<=100){
                    contador+=1;
                    sumaNotas+=nota;
                    
                    while(nota>notaMayor){
                        notaMayor=nota;
                    }
                    
                    while(nota<notaMenor){
                        notaMenor=nota;
                    }
                    
                    promedio=(sumaNotas/cantidad);
                }
            }
            
            System.out.println("Promedio: "+promedio+"%");
            System.out.println("Nota mayor: "+notaMayor);
            System.out.println("Nota menor: "+notaMenor);
            
        }else if(opcion==3){
            System.out.print("Ingrese la fecha actual (ejemplo: lunes, 19/10): ");
            String entrada=lea.next().toLowerCase();
            if (entrada.matches("^[a-zA-Z]+, \\d{1,2}/\\d{1,2}$")) {
                int coma = entrada.indexOf(',');
                int barra = entrada.indexOf('/');
                String diaSemana = entrada.substring(0, coma);
                int dia=Integer.parseInt(entrada.substring(coma + 2, barra));
                int mes=Integer.parseInt(entrada.substring(barra + 1));
                switch (diaSemana) {
                case "lunes":
                    if (mes>12 || dia>31) {
                    System.out.println("Error: Fecha inválida.");
                    } else {
                        System.out.print("¿Se tomaron exámenes? (SI/NO): ");
                        char respuesta= lea.next().charAt(0);
                        if (respuesta == 'S' || respuesta == 's') {
                            System.out.print("Número de alumnos aprobados: ");
                            int aprobados = lea.nextInt();
                            System.out.print("Número de alumnos reprobados: ");
                            int reprobados = lea.nextInt();
                            double porcentajeAprobados= (double) aprobados/(aprobados+reprobados)*100;
                            System.out.println("Porcentaje de aprobados: "+porcentajeAprobados+"%");
                        } else {
                            System.out.println("Tuvieron un maravilloso día de clases");
                        }
                    }
                    break;
                case "martes":
                    if (mes>12 || dia>31) {
                        System.out.println("Error: Fecha inválida.");
                    } else {
                        System.out.print("¿Se tomaron exámenes? (SI/NO): ");
                        char respuesta= lea.next().charAt(0);
                        if (respuesta == 'S' || respuesta == 's') {
                            System.out.print("Número de alumnos aprobados: ");
                            int aprobados = lea.nextInt();
                            System.out.print("Número de alumnos reprobados: ");
                            int reprobados = lea.nextInt();
                            double porcentajeAprobados= (double) aprobados/(aprobados+reprobados)*100;
                            System.out.println("Porcentaje de aprobados: "+porcentajeAprobados+"%");
                        } else {
                            System.out.println("Tuvieron un maravilloso día de clases");
                        }
                    }
                    break;
                case "miércoles":
                    if (mes>12 || dia>31) {
                        System.out.println("Error: Fecha inválida.");
                    } else {
                            //miercoles
                             System.out.print("¿Se tomaron exámenes? (SI/NO): ");
                             char respuesta= lea.next().charAt(0);
                        if (respuesta == 'S' || respuesta == 's') {
                            System.out.print("Número de alumnos aprobados: ");
                            int aprobados = lea.nextInt();
                            System.out.print("Número de alumnos reprobados: ");
                            int reprobados = lea.nextInt();
                            double porcentajeAprobados= (double) aprobados/(aprobados+reprobados)*100;
                            System.out.println("Porcentaje de aprobados: "+porcentajeAprobados+"%");
                        } else {
                            System.out.println("Tuvieron un maravilloso día de clases");
                        }
                    }
                    break;
                case "jueves":
                    if (mes>12 || dia>31) {
                        System.out.println("Error: Fecha inválida.");
                    } else {
                        //jueves
                        System.out.print("Porcentaje de asistencia a clase: ");
                        double asistencia=lea.nextDouble();
                        if (asistencia>50) {
                            System.out.println("Asistió la mayoría. \nUn porcentaje de"+asistencia+"%");
                        } else {
                            System.out.println("No asistió la mayoría. \nUn porcentaje de "+asistencia+"%");
                        } 
                    }
                    break;
                case "viernes":
                    if ((mes==1 || mes==7) && dia==1){
                        System.out.print("Comienzo de un Nuevo Ciclo\n");
                        System.out.print("Ingrese cantidad de Alumnos del Nuevo Ciclo: ");
                        int cantidadAlumnos=lea.nextInt();
                        System.out.print("Ingrese el Precio por cada Alumno: $. ");
                        double precioAlumnos=lea.nextDouble(); 
                        double totalIngreso=0;
                        totalIngreso=cantidadAlumnos*precioAlumnos;
                        System.out.println("El Ingreso Total fue de: $."+totalIngreso);
                    } else {
                        System.out.println("No se inicia el comienzo de ciclo"); 
                    }
                    break;
                    default:
                    System.out.println("Error: Día de la semana no válido.");
                    break;
                    }
            } else {
            System.out.println("Error: Formato de fecha incorrecto.");
            }
            System.out.println("\n");
            break;
        }else{
            System.out.println("Opcion no valida."); 
        }
        }
    }
    
}
