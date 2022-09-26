
package com.mycompany.poligono;

public class Rectangulo extends Poligono {
    private float area;
    public Rectangulo(float lado1, float lado2) {
        super(lado1, lado2);
    }
    
    @Override
    public float hallarArea(){
        area = lado2*lado3;
        return area;
    }
}