import java.util.ArrayList;
import java.util.Collections;

public class OperacionesColecciones {
    /*>>  Crea un ArrayList de String y realiza las siguientes acciones:
 • Guarda manualmente 10 palabras.
 • Imprime por pantalla todas las palabras del arraylist.
 >>  Crea un ArrayList de números enteros que guarde valores aleatorios (entre 0 y
100). Una vez introducidos todos, calcula la suma, la media, el máximo y el mínimo
de esos números.*/
    ArrayList<String> palabras;
    ArrayList<Integer> numeros;
    public void operacionesNumeros(){
        numeros=new ArrayList<>();
        for (int i=0;i<15;i++){
            int aleatorio= (int) (Math.random()*11);
            numeros.add(aleatorio);
        }
        //imprimir(numeros);
        //obtenerAleatorio(numeros);
        calculosNumeros();
    }
    private void calculosNumeros(){
        int suma=0;
        double media=0;
        int maximo=0;
        int minimo=0;
        for(int i=0;i< numeros.size();i++){
            suma+= numeros.get(i);
        }
        System.out.println("La suma es "+suma);
        media= (suma/ numeros.size());
        System.out.println("Media es "+media);
        Collections.sort(numeros);
        maximo=numeros.get(0);
        minimo= numeros.get(numeros.size()-1);
        /*for (int i=0;i< numeros.size();i++){
            if(numeros.get(i)>maximo){
                maximo=numeros.get(i);
            }
        }*/
        System.out.println("El valor minimo es "+minimo);
        System.out.println("El valor maximo es "+maximo);
    }

    public void operacionesPalabras(){
        palabras=new ArrayList<>();
        palabras.add("programacion");
        palabras.add("base de datos");
        palabras.add("sistemas");
        palabras.add("desarollo");
        palabras.add("java");
        palabras.add("sql");
        palabras.add("linux");
        palabras.add("servidor");
        palabras.add("javascript");
        palabras.add("html");
        //imprimimos la longitud de nuestro ArrayList
        System.out.println(palabras.size());
        //modificamos el vlaor de una posicion
        palabras.set(6,"lenguajes");
        //sacamos una pocision concreta
        String contenido= palabras.get(4);
        System.out.println(contenido);
        imprimir(palabras);
        obtenerAleatorio(palabras);
    }
    //Para imorimir una palabra aleatoria
    private void obtenerAleatorio(ArrayList listaDatos){
        int aleatorio= (int) (Math.random()* listaDatos.size());
        Object elementoObtenido= listaDatos.get(aleatorio);
        System.out.println(elementoObtenido);
    }
    private void imprimir(ArrayList letras){
        //imprimimos array con for normal
       /* for (Object impresion: letras
             ) {
            System.out.println(impresion);
        }*/
        //imprimmos array on foreach
        for (int i=0;i< letras.size();i++){
            System.out.println(letras.get(i));
        }
    }
}
