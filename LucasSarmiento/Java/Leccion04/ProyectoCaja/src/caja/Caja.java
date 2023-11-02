/*
Proyecto caja: 
Ejercicio 1: crear un proyecto segun las especificaciones mostradas a continuacion.
La formula es: volumen = ancho * alto * profundidad
*/
package caja;

public class Caja { //Clase publica caja
    //Atributos (caracteristicas)
    int ancho;
    int alto;
    int profundo;
    //Metodos y constructores (acciones)
    public Caja(){ //Constructor 1 = vacio
    }
    //Constructor con parametros
    public Caja(int ancho, int alto, int profundo){ //Constructor 2
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    
    public int calcularVolumen() { //Metodo para calcular
        return ancho * alto * profundo;
    }
    
}
