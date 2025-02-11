package FicherosPrexamen;

import java.io.*;
import java.util.Scanner;

public class EjercicioTres {
    public static void main(String[] args) {
        /*Escribir una función que pida dos números n y m entre 1 y 10, lea el fichero tabla-n.txt
        con la tabla de multiplicar de ese número, y muestre por pantalla la línea m del fichero.
        Si el fichero no existe debe mostrar un mensaje por pantalla informando de ello.*/
        EjercicioTres ejercicioTres=new EjercicioTres();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduzca el numero entre 1 y 10 de la tabla de multiplicar que desea ver");
        int n= scanner.nextInt();
        System.out.println("Introduzca el numero de la fila que desea ver");
        int m=scanner.nextInt();
        File f=new File("tabla-"+n+".txt");
        if(f.exists()){
            ejercicioTres.lecturaFichero(f,m);
        }else {
            System.out.println("El fichero no existe");
        }
    }
    public void lecturaFichero(File f,int m){
        BufferedReader br=null;
        int cont=0;
        try {
            br=new BufferedReader(new FileReader(f));
            String lectura;
            while((lectura= br.readLine())!=null){
                cont++;
                if(cont==m){
                    System.out.println(lectura);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(br!=null){
                try {
                    br.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
