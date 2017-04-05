/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import factorial.FactorialN;
import productoria.ProductoriaN;
import sumatoria.SumatoriaN;

/**
 *
 * @author Alumno
 */
public class Principal {
    public static void main (String[]arg){
        mostrarFactorial();
        mostrarSumatoria();
        mostrarProductoria();
    }
    public static void mostrarFactorial (){
        FactorialN fac=new FactorialN ();
        fac.asignarValor(5);
        int res=fac.obtenerFactorial();
        System.out.println("El factorial es: " + res);
    }
    public static void mostrarSumatoria (){
        SumatoriaN sum=new SumatoriaN ();
        sum.asignarValor(5);
        int res=sum.obtenerSumatoria();
        System.out.println("La sumatoria es: " + res);
    }
    public static void mostrarProductoria (){
        ProductoriaN prod=new ProductoriaN ();
        prod.asignarValor(5);
        int res=prod.obtenerProductoria();
        System.out.println("La productoria es: " + res);
    }
}
