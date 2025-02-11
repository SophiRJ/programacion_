import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        /*Crea un array de números donde le indicamos por teclado el tamaño del array,
        rellenaremos el array con números aleatorios entre 0 y 9, al final muestra por pantalla
         el valor de cada posición y la suma de todos los valores. Haz un método para rellenar el array
          (que tenga como parámetros los números entre los que tenga que generar), para mostrar el
           contenido y la suma del array y un
         método privado para generar número aleatorio (lo puedes usar para otros ejercicios).*/
        int longmax=9;
        int[] arrayCreado=rellenarArray(longmax);
        mostrarArray(arrayCreado);
    }
    static int[] rellenarArray(int b){
        Scanner scn=new Scanner(System.in);
        System.out.println("Indique la longitud del array");
        int longitud=scn.nextInt();
        int[] array=new int[longitud];
        for (int i=0;i<array.length;i++){
            array[i]=((int)(Math.random()*b));
        }
        return array;
    }
    static void mostrarArray(int[] array){
        int sumaArray=0;
        for (int i=0;i< array.length;i++){
            System.out.println("Valor "+(i+1)+" "+array[i]);
            sumaArray=sumaArray+array[i];
        }
        System.out.println("Suma total array "+sumaArray);
    }
}
