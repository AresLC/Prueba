/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicas.uf1_dni;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class LozanoAresDNI {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        //añado un scanner para leer todo lo introducido por el usuario
        Scanner entrada = new Scanner(System.in);
        //añado las 23 letras posibles con un char
        char [] letras =  {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'}; 
        //Pido que se introduzca solo el numero del dni sin letra
        System.out.println("Introduce tu número del DNI sin la letra:");
        //hago un int para poder añadir los numeros
        int numerosdni;
        
        
        if (entrada.hasNextInt()){
            //añado los numeros con el scanner 
            numerosdni = entrada.nextInt(); 
            //si el numero es correcto pasara a pedir la letra del dni
            System.out.println("Introduce la letra en mayúscula de tu DNI");
            //con el char añado la letra introducida
            char letraint;
            //ahora el sistema solo lee la primera letra que se ha introducido
            letraint = entrada.next().charAt(0);  
            //con esto hago que sea indiferente si la letra es mayúscula o minúscula
            letraint = Character.toUpperCase(letraint);
            //con este sout imprimo el dni que he introducido si está bien introducido
            System.out.println("Este es el DNI completo introducido " + numerosdni + letraint);
            //con este char añado la letra resultante del calculo siguiente
            char letrares;
            //Gracias al (if) si la cantidad de numeros no es inferior a 99999999 saldra que el numero no es valido por lo tanto se tendra que volver a introducir
        if (numerosdni > 0 && numerosdni < 99999999){
            //con este calculo saco el numero de la letra que pertenece al numero que hemos introducido
            int resdni = numerosdni % letras.length;
            //con este igual enlazo el numero que nos da el cáculo con la la letra a la que le pertoca
            letrares = letras[resdni];
            //entonces se imprime el numero completo con el numero que hemos introducido y su respectiva letra
            System.out.println("Este es tu dni completo:" + numerosdni + letrares);  
            //si la letra que hemos introducido es igual a la letra resultanto entonces el dni será válido
            if (letraint == letrares){
            System.out.println("El dni es valido");
            //sino el dni no és valido y hay que volver a iniciar el programa
            } else {
                System.out.println("El dni no es valido");
       }
         //si el numero es mayor de lo que toca o se añade una letra hay que volver a iniciar el programa y introducirlo correctamente
       } else {
           System.out.println("El numero no esta bien introducido, introducelo correctamente.");
       }
        //si el numero es mayor de lo que toca o se añade una letra hay que volver a iniciar el programa y introducirlo correctamente
      } else {
          System.out.println("El numero no es valido, introducelo correctamente");
      }
    }
}
