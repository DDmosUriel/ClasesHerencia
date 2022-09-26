  
package com.mycompany.poligono;
 
public class Triangulo extends Poligono {
    private float area;
    public Triangulo(float lado1, float lado2, float lado3) {
        super(lado1, lado2, lado3);
    }
     
    
    @Override
    public float hallarArea(){
        
        float semiperiodo = (float)(lado1+ lado2+ lado3)/2;
        float area = (float)Math.sqrt(semiperiodo*((lado1-semiperiodo)*(lado2-semiperiodo)*(lado3-semiperiodo)));
        return area;        
    }
}

