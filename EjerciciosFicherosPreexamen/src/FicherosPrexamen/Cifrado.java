package FicherosPrexamen;
/* Realizar un programa que pida al usuario por consola una frase. Una vez introducida
esta, el sistema cifrará el contenido de la misma y la escribirá en un fichero llamado
cifrado.txt. Para realizar el cifrado se necesita multiplicar por 2 el código ASCII
de la lectura correspondiente, obteniendo así un carácter totalmente distinto del
perteneciente al mensaje real.
 >>  Una vez realizado el cifrado, realizar un método llamado descifrarFichero(), el cual
lea el fichero cifrado en el punto anterior y lo muestre por pantalla.*/

import java.io.*;
import java.util.Scanner;

public class Cifrado {
    public static void main(String[] args) {
        Cifrado cifrado=new Cifrado();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce la frse que quieres cifrar");
        String frase=scanner.nextLine();
        File fichero=new File("cifrado.txt");
        if(!fichero.exists()){
            try {
                fichero.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        cifrado.cifrado(fichero,frase);
        cifrado.fraseDescifrada(fichero);
    }
    public void cifrado(File f,String frase){
        FileWriter bf= null;
        try {
            bf=new FileWriter(f);
            for(int i=0;i<frase.length();i++){
                int letra=(byte) frase.charAt(i);
                bf.write((char)letra*2);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(bf!=null){
                try {
                    bf.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    public void fraseDescifrada(File f){
        FileReader fr =null;
        try {
            fr=new FileReader(f);
            char lectura;
            int palabra;
            while((palabra=fr.read())!=-1){
                lectura=(char)(palabra/2);
                System.out.print(lectura);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(fr!=null){
                try {
                    fr.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
