package PalabrasNumeros;

import java.util.ArrayList;
import java.util.Objects;
/* >  Crea un ArrayList de String y realiza las siguientes acciones:
 • Guarda manualmente 10 palabras.
 • Imprime por pantalla todas las palabras del arraylist.
 >>  Crea un ArrayList de números enteros que guarde valores aleatorios (entre 0 y
100). Una vez introducidos todos, calcula la suma, la media, el máximo y el mínimo
de esos números.*/

public class OperacionesColecciones {
    private ArrayList<String> palabras;
    private ArrayList<Integer> numeros;
    public void operacionesPalabras(){
        System.out.println("Iniciando operaciones");
        palabras=new ArrayList<>();
        palabras.add("Programacion");
        palabras.add("Sistemas");
        palabras.add("Bases de datos");
        palabras.add("Entornos de desarollo");
        palabras.add("Lenguaje de marcas");
        palabras.add("Java");
        palabras.add("JavaScript");
        palabras.add("Html");
        palabras.add("Desarollo");
        palabras.add("Ingles");
        System.out.println(palabras.size());
        System.out.println(palabras.get(5));
        //imprimirArray(palabras);
        obtenerAleatoria(palabras);
        palabras.set(9,"FOL");
        System.out.println(palabras.get(9));
    }
    private void imprimirArray(ArrayList listarDatos){
        for (Object item:listarDatos) {
            System.out.println(item);
        }
    }
    private void obtenerAleatoria(ArrayList listarDatos){
        int aleatorio=(int) (Math.random()*listarDatos.size()-1);
        System.out.println(listarDatos.get(aleatorio));
    }
    public void operacionesNumeros(){
        numeros=new ArrayList<>();
        for(int i=0;i<20;i++){
            numeros.add((int)(Math.random()*100));
        }
        imprimirArray(numeros);
        //obtenerAleatoria(numeros);
        calculosNumeros();
    }
    private void calculosNumeros(){
        int suma=0;
        int max=0;
        int min=numeros.get(0);
        double media;
        for(int i=0;i<numeros.size();i++){
            suma=suma+numeros.get(i);
            if(numeros.get(i)>max){
                max=numeros.get(i);
            }
            if(numeros.get(i)<min){
                min= numeros.get(i);
            }
        }
        media=(double)suma/numeros.size();
        System.out.println("La suma de todos los numeros es "+suma);
        System.out.println("La media de los numeros es "+media);
        System.out.println("El valor maximo es "+max);
        System.out.println("El valor minimo es "+min);
    }
}
