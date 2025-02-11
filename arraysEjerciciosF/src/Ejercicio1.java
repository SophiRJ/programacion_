import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        /* Crea un array de 10 posiciones de números con valores pedidos por teclado. Muestra por
        consola el indice y
        el valor al que corresponde. Haz dos métodos, uno para rellenar valores y otro para mostra*/
    Ejercicio1 array=new Ejercicio1();
    int [] arrayCreado= array.creacionArray();
    array.mostrarArray(arrayCreado);
    }
    private int[] creacionArray(){
        int[] array= new int[10];
        Scanner scn=new Scanner(System.in);
        for (int i=0;i< array.length;i++){
            System.out.println("Introduce el numero "+(i+1));
            array[i]= scn.nextInt();
        }
        return array;
    }
    private void mostrarArray(int[]array){
        for (int i=0; i<array.length;i++){
            System.out.println("Indice "+i+" valor "+array[i]);
        }
    }
}
