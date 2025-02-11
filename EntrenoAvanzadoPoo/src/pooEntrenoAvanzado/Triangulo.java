package pooEntrenoAvanzado;

public class Triangulo {
    /*a.	Desarrollar una clase Triangulo que:
•	Tenga un constructor vacío y un constructor con base y altura
•	Tenga dos atributos tipo int, base y altura
•	Tenga un método que calcule su área (A=(b*al)/2)
*/
    private int base,altura;
    public Triangulo(){
    }
    public Triangulo(int base,int altura){
        this.base=base;
        this.altura=altura;
    }
    public double calcularArea(){
        double area;
        area=(base*altura)/2;;
        return area;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "base=" + base +
                ", altura=" + altura +
                ", area Triangulo: "+calcularArea();
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
