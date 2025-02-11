package EjerciciosArraysP;

import java.util.Scanner;

public class MediaPositivosNegativos {
    /*Programa Java que llene un array con 10 números enteros que se leen por teclado. A continuación calcula y muestra
    la media de los valores positivos y la de los valores negativos del array*/
    public static void main(String[] args) {
        MediaPositivosNegativos mediaPositivosNegativos=new MediaPositivosNegativos();
        int[] arrayCreado=mediaPositivosNegativos.crearArray();
        mediaPositivosNegativos.calculos(arrayCreado);
    }
    public int[] crearArray(){
        int [] enteros=new int[10];
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<enteros.length;i++){
            System.out.println("Introduce el valor del numero "+(i+1));
            enteros[i]=scanner.nextInt();
        }
        return enteros;
    }
    public void calculos(int[] array){
        int sumaP=0;
        int sumaN=0;
        int contP=0;
        int contN=0;
        int mediaP;
        int mediaN;
        for(int i=0;i<array.length;i++){
            if(array[i]>0){
                sumaP=sumaP+array[i];
                contP++;
            }else if(array[i]<0){
                sumaN=sumaN+array[i];
                contN++;
            }
        }
        mediaP=sumaP/contP;
        mediaN=sumaN/contN;
        System.out.println("La media de los valores positivos es "+mediaP);
        System.out.println("La media de los valores negativos es"+mediaN);
    }
}
