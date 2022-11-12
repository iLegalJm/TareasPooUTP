/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MisClases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CHATARA_II
 */
public class Clase13 {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        numeros.forEach((x) -> { //Manera de recorrer un array
            System.out.println(x);
        });

        List<String> cadena = new ArrayList<>();
        cadena.add("juan");
        cadena.add("asas");
        cadena.add("Rosa");

        cadena.forEach((x) -> { //Manera de recorrer un array
            System.out.println(x);
        });

        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }

        ModificarCadena mensaje = (t) -> "¿" + t + "?";
        Visualizar("Cual es tu nombre", mensaje);
        System.out.println();
        Visualizar("David", mensaje);
        System.out.println();
    }

    public static void Visualizar(String texto, ModificarCadena formato) {
        String resultado = formato.ejecutar(texto);
        System.out.println(resultado);
    }
}

interface ModificarCadena {
    public String ejecutar(String text);
}
