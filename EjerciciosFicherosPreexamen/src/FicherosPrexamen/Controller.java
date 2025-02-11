package FicherosPrexamen;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
/*
*  Para poder asegurar los conocimientos adquiridos durante este punto, se propone el
siguiente ejercicio:
>>   Realizar un programa que permita obtener información sobre un fichero. Para ello,
creando métodos para cada una de las acciones, se deberá:
 • Obtener la ruta del fichero indicado.
 • Obtener si el fichero indicado es carpeta o directorio.
 •  En caso de ser un directorio, pedir por consola un nombre y crear un fichero
con dicho nombre.
 • En el caso de ser un directorio, listar todos los elementos que estén dentro.
 • En el caso de ser un fichero, obtener los permisos de ejecución del mismo.
 Para el ejercicio se puede crear una carpeta en el escritorio llamada ejercicio_uf3 y
evaluar su contenido.
 >>   Una vez realizado esto, crear un programa que simule la funcionalidad de un
explorador. Para ello, el programa deberá lista las carpetas y ficheros de una ruta
concreta. De inicio, por ejemplo, mostrará la siguiente estructura de directorios /
ficheros:
 • DirectorioA
 ◦ Fichero1
 ◦ Subdirectorio1
 ‣ Fichero11*/

public class Controller {
    public static void main(String[] args) {
        Controller controller=new Controller();
        controller.obtenerRuta();
       // controller.crearFichero(new File("C:\\Users\\sofia\\OneDrive\\Documentos\\UAX\\PROGRAMACION"));
        controller.listarContenido(new File("C:\\Users\\sofia\\OneDrive\\Documentos\\UAX\\PROGRAMACION"));
    }
    public void obtenerRuta(){
        File f=new File("C:\\Users\\sofia\\OneDrive\\Documentos\\UAX\\PROGRAMACION");
        if(f.exists()) {
            System.out.println(f.getAbsolutePath());
            if(f.isDirectory()){
                System.out.println("Es una carpeta");
                try {
                    f.createNewFile();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }else {
                System.out.println("Es un archivo");
                if(f.canRead()){
                    System.out.println("Tiene permisos de lectura");
                }else {
                    System.out.println("No tiene permisos de lectura");
                }
                if(f.canWrite()){
                    System.out.println("Tiene permisos de escritura");
                }else {
                    System.out.println("No tiene permiso de escritura");
                }
            }
        }else{
            System.out.println("El fichero no existe");
        }
    }
    public void crearFichero(File file){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce el nombre del fichero a crear");
        String nombrefichero=scanner.nextLine();
        File ficheroNuevo=new File(file.getAbsolutePath()+"/"+nombrefichero);
        try {
            //evaluamos si la ruta existe
            if(file.exists()) {
                ficheroNuevo.createNewFile();
            }else{
                System.out.println("Fichero no creado por error en la carpeta inicial");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void listarContenido(File file){
        if(file.isDirectory()){
            String[] nombreFicheros=file.list();
            for(int i=0;i<nombreFicheros.length;i++){
                System.out.println(nombreFicheros[i]);
            }
            /*File[] fichero=file.listFiles();
            for(int i=0;i<fichero.length;i++){
                System.out.println(fichero[i]);
            }*/
        }else{
            System.out.println("No se puede listar por que no es un directorio");
        }
    }
}
