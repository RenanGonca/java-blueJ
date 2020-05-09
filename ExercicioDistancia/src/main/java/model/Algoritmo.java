package model;

import interfaces.IAlgoritmo;
/**
 * @author Renan Gonçalves
 * @version 1.0
 * @since 4/8/20 4:54 pm
 */
public class Algoritmo implements IAlgoritmo {

    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    /**
     *
     * @return O calculo da distância de dois pontos.
     */
    @Override
    public double calcularDistanciaDoisPontos() {
            return Math.sqrt(Math.pow((this.x2 - this.x1), 2) + Math.pow((this.y2 - this.y1), 2));
        }
    @Override
        public String toString() {
            return "Distancia Entre Dois Pontos Cartesianos: " +calcularDistanciaDoisPontos();
        }
    }

