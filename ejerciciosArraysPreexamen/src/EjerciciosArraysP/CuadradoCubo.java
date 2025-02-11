package EjerciciosArraysP;

public class CuadradoCubo {
    public static void main(String[] args) {
        int [] numero=new int[20];
        int[] cuadrado=new int[20];
        int[] cubo=new int[20];
        System.out.println("Impresion de valores ");
        for(int i=0;i< numero.length;i++){
            numero[i]= (int) (Math.random()*101);
            System.out.print(numero[i]+" ");
        }
        System.out.println("\nImpresion de valores al cuadrado ");
        for (int i=0;i< cuadrado.length;i++){
            cuadrado[i]=(int)Math.pow(numero[i],2);
            System.out.print (cuadrado[i]+" ");
        }
        System.out.println("\nImpresion de valores al cubo ");
        for (int i=0;i< cubo.length;i++){
            cubo[i]=(int)Math.pow(numero[i],3);
            System.out.print(cubo[i]+" ");
        }
    }
}
