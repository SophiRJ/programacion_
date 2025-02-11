package EjerciciosArraysP;

public class MayorMenor {
    /*Escribir un programa que almacene en un array los siguientes precios, 50, 75, 46, 22, 80, 65, 8,
    y muestre por pantalla el menor y el mayor de los precios*/
    public static void main(String[] args) {
        int [] precio={50,75,46,22,80,65,8};
        int menor=precio[0];
        int mayor=0;
        for(int i=0;i< precio.length;i++){
            if(precio[i]>mayor){
                mayor=precio[i];
            }
            if(precio[i]<menor){
                menor=precio[i];
            }
        }
        System.out.println("El precio menor es "+menor);
        System.out.println("El precio mayor es "+mayor);
    }
}
