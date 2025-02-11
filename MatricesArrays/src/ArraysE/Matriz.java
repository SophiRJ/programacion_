package ArraysE;

public class Matriz {
    public static void main(String[] args) {
        int[][] matriz=new int[4][4];
        for(int i=0;i< matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                matriz[i][j]=(int)(Math.random()*20);
            }
        }
        for(int i=0;i< matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        int suma=0;
        for(int i=0;i< matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
               suma=suma+matriz[i][j];
            }
        }
        System.out.println(suma);
        int media= suma/ matriz.length*2;
        System.out.println(media);
        for(int i=0;i<matriz.length;i++){
            System.out.print(matriz[2][i]+" ");
        }
        System.out.println();
        int sumaFila=0;
        for(int i=0;i<matriz.length;i++){
            sumaFila=sumaFila+matriz[2][i];
        }
        System.out.println(sumaFila);
    }
}
