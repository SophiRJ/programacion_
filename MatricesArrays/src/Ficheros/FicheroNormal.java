package Ficheros;

import java.io.*;

public class FicheroNormal {
    public static void main(String[] args) {
        File file=new File("texto.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        FicheroNormal ficheroNormal=new FicheroNormal();
        ficheroNormal.escribir(file);
        ficheroNormal.lectura(file);
    }
    public void escribir(File fichero){
        PrintWriter pw=null;
        try {
            pw=new PrintWriter(new FileWriter(fichero, false));
            pw.println("Esto es una prueba de escritura");
            pw.println(69);
            pw.println("Tengo hambre");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally{
            if(pw!=null){
                pw.close();
            }
        }
    }
    public void lectura(File fichero){
        BufferedReader bf=null;
        try {
            bf=new BufferedReader(new FileReader(fichero));
            String lectura;
            while((lectura= bf.readLine())!=null){
                System.out.println(lectura);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if(bf!=null){
                try {
                    bf.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

}
