import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        /*Crea un array de caracteres que contenga de la ‘A’ a la ‘Z’ (solo las mayúsculas).
        Después, ve pidiendo posiciones del array por teclado y si la posicion es correcta,
        se añadira a una cadena que se mostrara al final, se dejará de insertar cuando se
         introduzca un -1.*/
    creacionArray();
    }
    static void creacionArray(){
        String [] array={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","Ñ","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        Scanner scn = new Scanner(System.in);
        int posicion;
        StringBuilder cadena= new StringBuilder(" ");
        do {
            System.out.println("Que pocision quieres imprimir");
            posicion = scn.nextInt();
            if(posicion>=27) {
                System.out.println("Error inserte otro numero");
            }else{
                if(posicion!=-1) {
                    cadena.append(array[posicion]);
                    }
                }
        }while(posicion != -1);
        System.out.println(cadena);
    }
}
