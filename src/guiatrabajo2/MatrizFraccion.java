/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package guiatrabajo2;

/**
 *
 * @author FERNEY JARAMILLO
 */
public class MatrizFraccion {

    private Fraccionario mFraccion[][];
    
    public MatrizFraccion() {
    }
    
    
    
    
    public boolean equals (Object obj ){
    
    
    MatrizFraccion m = (MatrizFraccion)obj ;
    
    if (this.mFraccion.length!=m.mFraccion.length){
    
    return false ;
    
    
    }
    for (int i =0;i<this.mFraccion.length;i++){
    
    if(this.mFraccion[i].length!=m.mFraccion[i].length){
   
        return false;
    }
    for ( int j = 0 ;j<this.mFraccion[i].length; j++){
    
    if (!this.mFraccion.equals(m.mFraccion)){
    
    return false ;
    
    
    }
    
    }
    
    }
    return true ;
    }
    
    
    
   
    
    public int compareTO (Object obj ){
      
        MatrizFraccion m = (MatrizFraccion)obj ;
        
      
        if ( this.mFraccion.length==m.mFraccion.length){
        
                  int cont =0;
            for (int i =0;i<this.mFraccion.length;i++){
    
             if(this.mFraccion[i].length==m.mFraccion[i].length) {
                 
                 cont ++;
             }
            
             int c= m.mFraccion.length;
             if ( cont ==this.mFraccion.length){
                    float suma1 = 0;
                     float suma2=0;
             
                     for (int i=0;i<this.mFraccion.length;i++) {
          
                    for (int j=0;j<this.mFraccion[i].length; j++) {
               
                  suma1+=this.mFraccion[i][j].getNumerador()/this.mFraccion[i][j].getDenominador();
                  suma2+=m.mFraccion[i][j].getNumerador()/m.mFraccion[i][j].getDenominador();
            
            
            }
              if (suma1>suma2)  {
                  
                  return 1;
                  
              }
                if(suma1<suma2) {
                return -1;
                
                }    
                     }
           return 0;
            }
        
        
        }
        
            }
     
       if ( this.mFraccion.length>m.mFraccion.length){
       return 1;
       }
        return -1;
        }

    }
    
    
    
    
    
    
   