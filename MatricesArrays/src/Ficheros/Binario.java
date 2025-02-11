package Ficheros;

import java.io.*;

public class Binario {
    public static void main(String[] args) {
        String nombre="ejemplo.txt";
        File fichero=new File(nombre);
        if(!fichero.exists()){
            try {
                fichero.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        Binario binario=new Binario();
        binario.escribir(fichero);
        binario.leer(fichero);
    }
    public void escribir(File f){
        DataOutputStream dos=null;
        try {
            dos=new DataOutputStream(new FileOutputStream(f));
            dos.writeUTF("Esto es un ejemplo de escritura en binario");
            dos.writeInt(32);
            dos.writeUTF("Tengo sueño");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if(dos!=null){
                try {
                    dos.flush();
                    dos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    public void leer(File f){
        DataInputStream dis=null;
        try {
            dis=new DataInputStream(new FileInputStream(f));
            System.out.println(dis.readUTF());
            System.out.println(dis.readInt());
            System.out.println(dis.readUTF());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally{
            if(dis!=null){
                try {
                    dis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
