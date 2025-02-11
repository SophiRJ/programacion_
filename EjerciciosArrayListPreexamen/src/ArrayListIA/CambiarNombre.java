package ArrayListIA;

import java.util.ArrayList;

public class CambiarNombre {
/*Escriba un programa Java que cree un ArrayList de nombres de países y
cambie un país específico por otro. Luego, imprima el ArrayList modificado*/
public static void main(String[] args) {
    ArrayList<String> paises=new ArrayList<>();
    paises.add("España");
    paises.add("Colombia");
    paises.add("Argentina");
    paises.add("Bolivia");
    paises.add("Chile");
    paises.add("Venezuela");

    paises.set(1,"Letonia");
    System.out.println(paises);
    char letra='C';
    for(int i=0;i< paises.size();i++){
        if(paises.get(i).charAt(0)==letra){
            paises.remove(paises.get(i));
        }
    }
    System.out.println(paises);
}
}
