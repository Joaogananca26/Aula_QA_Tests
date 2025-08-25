package org.example;

public class Apdex {

    double satisfatorio;
    double toleravel;
    double totalAmostras;
    double falhas;

    public double apdex(double satisfatorio, double toleravel, double totalAmostras) {
        return (satisfatorio + (toleravel / 2)) / totalAmostras;
    }

}
