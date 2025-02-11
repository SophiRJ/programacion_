package Ficheros;

import java.io.*;

public class FicheroSimpleBinario {
    public static void main(String[] args) {
        File f=new File("ruta.ddr");
        if(!f.exists()){
            try {
                f.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        FileOutputStream fo=null;
        try {
            fo=new FileOutputStream(f,true);
            String frase="Esto es un ejmplo de escritura";
            byte[]codigo=frase.getBytes();
            fo.write(codigo);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally{
            if(fo!=null){
                try {
                    fo.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        FileInputStream fi=null;
        try {
            fi=new FileInputStream(f);
            int caracter=fi.read();
            while((caracter!=-1)){
                System.out.print((char)caracter);
                caracter=fi.read();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if(fi!=null){
                try {
                    fi.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
