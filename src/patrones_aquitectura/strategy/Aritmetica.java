/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_aquitectura.strategy;

/**
 *
 * @author Franklin
 */
public class Aritmetica {
    private int elementoA;
    private int elementoB;
    private IAritmetica aritmetica;
    
    public Aritmetica() {
    }
    public Aritmetica(int elementoA, int elementoB) {
        this.elementoA = elementoA;
        this.elementoB = elementoB;
    }

    public int getElementoA() {
        return elementoA;
    }

    public void setElementoA(int elementoA) {
        this.elementoA = elementoA;
    }

    public int getElementoB() {
        return elementoB;
    }

    public void setElementoB(int elementoB) {
        this.elementoB = elementoB;
    }


    public void setOperacion(IAritmetica aritmetica) {
        this.aritmetica = aritmetica;
    }

    
    public String Resultado() {
        if (aritmetica == null) 
            return " ";
        
        return aritmetica.mostrar()+" = "+ aritmetica.operacion(this.elementoA, this.elementoB);
    }


    
}
