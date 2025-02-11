package ArraysE;


import java.util.Scanner;

public class Caracteres {
    public static void main(String[] args) {
        /*Crea un array de números enteros.
Pide al usuario que introduzca un número a buscar.
Recorre el array e indica si el número introducido
 se encuentra en el array y, en caso afirmativo, en qué posición.*/
        int [] numeros= new int[10];
        for(int i=0;i<numeros.length;i++){
            numeros[i]=(int)(Math.random()*20);
        }
        for(int i=0;i< numeros.length;i++){
            System.out.print(numeros[i]+" ");
        }
        System.out.println();
        Scanner scn =new Scanner(System.in);
        System.out.println("Introduce un numero a buscar ");
        int numero= scn.nextInt();
        //for(int i=0;i<numeros.length;i++) {
            //if (numeros[i] == numero) {
              //  System.out.println("El numero esta en el array en la pocision "+i);
            //}
        //}
        int cont=0;
        while(numeros[cont]!=numero){
            cont++;
        }
        if(numeros[cont]==numero){
            System.out.println("El numero se encuentra en el array en la pocision "+cont);
        }else{
            System.out.println("El numero no se encuentra en el array");
        }
    }
}
