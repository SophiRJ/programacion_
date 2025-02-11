public class Contador {
    private int contador;
    public Contador(){
    }
    public Contador(int valor){
        if(valor<0){
            contador=0;
        }else {
            contador=valor;
        }
    }
    public Contador(Contador a){
        contador=a.contador;
    }
    public void incrementar(){
        contador++;
    }
    public void decrementar(){
        contador--;
        if(contador<0) {
            contador = 0;
        }
    }
    public String toString(){
        return "Valor de contador "+contador;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        if(contador<0){
            this.contador=0;
        }else {
            this.contador=contador;
        }

    }
}
