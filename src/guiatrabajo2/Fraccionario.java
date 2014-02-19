/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package guiatrabajo2;

/**
 *
 * @author FERNEY JARAMILLO
 */
public class Fraccionario {
   
    private int numerador ;
    private int denominador ;

    public Fraccionario() {
    }

    public Fraccionario(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
    
    
    public int compareTo (Object obj){
    
    
    Fraccionario f = (Fraccionario) obj;
    
    double a = this.numerador/this.denominador;
    double b =f.numerador/f.denominador;
    
    if ( a>b){
        return 1;
    }
    
   if (a<b) {
   
   return -1;
   
   }
        return 0;
    }
   
    
    
    public boolean equals (Object obj){
    
     Fraccionario f = (Fraccionario) obj;
     
     if (this.getNumerador()!=f.getNumerador()||this.getNumerador()!=f.getDenominador()){
    
         return false ;
     
     }
        return true;
    
    }
    
    
    
    

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }
    
    
    
}
