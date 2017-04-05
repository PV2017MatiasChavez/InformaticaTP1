/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import factorial.FactorialN;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import productoria.ProductoriaN;

/**
 *
 * @author Alumno
 */
@ManagedBean
@RequestScoped
public class ProductoriaFormBean {
private int n,s;
    /**
     * Creates a new instance of ProductoriaFormBean
     */
    public ProductoriaFormBean() {
    }
    public int calcularProductoria(){
    ProductoriaN unaProductoria= new ProductoriaN();
    unaProductoria.asignarValor(getN());
    return unaProductoria.obtenerProductoria();
}

    /**
     * @return the n
     */
    public int getN() {
        return n;
    }

    /**
     * @param n the n to set
     */
    public void setN(int n) {
        this.n = n;
    }

}
