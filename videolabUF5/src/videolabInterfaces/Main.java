package videolabInterfaces;

public class Main {
    public static void main(String[] args) {
        //Polimorfismo llamando al mismo metodo sobre el mismo objeto tenemos resultados diferentes
        Asalariado asalariado=new Asalariado("Pepe","Arevalo","145236L",1,1250,14);
        asalariado.mostrarDatos();
        Autonomo autonomo=new Autonomo("Maria","Martin","1234A",2,1452,150);
        autonomo.mostrarDatos();
        Jefe jefe=new Jefe("Amanda","Gracia","14523L",5,4521,1);
        jefe.mostrarDatos();
        Responsable directivo=new Directivo("Nadia","Pedraza","2589M",21);
        System.out.println(jefe.emitirVoto());
        System.out.println(directivo.emitirVoto());

        /*Persona[] trabajadores=new Persona[]{asalariado,autonomo,jefe,directivo};
                for (int i=0;i<trabajadores.length;i++){
                    trabajadores[i].mostrarDatos();
                }*/


    }
}
