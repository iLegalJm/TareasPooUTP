/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MisClases;

import Tarea.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author CHATARA_II
 */
public class ejemplo {
    
    public void ordenar(){
        List<String> lista= new ArrayList<>();
        lista.add("Jose");
        lista.add("Cueva ");
        lista.add("Zevallos");
        
        /*Collections.sort(lista, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }            
        });*/
        
        Collections.sort(lista, (String p1, String p2)-> p1.compareTo(p2));
        lista.forEach((x)-> {
            System.out.println(x);
        });
        
    }
    
    public void calcular(){
        
        /*Operacion operacion=new Operacion() {
            @Override
            public double calcularPromedio(double n1, double n2) {
                return (n1+n2)/2;
            }           
        };
            
        System.out.println(operacion.calcularPromedio(2, 3));*/
        
        List<Integer> lista= new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        

//        lista.forEach((Integer x)->{
//            
//            System.out.println(Double.parseDouble(lista.toString()));
//        });
//      Operacion operacion= (lista, 3) -> 0;
        Promedio ope = (x, resultado) -> x/resultado;
        System.out.println(ope.calcularPromedio(2, 3));
    }
    
    
    public static void main(String[] args) {
        ejemplo objTarea= new ejemplo();
        objTarea.ordenar();    
        objTarea.calcular();
    }    
}

interface Promedio{
    double calcularPromedio(double lista, double resultado); 
}
