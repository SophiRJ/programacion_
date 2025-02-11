public class Ejercicio4 {
    public static void main(String[] args) {
        /* Crea un array de números de 100 posiciones, que contendrá los números del 1 al 100.
        Obtén la suma de todos ellos y la media*/
        crearArray();
        sumaArray();
    }
    static int[] crearArray(){
        int [] array= new int[100];
        for(int i=0;i< array.length;i++){
            array[i]=i+1;
        }
        return array;
    }
    static void sumaArray(){
        int suma=0;
        double media;
        for(int i=0;i<crearArray().length;i++){
            suma=suma+crearArray()[i];
        }
        media= (double) suma/ crearArray().length;
        System.out.println("La suma del array es "+suma);
        System.out.println("La media del la suma total es "+media);
    }
}
