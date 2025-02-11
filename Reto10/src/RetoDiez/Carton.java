package RetoDiez;

import java.util.ArrayList;

public class Carton {

    private ArrayList<Integer> listaNumeros=new ArrayList<>();
    private int numeroAciertos=0;
    public Carton(){
        for (int i=0;i<10;i++){
            int aleatorio=(int)((Math.random()*50)+1);
            listaNumeros.add(aleatorio);
        }
    }
    public void comprobarNumero(int n){
        for (int i=0;i< listaNumeros.size();i++){
            if(n== listaNumeros.get(i)){
                numeroAciertos++;
            }
        }
    }
    public void verNumeros(){
        for(int i=0;i< listaNumeros.size();i++){
            System.out.println(listaNumeros.get(i));
        }
    }

    public ArrayList<Integer> getListaNumeros() {
        return listaNumeros;
    }

    public void setListaNumeros(ArrayList<Integer> listaNumeros) {
        this.listaNumeros = listaNumeros;
    }

    public int getNumeroAciertos() {
        return numeroAciertos;
    }

    public void setNumeroAciertos(int numeroAciertos) {
        this.numeroAciertos = numeroAciertos;
    }
}
