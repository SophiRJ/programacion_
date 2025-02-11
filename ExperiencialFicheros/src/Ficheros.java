import java.io.File;
import java.util.Scanner;

public class Ficheros {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        String ruta= scn.nextLine();
        File fichero=new File(ruta);
        if(fichero.exists()){
            System.out.println("El fichero existe");
        }else{
            System.out.println("El fichero no existe");
        }
        if(fichero.isFile()){
            System.out.println("Esto es un fichero");
            System.out.println(fichero.length());
            System.out.println(fichero.getName());
            if(fichero.canWrite()){
                System.out.println("tiene ppermiso de escritura");
            }else{
                System.out.println("no tiene permiso de escritura");
            }
            if(fichero.canRead()){
                System.out.println("tine permisos de lectura");
            }else {
                System.out.println("no tiene permiso de lectura");
            }
        }else if(fichero.isDirectory()){
            System.out.println("Esto es un directorio");
        }
    }
}
