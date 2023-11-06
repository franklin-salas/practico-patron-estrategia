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
public class Suma implements IAritmetica{

    @Override
    public int operacion(int a, int b) {
    return a+b;
    }

    @Override
    public String mostrar() {
    return "A + B";
    }
    
}
