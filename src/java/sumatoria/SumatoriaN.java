/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumatoria;


/**
 *
 * @author Alumno
 */
public class SumatoriaN {
    private int n; //la variable es un atributo ->propiedad

    public SumatoriaN() {
    }

    public SumatoriaN(int n) {
        this.n = n;
    }
    
    public void asignarValor (int num){
        n=num;
    }
    public int obtenerSumatoria (){
        int valorSumatoria=0;
        for (int i = 1; i <= n; i++) {
            valorSumatoria=valorSumatoria+2*i-4;
        }
        return valorSumatoria;
    }
}
