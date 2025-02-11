package RetoDiez;

import java.util.ArrayList;

public class Entrada {
    public static void main(String[] args) {
        ArrayList<Integer> aleatorios= new ArrayList<>();
        Jugador jugador1=new Jugador();
        jugador1.recargarSaldo(40);
        jugador1.comprarCartones(5);
        jugador1.mostrarDatos();
        do {
            int aleatorio=(int)((Math.random()*50)+1);
            System.out.println(aleatorio+" ");
            jugador1.comprobarNumeros(aleatorio);
        }while (!jugador1.isGanador());

    }
}
