package pooEntrenoAvanzado;
/*c.	Desarrollar una clase Cuadrado
•	Tenga un constructor vacío y un constructor con base y altura
•	Tenga dos atributos int base y altura
•	Tenga dos atributos de tipo double área y perímetro
•	Tenga un método que calcule su área (A=b*a)
•	Tenga un método que calcule su perímetro (2a+2b)
*/
public class Cuadrado extends Triangulo{
    private double area,perimetro;
    public Cuadrado(int base,int altura){
        super(base, altura);
    }

    public double calcularArea(){
        area=getBase()*getAltura();
        return area;
    }
    public double calcularPerimetro(){
       perimetro=(2*getAltura()+2*getBase());
        return perimetro;
    }
    public String toString(){
        return "El area del cuadrado es: "+area+", el perimetro del cuadrado es: "+perimetro;
    }
}
