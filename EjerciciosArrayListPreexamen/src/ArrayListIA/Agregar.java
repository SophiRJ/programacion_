package ArrayListIA;

import java.util.ArrayList;

public class Agregar {
    public static void main(String[] args) {
        /*Escriba un programa Java que cree un ArrayList de números enteros y agregue los números del 1 al 10 en él.
         Luego, imprima el ArrayList*/
        ArrayList<Integer> numeros= new ArrayList<>();
        //solo hice el for para que me diera los numeros del 1-10
        for(int i=0;i<10 ;i++){
            numeros.add(i+1);
        }
        //La clase arraylist ya tiene el toString incorporado por eso para imprimirlo directamente usamos el nombre sin for
        System.out.println(numeros);
    }
}
