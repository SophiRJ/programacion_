package FicherosPrexamen;

import java.io.*;
import java.util.Scanner;

public class EjercicioCuatro {
    public static void main(String[] args) {
        /*Escribir un programa para gestionar un listín telefónico con los nombres y los teléfonos de los
        clientes de una empresa. El programa incorporar funciones crear el fichero con el listín si no existe,
         para consultar el teléfono de un cliente, añadir el teléfono de un nuevo cliente y eliminar el teléfono
          de un cliente. El listín debe estar guardado en el fichero de texto listin.txt donde el nombre del cliente
         y su teléfono deben aparecer separados por comas y cada cliente en una línea distinta.*/
        Scanner scanner=new Scanner(System.in);
        EjercicioCuatro ejercicioCuatro=new EjercicioCuatro();
        File f=new File("lintin.txt");
        File ficheroCreado=ejercicioCuatro.creacionFichero(f);
        System.out.println("Elija una opcion:\n1->Añadir nuevo cliente en el lintin.\n2->Consultar telefono.");
        int option=scanner.nextInt();
        switch (option){
            case 1:
                ejercicioCuatro.aniadirCliente(ficheroCreado);
            break;
            case 2:
                ejercicioCuatro.consultarTelefono(ficheroCreado);
            break;
        }
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
    public void consultarTelefono(File f){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nombre del cliente que quiere consultar");
        String nombre=scanner.nextLine();
        BufferedReader br=null;
        try {
            br=new BufferedReader(new FileReader(f));
            String lectura;
            while((lectura=br.readLine())!=null){
                String[] parte=lectura.split(",");
                if(parte[0].equalsIgnoreCase(nombre)){
                    System.out.println("Telefono de cliente "+parte[0]+": "+parte[1]);
                }
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
    public void aniadirCliente(File f){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduzca el nombre del nuevo cliente");
        String nombre=scanner.nextLine();
        System.out.println("Introduce el telefono");
        int telefono=scanner.nextInt();
        PrintWriter pw=null;
        try {
            pw=new PrintWriter(new FileWriter(f,true));
            pw.println(nombre+","+telefono);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(pw!=null){
                pw.close();
            }
        }
    }
}
