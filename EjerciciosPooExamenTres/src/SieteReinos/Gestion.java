package SieteReinos;

import java.util.HashMap;

public class Gestion {
    private HashMap<String, CasaNoble> casaNoble;

    public Gestion() {
        this.casaNoble = new HashMap<>();
    }
    public void aniadir(CasaNoble casa){
        if(!casaNoble.containsKey(casa)){
            casaNoble.put(casa.getNombreCasa(),casa);
            System.out.println("Casa "+casa.getNombreCasa()+" añadida");
        }else{
            System.out.println("La casa ya esta añadida");
        }
    }
    public void eliminar(String casa){
        if(casaNoble.containsKey(casa)){
            casaNoble.remove(casa);
            System.out.println("Casa eliminada");
        }else{
            System.out.println("La casa no forma parte de los siete reinos");
        }
    }
    public void mostrarDatos(String nombre){
        if(casaNoble.containsKey(nombre)){
            System.out.println("Nombre "+casaNoble.get(nombre).getNombreCasa());
            System.out.println("Lema "+casaNoble.get(nombre).getLema());
            System.out.println("Escudo "+casaNoble.get(nombre).getEscudo());
        }else {
            System.out.println("La casa "+nombre+" no existe");
        }
    }
}
