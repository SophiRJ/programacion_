package Hobbiton;

import java.util.ArrayList;

public class Aventura {
    public static void main(String[] args) {
        PersonajeH elfo=new Elfo("Legolas","Elfo del bosque");
        PersonajeH enano=new Enano("Gimli","Enano");
        PersonajeH hobbit=new Hobbit("Frodo","Hobit");
        PersonajeH humano=new Humano("Aragon","Humano");
        PersonajeH mago=new Mago("Ganldfal","Mago");
        ArrayList<PersonajeH> companiaAnillo=new ArrayList<>();
        Aventura aventura=new Aventura();
        aventura.aniadirMiembro(companiaAnillo,elfo);
        aventura.aniadirMiembro(companiaAnillo,enano);
        //aventura.mostrarDatos(companiaAnillo);
        aventura.aniadirMiembro(companiaAnillo,hobbit);
        aventura.aniadirMiembro(companiaAnillo,humano);
        aventura.aniadirMiembro(companiaAnillo,mago);
        //aventura.mostrarDatos(companiaAnillo);
        aventura.eliminar(companiaAnillo,mago);
        aventura.mostrarDatos(companiaAnillo);

    }
    public void aniadirMiembro(ArrayList<PersonajeH> comp,PersonajeH p){
        if(!comp.contains(p)){
            comp.add(p);
        }else {
            System.out.println("El personaje "+p.getNombre()+" ya esta en la lista no se puede añadir 2 veces");
        }
    }
    public void eliminar(ArrayList<PersonajeH> comp,PersonajeH p){
        if(comp.contains(p)){
            comp.remove(p);
        }else{
            System.out.println("El personaje "+p.getNombre()+" no forma parte de la compañia");
        }
    }
    public void mostrarDatos(ArrayList<PersonajeH> comp){
       for(int i=0;i<comp.size();i++){
           System.out.println("Personaje "+(i+1));
           System.out.println("Nombre "+comp.get(i).getNombre());
           System.out.println("Raza "+comp.get(i).getRaza());
           comp.get(i).habilidaEspecial();
       }

    }
}
