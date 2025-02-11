import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        String nombre,apellido,dni;
        int edad,altura;
        double peso;
        Scanner scn= new Scanner(System.in);
        System.out.println("Introduzca su nombre");
        nombre=scn.next();
        System.out.println("Introduzca su apellido");
        apellido=scn.next();
        System.out.println("Introduzca su dni");
        dni=scn.next();
        System.out.println("Introduzca su edad");
        edad=scn.nextInt();
        System.out.println("Introduzca su altura");
        altura=scn.nextInt();
        System.out.println("Introduzca su peso");
        peso=scn.nextDouble();

        Persona persona1=new Persona(nombre,apellido,dni,edad,altura,peso);
        double p1=persona1.calcularIMC();
        System.out.println(p1);
        if(p1<18.5){
            System.out.println("Inferior a lo normal");
        } else if (p1>=18.5 && p1<= 24.9) {
            System.out.println("Normal");
        } else if (p1>=25.0 && p1<=29.9) {
            System.out.println("Peso superior al normal");
        } else if (p1>= 30) {
            System.out.println("Obesidad");
        }

        persona1.mostrarDatos();
    }
}
