package Clases;
import java.util.Scanner;

public class Ejercicio3 {
    public static void ejercicio3(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Ingrese un numero: ");
      int numero = sc.nextInt();

      for(int i=1;i<=10;i++){
          System.out.println(numero+"x"+i+" = "+numero*i);
      }
    }
}
