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
                System.out.print("Ingrese la fecha actual");
                System.out.println("ejemplo -> (dia, DD/MM): ");
                String fecha=lea.next().toLowerCase();

                if (fecha.matches("^[a-zA-Z]+, \\d{1,2}/\\d{1,2}$")) {

                    int coma = fecha.indexOf(',');
                    int slash = fecha.indexOf('/');

                    String diaDsemana = fecha.substring(0, coma);
                    
                    int dia=Integer.parseInt(fecha.substring(coma + 2, slash));
                    int mes=Integer.parseInt(fecha.substring(slash + 1));

                    switch (diaDsemana) {

                        case "lunes":
                            if (mes>12 || dia>31) {
                            System.out.println("Fecha no valida.");
                            } else {
                                System.out.print("Se tomaron examenes? (s/n): ");
                                char respuesta= lea.next().toLowerCase().charAt(0);
                                
                                if (respuesta == 's') {
                                    System.out.print("Alumnos aprobados: ");
                                    int aprobados = lea.nextInt();

                                    System.out.print("Alumnos reprobados: ");
                                    int reprobados = lea.nextInt();

                                    double promedioAprovado= (double) aprobados/(aprobados+reprobados)*100;
                                    System.out.println("Porcentaje de aprobados: "+promedioAprovado+"%");
                                } else {
                                    System.out.println("Tuvieron un maravilloso dia de clases");
                                }
                            }
                        break;
                        case "martes":
                            if (mes>12 || dia>31) {
                                System.out.println("Fecha no valida.");
                            } else {
                                System.out.print("Se tomaron examenes? (s/n): ");
                                char respuesta= lea.next().toLowerCase().charAt(0);
                                if (respuesta == 's') {
                                    System.out.print("Cuantos alumnos aprobados?: ");
                                    int aprobados = lea.nextInt();

                                    System.out.print("Cuantos alumnos reprobados?: ");
                                    int reprobados = lea.nextInt();

                                    double promedioAprovado= (double) aprobados/(aprobados+reprobados)*100;

                                    System.out.println("Porcentaje de aprobados: "+promedioAprovado+"%");
                                } else {
                                    System.out.println("Tuvieron un maravilloso dia de clases");
                                }
                            }
                        break;
                        case "miércoles":
                            if (mes>12 || dia>31) {
                                System.out.println("Fecha no valida.");
                            } else {
                                    //miercoles
                                     System.out.print("Se tomaron examenes? (s/n): ");
                                     char respuesta= lea.next().toLowerCase().charAt(0);
                                    if (respuesta == 's') {
                                        System.out.print("Cuantos alumnos aprobados?: ");
                                        int aprobados = lea.nextInt();

                                        System.out.print("Cuantos alumnos reprobados?: ");
                                        int reprobados = lea.nextInt();

                                        double promedioAprovado= (double) aprobados/(aprobados+reprobados)*100;
                                        System.out.println("Porcentaje de aprobados: "+promedioAprovado+"%");
                                    } else {
                                        System.out.println("Tuvieron un maravilloso día de clases");
                                    }
                            }
                        break;
                        case "jueves":
                            if (mes>12 || dia>31) {
                                System.out.println("Fecha no valida.");
                            } else {

                                System.out.print("Porcentaje de asistencia a clase: ");
                                double asistencia=lea.nextDouble();

                                if (asistencia>50) {
                                    System.out.println("Asistio la mayoria. ");
                                    System.out.println("Un porcentaje de"+asistencia+"%");
                                } else {
                                    System.out.println("Asistio la minoria.");
                                    System.out.println("Un porcentaje de "+asistencia+"%");
                                } 
                            }
                        break;
                        case "viernes":
                            if (dia==1 && (mes==1 || mes==7)){
                                System.out.println("Comienzo de un nuevo ciclo");
                                System.out.print("Ingrese cantidad de alumnos del nuevo ciclo: ");
                                int cantidadAlumnos=lea.nextInt();

                                System.out.print("Ingrese el precio por cada alumno: $.");
                                double precioAlumnos=lea.nextDouble(); 

                                double totalIngreso=0;

                                totalIngreso=cantidadAlumnos*precioAlumnos;
                                System.out.println("El total de ingreso fue de: $."+totalIngreso);
                            } else {
                                System.out.println("No se inicia el comienzo de ciclo"); 
                            }
                            break;
                        default:
                            System.out.println("Dia de la semana no valido.");
                        break;
                        }
                } else {
                System.out.println("Formato de fecha incorrecto.");
                }
                break;
            }else{
                System.out.println("Opcion no valida."); 
            }
        }
    }   
}
