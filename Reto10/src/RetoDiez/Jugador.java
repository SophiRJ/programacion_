package RetoDiez;

import java.util.ArrayList;

public class Jugador extends Carton{
    private String nombre;
    private String Dni;
    ArrayList<Carton> cartones=new ArrayList<>();
    private int saldo;
    private boolean ganador=false;


    public void recargarSaldo(int cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
        }
    }

    public void verCartones() {
        for (int i = 0; i < cartones.size(); i++) {
            System.out.println("Carton numero " + (i + 1));
            cartones.get(i).verNumeros();
        }
    }

    public void mostrarDatos() {
        System.out.println("Nombre " + nombre);
        System.out.println("Saldo " + saldo);
        System.out.println("Cartones ");
        verCartones();
    }
    public void comprobarNumeros(int numero){
        ganador=false;
        for(int i=0;i<cartones.size();i++){
            cartones.get(i).comprobarNumero(numero);
            if( cartones.get(i).getNumeroAciertos()==10){
                    ganador=true;
                System.out.println("Has acertado todos los numeros");
                System.out.println("Carton ganador "+cartones.get(i).getListaNumeros());
            }
        }
    }

    /*public void comprobarNumero(int numero) {
        int contadorAciertos = 0;
        for (int i = 0; i < cartones.size(); i++) {
            ArrayList<Integer> lista;
            lista = cartones.get(i).getListaNumeros();
            for (int j = 0; j < lista.size(); j++) {
                if (numero == lista.get(j)) {
                    contadorAciertos++;
                    if (contadorAciertos == 10) {
                        ganador = true;
                    }
                }
            }
        }
        if(ganador){
            System.out.println("Carton premiado has acertado todos");
        }

    }*/
    public void comprarCartones(int cantidad){
        if(saldo-cantidad>=0){
            saldo-=cantidad;
            for (int i=0;i<cantidad;i++){
                cartones.add(new Carton());
            }
        }
    }
    public boolean isGanador(){
        return ganador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String dni) {
        Dni = dni;
    }

    public ArrayList<Carton> getCartones() {
        return cartones;
    }

    public void setCartones(ArrayList<Carton> cartones) {
        this.cartones = cartones;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setGanador(boolean ganador) {
        this.ganador = ganador;
    }
}

