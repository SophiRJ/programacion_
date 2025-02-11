package FicherosPrexamen;

import java.io.*;
import java.util.Scanner;

public class EjercicioDos {
    public static void main(String[] args) {
        EjercicioDos ejercicioDos=new EjercicioDos();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduzca el numero entre 1 y 10 de la tabla de multiplicar que desea ver");
        int n=scanner.nextInt();
        File f= new File("tabla-"+n+".txt");
        if(f.exists()){
            ejercicioDos.lecturaFichero(f);
        }else{
            System.out.println("El fichero no existe.");
        }
    }
    public void lecturaFichero(File f){
        BufferedReader br=null;
        try {
            br=new BufferedReader(new FileReader(f));
            String lectura;
            while((lectura=br.readLine())!=null){
                System.out.println(lectura);
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
