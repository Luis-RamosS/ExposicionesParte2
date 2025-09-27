package Clases;

public class Ejercicio6 {
    public static void ejercicio6() {
        int sumaPares=0;
        int sumaImpares=0;

        for (int i = 1; i <=100 ; i++) {
            if (i%2 == 0) {
                sumaPares+=i;
            }
            else {
                sumaImpares+=i;
            }
        }
        System.out.println("La suma de pares es: "+sumaPares);
        System.out.println("La suma de impares es: "+sumaImpares);
    }
}
