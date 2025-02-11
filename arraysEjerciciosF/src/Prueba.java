import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x,y;
        System.out.println("Introduce el valor de x");
        x=scanner.nextInt();
        System.out.println("Introduce el valor de y");
        y=scanner.nextInt();
        if(x==0){
            System.out.println("Esta en un eje o en el origen");
        } else if (y==0){
            System.out.println("Esta en un eje o en el origen");
        }else if(x>0){
            if(y>0){
                System.out.println("Cuadrante 1");
            }else{
                System.out.println("Cuadrante 2");
            }
        } if (y<0) {
            System.out.println("Cuadrante 3");
        } else {
            System.out.println("Cuadrante 4");
        }
    }
}
