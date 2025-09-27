package Clases;

import java.util.Scanner;

public class Ejercicio8 {
    public static void ejercicio8(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra: ");
        String palabra = sc.next();

        for (int i=palabra.length()-1; i>=0; i--){
            System.out.println(palabra.charAt(i));
        }

    }
}
