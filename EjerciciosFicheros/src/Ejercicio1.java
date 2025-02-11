import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio1 {
    public static void main(String[] args) {
        File file=new File("texto.txt");
        creacionFichero(file);
        lecturaFichero(file);
    }
    static void creacionFichero(File fichero){
        File file=new File("texto.txt");
        if(!fichero.exists()){
            try {
                fichero.createNewFile();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
    static void lecturaFichero(File fichero){
        FileReader lectura;
        int leer;
        try {

            lectura = new FileReader(fichero);
           while((leer = lectura.read())!=-1) {
               if(leer!=32) {
                   System.out.print((char) leer);
               }
           }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
