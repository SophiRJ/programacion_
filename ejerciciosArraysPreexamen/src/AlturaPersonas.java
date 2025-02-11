import java.util.Scanner;

public class AlturaPersonas {
    /*Programa Java para leer la altura de N personas y calcular la altura media. Calcular cuántas personas
    tienen una altura superior a la media y cuántas tienen una altura inferior a la media.
     El valor de N se pide por teclado y debe ser entero positivo.*/
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n;
        do {
            System.out.println("De cuantas personas quieres calcular la altura ");
            n = scanner.nextInt();
        }while (n<=0);
        AlturaPersonas alturaPersonas=new AlturaPersonas();
        int[] arrayAlturas=alturaPersonas.creacionArray(n);
        alturaPersonas.calculos(arrayAlturas);
    }
    public int[] creacionArray(int longitud){
        int[] alturas=new int[longitud];
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<longitud;i++){
            System.out.println("Indica la altura "+(i+1));
            alturas[i]=scanner.nextInt();
        }
        return alturas;
    }
    public void calculos(int[] array){
        int suma=0;
        int media;
        int supMedia=0;
        int infMedia=0;
        for(int i=0;i<array.length;i++){
            suma+=array[i];
        }
        media=suma/array.length;
        for (int i=0;i<array.length;i++){
            if(array[i]>media){
                supMedia++;
            } else if (array[i]<media) {
                infMedia++;
            }
        }
        System.out.println("Cantidad de personas con altura inferior a la media "+infMedia);
        System.out.println("Cantidad de personas con altura superior a la media "+supMedia);
    }
}
