package EjerciciosArraysP;

import java.util.Scanner;

public class AsugnaturaNota {
    public static void main(String[] args) {
        /*Escribir un programa que almacene las asignaturas de un curso (por ejemplo Matemáticas, Física, Química,
        Historia y Lengua) en un array, pregunte al usuario la nota que ha sacado en cada asignatura, y después las
         muestre por pantalla con el mensaje En <asignatura> has sacado <nota> donde <asignatura> es cada una des las
         asignaturas del array y <nota> cada una de las correspondientes notas introducidas por el usuario*/

        AsugnaturaNota asugnaturaNota=new AsugnaturaNota();
        String[] arrayCreado=asugnaturaNota.crearArray();
        asugnaturaNota.mostrarNota(arrayCreado);
    }
    public String[] crearArray(){

        return new String[]{"Matematicas","Fisica","Quimica","Historia","Lengua"};
    }
    public void mostrarNota(String[] array){
        Scanner scanner=new Scanner(System.in);
        int [] notas=new int[array.length];
        for(int i=0;i<array.length;i++) {
            System.out.println("Que nota sacaste en "+array[i]);
            notas[i] =scanner.nextInt();
        }
        System.out.println("Mostrando notas");
        for (int i=0;i<array.length;i++){
            System.out.println("Tu nota en "+array[i]+"es "+notas[i]);
        }
    }
}
