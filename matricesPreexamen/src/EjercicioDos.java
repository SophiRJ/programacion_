import java.util.Scanner;

public class EjercicioDos {
    public static void main(String[] args) {
        EjercicioDos ejercicioDos = new EjercicioDos();
        /*
        *Nos piden crear una matriz de 4×4 de números enteros que inicialmente esta vacía, nos piden hacer un menú con estas opciones:

Rellenar TODA la matriz de números, debes pedírselo al usuario.
Suma de una fila que se pedirá al usuario (controlar que elija una correcta)
Suma de una columna que se pedirá al usuario (controlar que elija una correcta)
Sumar la diagonal principal (ver ejemplo)
Sumar la diagonal inversa (ver ejemplo)
La media de todos los valores de la matriz
* MPORTANTE: hasta que no se haga la primera opción, el resto de opciones no se deberán de ejecutar,
* simplemente mostrar un mensaje donde diga que debes rellenar la matriz.*/
        int[][] matriz = new int[4][4];
        Scanner scanner = new Scanner(System.in);
        boolean rellenado = false;
        int option;
        do {
            System.out.println("Elige una opcion \n1->Rellenar la matriz\n2->Suma de una fila\n3->suma de una columna\n4->Suma de diagonal principal\n5->Media");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    ejercicioDos.rellenarM(matriz);
                    rellenado = true;
                    break;
                case 2:
                    if (rellenado) {
                        int fila;
                        do {
                            System.out.println("Indique la fila que desea sumar");
                            fila = scanner.nextInt();
                        }while(!(fila>=0&&fila<matriz.length));
                        ejercicioDos.sumaFila(matriz,fila);
                    } else {
                        System.out.println("Rellene la matriz antes");
                    }
                    break;
                case 3:
                    if(rellenado){
                        int columna;
                        do {
                            System.out.println("Indique la columna a sumar ");
                            columna = scanner.nextInt();
                        }while (!(columna>=0&&columna<matriz.length));
                        ejercicioDos.sumaColumna(matriz,columna);
                    }else{
                        System.out.println("Rellene la matriz antes");
                    }
                break;
                case 4:
                    if(rellenado){
                        ejercicioDos.sumaDiagonalPrincipal(matriz);
                    }else{
                        System.out.println("Debe rellenar primero la matriz");
                    }
                break;
                case 5:
                    if(rellenado){
                        ejercicioDos.media(matriz);
                    }else{
                        System.out.println("Debe rellenar la matriz");
                    }
            }
        } while (option > 0 && option <= 5) ;
    }
    public void rellenarM(int[][] matriz){
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Fila " + (i + 1));
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Introduzca el valor de la columna " + (j + 1));
                matriz[i][j]=scanner.nextInt();
            }
        }
    }public void sumaFila(int[][] matriz, int fila){
        int suma=0;
            for (int i = 0; i < matriz.length; i++) {
                suma=suma+matriz[fila][i];
            }
            System.out.println("La suma de la fila "+fila+" es "+suma);
    }
    public void sumaColumna(int[][] matriz, int columna){
        int suma=0;
        for (int i=0;i<matriz.length;i++){
            suma +=matriz[i][columna];
        }
        System.out.println("La suma de la columna "+columna+" es "+suma);
    }
    public void sumaDiagonalPrincipal(int[][] matriz){
        int suma=0;
        for (int i=0;i< matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                if(matriz[i]==matriz[j]){
                    suma=suma+(matriz[i][j]);
                }
            }
        }
        System.out.println("La suma de la diagonal es "+suma);
    }
    public void media(int[][] matriz){
        int suma=0;
        int media;
        for (int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                suma= suma+matriz[i][j];
            }
        }
        media=suma/(matriz.length+2);
        System.out.println("La media de la matriz es "+media);
    }
}
