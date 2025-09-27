package Clases;

import java.util.Scanner;

public class Ejercicio5 {
    public static void ejercicio5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor para calcular un factorial: ");
        int num = sc.nextInt();
        if (num<0)
        {
            System.out.println("No se puede calcular un factorial de un numero negativo");

        }
        else{
            int factorial=1;
            for (int i=1;i<=num;i++)
            {
                factorial=factorial*i;
            }
            System.out.println("El factorial de "+num+" es: "+factorial);

        }

    }
}
