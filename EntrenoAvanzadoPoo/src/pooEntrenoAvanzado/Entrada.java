package pooEntrenoAvanzado;
/*d.	Desarrollar una clase entrada donde:
•	Se cree una figura de cada tipo, pasando los datos necesarios para el cálculo de la base y perímetro
•	Calcula cada uno de los datos mostrando el mensaje "La base del rectángulo es: XXX"
•	Modificación se mostrará un menú por el cual se podrán seleccionar opciones a ejecutar (operaciones con triangulo, con circulo y con cuadrado) una vez seleccionada la figura a trabajar se pedirá los datos necesarios (base, altura o radio) y la operación a realizar (calcular área, diámetro y/o perímetro)
    Para reducir código, es necesario que utilices la herencia
*/

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        Triangulo triangulo=new Triangulo(5,9);
        Circulo circulo=new Circulo(7.10);
        Cuadrado cuadrado=new Cuadrado(12,15);

        triangulo.calcularArea();
        System.out.println(triangulo);
        circulo.calcularArea();
        circulo.calcularDiametro();
        System.out.println(circulo);
        cuadrado.calcularArea();
        cuadrado.calcularPerimetro();
        System.out.println(cuadrado);
        System.out.print("Escoja una figura con que trabajar: \n1->Triangulo\n2->Circulo\n3->Cuadrado");
        int opcion= scn.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Indique la base");
                int base = scn.nextInt();
                triangulo.setBase(base);
                System.out.println("Indique la altura");
                int altura= scn.nextInt();
                triangulo.setAltura(altura);
                triangulo.calcularArea();
                System.out.println(triangulo);
                break;
            case 2:
                System.out.println("Indique el radio del circulo");
                double radio= scn.nextDouble();
                circulo.setRadio(radio);
                System.out.println("Que operacon desea realizar :\n1->Calcular Area\n2->Calcular diametro");
                int operacion= scn.nextInt();
                switch (operacion){
                    case 1:
                        double area= circulo.calcularArea();
                        System.out.println("El area del circulo es "+area);
                        break;
                    case 2:
                        double diametro=circulo.calcularDiametro();
                        System.out.println("el diametro circulo es: "+diametro);
                        break;
                }
                break;
            case 3:
                System.out.println("Indique la base del cuadrado");
                int base1 = scn.nextInt();
                cuadrado.setBase(base1);
                System.out.println("Indique la altura del cuadrado");
                int altura1= scn.nextInt();
                cuadrado.setAltura(altura1);
                System.out.println("que operacion quiere realizar: \n1->Area \n2->Perimetro");
                int operacion1= scn.nextInt();
                switch (operacion1){
                    case 1:
                        double areaCuadrado=cuadrado.calcularArea();
                        System.out.println("El area del cuadrado es: "+areaCuadrado);
                        break;
                    case 2:
                        double perimetroCuadrado=cuadrado.calcularPerimetro();
                        System.out.printf("El perimetro del cuadrado es: %.2f",perimetroCuadrado);
                        break;
                }
        }
    }
}
