package EjerciciosArraysP;

import java.util.Scanner;

public class FraseCaracteres {
    public static void main(String[] args) {
        /*Pide al usuario por teclado una frase y pasa sus caracteres a un array de caracteres.
        Puedes hacer con o sin métodos de String.*/
        Scanner scanner=new Scanner(System.in);
        System.out.println("Escribe una frase ");
        String frase =scanner.nextLine();
        char[] fraseC=new char[frase.length()];
        for(int i=0;i< fraseC.length;i++){
            fraseC[i]=frase.charAt(i);
            System.out.print(fraseC[i]);
        }
    }
}
