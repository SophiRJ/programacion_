package EjerciciosArraysP;

import java.util.Scanner;

public class OpcionesPalabras {
    public static void main(String[] args) {
        String[] palabras=new String[10];
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i< palabras.length;i++){
            System.out.println("Introduce la palabra "+(i+1));
            palabras[i]=scanner.next();
        }
        int option;
        int numLetras = 0;
        do {
            System.out.println("Elige una opcion:\n1-> Ver todoas las palabras.\n2->Obtener una palabra al azar" +
                    "\n3->Ver numero de letras.\nVer media de letras." +
                    "\nVer palabra con mas letras.\nVer palabra con menos letras");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    for (int i = 0; i < palabras.length; i++) {
                        System.out.println(palabras[i]);
                    }
                    break;
                case 2:
                    int aleatorio = (int) (Math.random() * palabras.length);
                    System.out.println(palabras[aleatorio]);
                    break;
                case 3:
                    for (int i = 0; i < palabras.length; i++) {
                        numLetras = numLetras + palabras[i].length();
                    }
                    System.out.println("Longitud total de todas las palabras " + numLetras);
                    break;
                case 4:
                    int media;
                    media=numLetras/ palabras.length;
                    /*int[] longPalabras = new int[palabras.length];
                    for (int i = 0; i < longPalabras.length; i++) {
                        longPalabras[i] = palabras[i].length();
                        suma = suma + longPalabras[i];
                    }
                    System.out.println("La suma de todos los caracteres es " + suma);
                    media = suma / longPalabras.length;*/
                    System.out.println("La media es " + media);
                    break;
                case 5:
                    String palabraM = " ";
                    for (int i = 0; i < palabras.length; i++) {
                        if (palabras[i].length() > palabraM.length()) {
                            palabraM = palabras[i];
                        }
                    }
                    System.out.println("Palabra con mas letras: " + palabraM);
                    break;
                case 6:
                    String palabraMenor = palabras[0];
                    for (int i = 0; i < palabras.length; i++) {
                        if (palabras[i].length() < palabraMenor.length()) {
                            palabraMenor = palabras[i];
                        }
                    }
                    System.out.println("Palabra con menos letras: " + palabraMenor);
                break;
            }
        }while(option<=6);
    }
}
