package view;

import model.Algoritmo;

/**
 * @author Renan Gonçalves
 * @version 1.0
 * @since 4/8/20 4:54 pm
 */
public class Principal {
    public static void main(String[] args) {
        System.out.println("Welcome to the System");

        Algoritmo algoritmo = new Algoritmo();

        algoritmo.setX1(-3);
        algoritmo.setX2(2);
        algoritmo.setY1(-11);
        algoritmo.setY2(1);
        System.out.println(algoritmo.toString());

    }
}
