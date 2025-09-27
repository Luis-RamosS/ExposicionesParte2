package Clases;

public class Ejercicio9 {
    public static void ejercicio9() {
        for(int i=0;i<=100;i++){
            boolean esPrimo=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    esPrimo=false;
                    break;
                }
            }
            if(esPrimo){
                System.out.println(i);
            }
        }
    }
}
