package Alumnos;
/*
* Crear un programa que permita crear alumno y modificar sus notas. Para ello se pide:
 >>  Crear una clase Alumno con las siguientes características:
 •  Nombre, apellido, teléfono, correo (opcional, algunos alumnos no tendrán
correo definido), nota1, nota2, nota3
 •  Dos constructores:
 ◦ Uno de ellos con el nombre, apellido y teléfono
 ◦ Otro con el nombre, apellido, teléfono y correo
 •  Un método mostrar datos, que mostrará por consola los datos del alumno.
 •  Un método calificarNotas, que podrá un numero aleatorio entre 0 y 10 en
cada una de las notas del alumno.
 •  Un método calcularMedia, que retorne la media obtenida de las tres
asignaturas.
 •  Métodos getter y setter�
 >>  Crear una clase Main con un método main que realice las siguientes ejecuciones:
 •  Crear un alumno sin correo, con los datos metidos a mano.
 •  Calificar de forma aleatoria las notas del alumno.
 •  Mostrar los datos del alumno.
 •  Crear un alumno con correo con los datos metidos a mano.
 •  Calificar las notas individualmente del alumno con el método set.
 •  Mostrar los datos del alumno*/

public class Entrada {
    public static void main(String[] args) {
        Alumno alumno1=new Alumno("Carlos","Teran",874521963);
        alumno1.calificarNotas();
        alumno1.mostrarDatos();
        Alumno alumno2=new Alumno("Andres","Arias",789456123,"Aa@gmail.com");
        alumno2.calificarNotas();
        alumno2.mostrarDatos();
        System.out.println("La media de las notas del alumno "+ alumno2.getNombre()+" es "+alumno2.calcularMedia());
    }
}
