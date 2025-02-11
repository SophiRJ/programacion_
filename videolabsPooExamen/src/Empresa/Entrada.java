package Empresa;

public class Entrada {
    public static void main(String[] args) {

        Persona asalariado=new Asalariado("Jorge","Alonso","12345678L",1,1000,14);
        Persona autonomo=new Autonomo("Sara","Borja","45217895K",2,1500,200);
        Persona jefe=new Jefe("Sergio","Rojas","741258963F",3,2000,1);
        Persona directivo=new Directivo("Vanesa","Mendieta","74158963Y",5);
        //System.out.println(jefe.emitirVoto());
        //System.out.println(directivo.emitirVoto());
        //asalariado.mostrarDatos();
        //autonomo.mostrarDatos();
        //jefe.mostrarDatos();
        //directivo.mostrarDatos();
        Persona[] peronas={asalariado,autonomo,jefe,directivo};
        for (Persona item:peronas) {
            item.mostrarDatos();
        }

    }
}
