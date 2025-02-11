package ArraysE;

import java.util.ArrayList;
import java.util.Scanner;

public class BuscarElementos {
    public static void main(String[] args) {
        ArrayList<String> nombre=new ArrayList<>();
        nombre.add("Maria");
        nombre.add("Pedro");
        nombre.add("Gabriela");
        nombre.add("Leandro");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce un nombre a buscar");
        String dato=scanner.next();
        int cont=0;
        while(!nombre.get(cont).equalsIgnoreCase(dato)){
            cont++;
        }
        if(nombre.get(cont).equalsIgnoreCase(dato)){
            System.out.println("El nombre esta en la posocion "+cont);
        }else{
            System.out.println("El nombre no esta en la coleccion");
        }
    }
}
