package EjerciciosArraysP;

import java.util.Scanner;

public class Examenes {
    public static void main(String[] args) {
        /*
        * En una clase de 5 alumnos se han realizado tres exámenes y se requiere
determinar el número de:
a) Alumnos que aprobaron todos los exámenes.
b) Alumnos que aprobaron al menos un examen.
c) Alumnos que aprobaron únicamente el último examen.
Realice un programa que permita la lectura de los datos y el cálculo de las

estadísticas.*/
        Scanner scanner=new Scanner(System.in);
        int [] nota=new int[3];
        int aprobTodos=0;
        int aprobUno=0;
        int aproUltimo=0;
        for (int i=0;i<5;i++){
            System.out.println("Alumno "+(i+1));
            for(int j=0;j<nota.length;j++){
                System.out.println("Introduce la nota del examen "+(i+1));
                nota[j]=scanner.nextInt();
            }
            if((nota[0]>5&&nota[1]>5&&nota[2]>5)){
                aprobTodos++;
            } if (nota [0]>5||nota[1]>5||nota[2]>5) {
                aprobUno++;
            } if(nota[0]<5&&nota[1]<5&&nota[2]>=5){
                aproUltimo++;
            }
        }
        System.out.println("Alumnos que aprobaron todos los examenes "+aprobTodos);
        System.out.println("Alumnos que aprobaronal menos un examen "+aprobUno);
        System.out.println("Alumnos que aprobaron el ultimo examen "+aproUltimo);
    }
}
