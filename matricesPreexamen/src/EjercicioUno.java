import java.util.Scanner;

public class EjercicioUno {
    public static void main(String[] args) {
        /* Crear dos matrices de nxn y sumar sus valores, los resultados se deben almacenar
         en otra matriz. Los valores y la longitud,
         seran insertados por el usuario. Mostrar las matrices originales y el resultado*/
        Scanner scanner = new Scanner(System.in);
        System.out.println(("Introduce el valor la longitud de la matriz "));
        int n=scanner.nextInt();
        int [][] matriz1= new int[n][n];
        int [][] matriz2=new int[n][n];
        int [][] matrizResultado=new int[n][n];
        System.out.println("Rellenamos amtriz 1");
        for(int i=0;i<matriz1.length;i++){
            System.out.println("Fila "+(i+1));
            for (int j=0;j<matriz1[i].length;j++){
                System.out.println("Introduce el valor "+(j+1));
                matriz1[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Rellenamos matriz 2");
        for(int i=0;i<matriz2.length;i++){
            System.out.println("Fila "+(i+1));
            for(int j=0;j<matriz2[i].length;j++){
                System.out.println("Introduce ek valor "+(j+1));
                matriz2[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Mostramoa matriz 1");
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Mosstramos matriz 2");
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Suma");
        for(int i=0;i<matriz1.length;i++){
            for(int j=0;j<matriz1[i].length;j++){
                matrizResultado[i][j] = (matriz1[i][j]+matriz2[i][j]);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrizResultado[i][j]+" ");
            }
            System.out.println();
        }
    }
}
