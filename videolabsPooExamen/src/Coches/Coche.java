package Coches;

public class Coche {
    private String marca;
    private String modelo;
    private int cv;
    private int velocidad;

    public Coche(String marca, String modelo, int cv) {
        this.marca = marca;
        this.modelo = modelo;
        this.cv = cv;
    }
    public void acelerar(int velocidad){
        if(this.velocidad+velocidad>200||velocidad<0){
            System.out.println("Error a la hora de acelerar");
        }else{
            this.velocidad+=velocidad;
            System.out.println("La nueva velocidad es "+this.velocidad);
        }
    }
    public void frenar(int velocidad){
        if(velocidad<0){
            System.out.println("Error a la hora de frenar");
        }else if(this.velocidad-velocidad<0){
            this.velocidad=0;
        }else {
            this.velocidad-=velocidad;
            System.out.println("La nueva velocidad es "+this.velocidad);
        }
    }
    public void mostrarDatos(){
        System.out.println("Marca "+marca);
        System.out.println("Modelo "+modelo);
        System.out.println("cv "+cv);
        System.out.println("Velocidad "+velocidad);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
}
