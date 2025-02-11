package pooEntrenoAvanzado;
/*b.	Desarrollar una clase Círculo
•	Tenga un constructor vacío y un constructor con radio
•	Tenga tres atributos de tipo double radio, diámetro y área
•	Tenga un método donde se calcule el área (A=Pi*r2)
•	Tenga un método donde se calcule el diámetro (D = 2*r)
*/

public class Circulo extends Triangulo{
    private double radio, diametro, area;
    public Circulo(){
    }
    public Circulo(double radio){
        this.radio=radio;
    }
    public double calcularArea(){
        area=(Math.PI*Math.pow(radio,2));
        return area;
    }
    public double calcularDiametro(){
        diametro=2*radio;
        return diametro;
    }
    public String toString(){
        return"Circulo: Radio= "+radio+" Diametro= "+diametro+" Area calculada= "+area;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
}
