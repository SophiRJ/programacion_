package FicherosPrexamen;

import java.io.*;
import java.util.Scanner;

public class EjercicioUno {
    public static void main(String[] args) {
        /*Escribir una función que pida un número entero entre 1 y 10 y guarde en un fichero con el nombre tabla-n.txt
        la tabla de multiplicar de ese número, done n es el número introducido.*/
        EjercicioUno ejercicioUno=new EjercicioUno();
        int dato=ejercicioUno.pedirDato();
        File f=new File("tabla-"+dato+".txt");
        File fichero= ejercicioUno.creacionFichero(f);
        ejercicioUno.escribirFichero(fichero,dato);
    }
    public File creacionFichero(File f){
        if(!f.exists()){
            try {
                f.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return f;
    }
    public int pedirDato(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduzca un numero entre el 1 y 10 para la tabla de multiplicar");
        return scanner.nextInt();
    }
    public void escribirFichero(File f,int n){
        BufferedWriter bw=null;
        try {
            bw=new BufferedWriter(new FileWriter(f,false));
            for (int i=0;i<10;i++){
                bw.write(n+" X "+(i+1)+" = "+(n*(i+1)));
                bw.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(bw!=null){
                try {
                    bw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
