package EjerciciosArraysP;

import java.util.Scanner;

public class PositivosNegativos {
    /*Programa Java que guarda en un array 10 números enteros que se leen por teclado.
     A continuación se recorre el array
    y calcula cuántos números son positivos, cuántos negativos y cuántos ceros.*/
    public static void main(String[] args) {
        PositivosNegativos positivosNegativos=new PositivosNegativos();
        int[] creacionArray=positivosNegativos.crearArray();
        positivosNegativos.calculos(creacionArray);
    }
    public int[] crearArray() {
        Scanner scanner=new Scanner(System.in);
        int[] arrayNumeros=new int[10];
        for(int i=0;i<arrayNumeros.length;i++){
            System.out.println("Introduce el valor del numero "+(i+1));
            arrayNumeros[i]=scanner.nextInt();
        }
        return arrayNumeros;
    }
    public void calculos(int[] arrayN){
        int contP=0;
        int contN=0;
        int nulo=0;
        for(int i=0;i<arrayN.length;i++){
            if(arrayN[i]>0){
                contP++;
            } else if (arrayN[i]<0) {
                contN++;
            } else if (arrayN[i]==0) {
                nulo++;
            }
        }
        System.out.println("Numeros positivos "+contP);
        System.out.println("Numeros negativos "+contN);
        System.out.println("Ceros "+nulo);
    }
}
