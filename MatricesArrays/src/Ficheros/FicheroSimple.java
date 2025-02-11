package Ficheros;

import java.io.*;
import java.util.Scanner;

public class FicheroSimple {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        File f=new File("lista.txt");
        if(!f.exists()){
            try {
                f.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(f.getAbsolutePath());
        System.out.println("Introduce una frase");
        String frase =scanner.nextLine();
        FicheroSimple ficheroSimple=new FicheroSimple();
        ficheroSimple.escritura(f,frase);
        ficheroSimple.leer(f);
    }
    public void escritura(File fichero, String frase){

        FileWriter fw=null;
        try {
            fw=new FileWriter(fichero, false);
            for (int i=0;i<frase.length();i++){
                char caracter= frase.charAt(i);
                 int letra=(byte)caracter;
                 fw.write(letra);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally{
            if(fw!=null){
                try {
                    fw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    public void leer(File fichero){
        FileReader fr=null;
        try {
            int lectura;
            fr=new FileReader(fichero);
            while((lectura=fr.read())!=-1){
                System.out.print((char)lectura);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
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
