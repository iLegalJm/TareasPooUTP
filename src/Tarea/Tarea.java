/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

/**
 *
 * @author CHATARA_II
 */
public class Tarea {
    
    static private void calcularPromedio(int lista[]) {
        
        Promedio objPromedio = (int[] numero) -> {
            numero = lista;
            int suma = Arrays.stream(numero).sum(); //Stream recorre una secuencia, y el sum lo suma
            double promedio = suma / numero.length;
            System.out.println("La suma de numeros es: " + suma);
            return promedio;
        };
        System.out.println("El promedio es :" + objPromedio.calcularPromedio(lista));
    }
    
    static private void calcularFactorial(double numero) {
        Factorial objFactorial = (double num) -> {
            num = numero;
            double resultado = 1;
            if (num == 0) {
                resultado = 1;
            } else {
                while (num != 0) {
                    resultado = resultado * num;
                    num--;
                }
            }
            return resultado;
        };
        
        System.out.print("El factorial del numero " + numero + " es: ");
        System.out.println(objFactorial.calcularFactorial(5));
    }
    
    static private void conocerSiEsPar(int numero) {
        Pares objPares = (int numeros) -> {
            String resultado;
            numeros = numero;
            if (numeros % 2 == 0) {
                resultado = "es par";
            } else {
                resultado = "es impar";
            }
            return "El numero: " +numero + " " + resultado;
        };
        
        System.out.println(objPares.conocerSiEsPar(numero));
        
    }
    
    static private void calcularNumeroMayor(int lista[]) {
        NumeroMayor objNumeroMayor = (int numero[]) -> {
            numero = lista;
            int mayor = numero[0];
            for (int i = 0; i < numero.length; i++) {
                if (numero[i] > mayor) {
                    mayor = numero[i];
                }
            }
            return "El numero mayor del arreglo es: " + mayor;
        };
        
        System.out.println(objNumeroMayor.calcularNumeroMayor(lista));
    }
    
    static private void calcularNumeroMenor(int lista[]) {
        NumeroMenor objNumeroMenor = (int numero[]) -> {
            numero = lista;
            int menor = numero[0];
            for (int i = 0; i < numero.length; i++) {
                if (numero[i] < menor) {
                    menor = numero[i];
                }
            }
            return "El numero menor del arreglo es: " + menor;
        };
        
        System.out.println(objNumeroMenor.calcularNumeroMenor(lista));
    }
    
    static private void calcularNumeroRepetido(int lista[]) {
        NumeroRepite objNumeroRepite = (int numero[]) -> {
            numero = lista;
            int repetidor = 0;
            int repite = 0;
            int mayor = 0;
            int auxiliar = numero[0]; //primer valor del arreglo
            Arrays.sort(numero); //Orden de mi arreglo de numeros

            for (int i = 0; i < numero.length; i++) {
                if (auxiliar == numero[i]) {
                    repetidor++; //aumenta el repetidor en 1 si al recorrer el array, la posicion al 
                    //recorrer el array coincide con mi auxiliar 
                    if (repetidor > repite) {
                        repite = repetidor;
                        mayor = numero[i];
                    }
                } else { //si no se repiten el auxiliar cambia al numero con el que no coincidio para
                    //seguir recorriendo y buscando repeticiones
                    auxiliar = numero[i];
                    repetidor = 1;
                }                
            }            
            return "El numero " + mayor + " se repite " + repite + " veces " + "\ny es el que mas se repite del arreglo";
        };
        
        System.out.println(objNumeroRepite.CalcularNumeroRepetido(lista));
    }
    
    static private void calcularMayorDeTresNumeros(int a, int b, int c) {
        NumeroMayorDeTresNumeros objMayorDe3 = (var x, var y, var z) -> {
            
            int mayor = 0;
            
            if (x >= y && x >= z) mayor=x;
            else if (y >= x && y >= z) mayor=y; 
            else if (z >= y && z >= x) mayor=z;
                                    
            return "El numero mayor de tres numero es " + mayor;
        };
        
        System.out.println(objMayorDe3.CalcularNumeroMayor(a, b, c));
    }
    
    static private void calcularMultiplicacion(int numero, String texto){
        MultiplicarDosParametros objMultiplicar = (int num, String txt)-> {
            num=numero;
            txt=texto;
            return "Multiplicacion: " + num+ "*" +txt;
        };
        
        System.out.println(objMultiplicar.CalcularMultiplicacion(numero, texto));
    }
    public static void main(String[] args) {
        int numeros[] = new int[]{45, 45, 58, 49, 64, 54, 58, 45};
        
        System.out.println("***Ejercicio 1***");
        calcularPromedio(numeros);
        System.out.print("\n");
        
        System.out.println("***Ejercicio 2***");
        calcularFactorial(1);
        System.out.print("\n");
        
        System.out.println("***Ejercicio 3***");
        conocerSiEsPar(7);
        System.out.println("\n");
        
        System.out.println("***Ejercicio 4***");
        
        calcularNumeroMayor(numeros);
        System.out.println("\n");
        
        System.out.println("***Ejercicio 5***");
        calcularNumeroMenor(numeros);
        System.out.println("\n");
        
        System.out.println("***Ejercicio 5***");
        calcularNumeroRepetido(numeros);
        System.out.println("\n");
        
        System.out.println("***Ejercicio 6***");
        calcularMayorDeTresNumeros(1, 2, 5);
        System.out.println("\n");
        
        System.out.println("***Ejercicio 7***");
        calcularMultiplicacion(5, "textos");
        System.out.println("\n");
    }
}

interface Promedio {
    
    public double calcularPromedio(int[] lista);
}

interface Factorial {
    
    public double calcularFactorial(double numero);
}

interface Pares {
    
    public String conocerSiEsPar(int num);
}

interface NumeroMayor {
    
    public String calcularNumeroMayor(int arreglo[]);
}

interface NumeroMenor {
    
    public String calcularNumeroMenor(int arreglo[]);
}

interface NumeroRepite {
    
    public String CalcularNumeroRepetido(int arreglo[]);
}

interface NumeroMayorDeTresNumeros {
    
    public String CalcularNumeroMayor(int a, int b, int c);
}

interface MultiplicarDosParametros{
    public String CalcularMultiplicacion(int numero, String texto);
}