 
package com.mycompany.poligono;
 
public abstract class Poligono {
    protected float lado1, lado2,lado3;
//    protected float area;

    public Poligono(float lado1, float lado2, float lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public Poligono(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
   
    public float getLado1() {
        return lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public float getLado3() {
        return lado3;
    }
    
    public abstract float hallarArea();
}
