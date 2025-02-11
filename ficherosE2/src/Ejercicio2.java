import java.io.*;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Introduce la ruta del fichero ");
        String ruta= scn.nextLine();
        System.out.println("Introduce el texto que quieras escribir en el fichero");
        String texto=scn.nextLine();
        File ficheroC=escritura(ruta,texto);
        lecturaFichero(ficheroC);
    }
    static File escritura(String rutaF, String textoF){
        File fichero=new File(rutaF);
        BufferedWriter escribiendo=null;
        try{
            escribiendo=new BufferedWriter(new FileWriter (fichero,true));
            escribiendo.write(textoF);
            if(escribiendo!=null) {
                escribiendo.newLine();
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try{
                if(escribiendo!=null){
                    escribiendo.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return fichero;
    }
    static void lecturaFichero(File fichero){
        if(fichero.exists()){
            BufferedReader lectura=null;
            String ficheroLeido;
            try{
                lectura=new BufferedReader(new FileReader(fichero));
                while (true){
                if((ficheroLeido=lectura.readLine())==null) {
                    break;
                    }
                    System.out.println(ficheroLeido);
                }
            }catch (FileNotFoundException e){
                e.printStackTrace();
            }catch(IOException e){
                e.printStackTrace();
            }finally {
                try{
                    if(lectura!=null){
                        lectura.close();
                    }
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
