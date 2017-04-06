/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productoria;


/**
 *
 * @author Alumno
 */
public class ProductoriaN {
    private int n; //la variable es un atributo ->propiedad

    public ProductoriaN() {
    }

    public ProductoriaN(int n) {
        this.n = n;
    }
    
    public void asignarValor (int num){
        n=num;
    }
    
    public int obtenerProductoria (){
        int valorProductoria=1;
        int aux=n;
        for (int i = 1; i <= aux; i++) {
            valorProductoria=valorProductoria*i;
            n=n-1;
        }
        n=aux;
        return valorProductoria ;
    }
}
