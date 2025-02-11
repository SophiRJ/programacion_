package ArraysE;

import java.util.HashMap;
import java.util.Scanner;

public class Hashmap {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        HashMap<String,Integer> nombres=new HashMap<>();
        nombres.put("Maria",25);
        nombres.put("Alberto",35);
        nombres.put("Aaron",24);
        nombres.put("Andres",62);
        System.out.println("De quien quieres saber su edad");
        String nomb= scanner.nextLine();
        if(nombres.containsKey(nomb)){
            System.out.println("La edad de "+nomb+" es "+nombres.get(nomb));
        }
    }
}
