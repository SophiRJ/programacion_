package EjerciciosArraysP;

import java.util.Scanner;

public class MostrarPares {
    /*Ingresar 10 números enteros y mostrar los números pares. Crear dos arrays en el que uno meterás todos los número y
    otro solo meterás los números pares. Al final muestra el segundo array (el de solo los pares)*/
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int contPares=0;
        int [] arrayCompleto=new int[10];
        int[] arrayPares=new int[10];
        for(int i=0;i<arrayCompleto.length;i++) {
            System.out.println("Introduce el valor del numero " +(i + 1));
            arrayCompleto[i]=scanner.nextInt();
        }
        for(int i=0;i<arrayCompleto.length;i++){
            if(arrayCompleto[i]%2==0){
                arrayPares[contPares]=arrayCompleto[i];
                contPares++;
            }
        }
        for (int i=0;i<contPares;i++){
            System.out.println(arrayPares[i]);
        }
    }
}
