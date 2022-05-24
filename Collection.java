package com.company;

import com.sun.jdi.DoubleValue;

import java.util.ArrayList;

public class Collection {
    public static void main(String[] args) {

        double média;
        ArrayList<Double> Preços = new ArrayList<>();

        Preços.add(13.00);
        Preços.add(14.50);
        Preços.add(12.75);
        Preços.add(11.00);
        Preços.add(15.75);
        Preços.add(16.00);
        Preços.add(16.25);
        Preços.add(11.50);
        Preços.add(9.75);
        Preços.add(9.00);
        Preços.add(10.75);
        Preços.add(11.00);

        System.out.println("Os preços foram: " + Preços);

        double soma = Preços.get(0) + (Preços.get(1) + Preços.get(2) + Preços.get(3) + Preços.get(4) + Preços.get(5) + Preços.get(6) + Preços.get(7) + Preços.get(8) + Preços.get(9) + Preços.get(10) + Preços.get(11));
        System.out.println("O preço total foi de: R$" + soma);
        média = soma / Preços.size();
        System.out.println("A média do preço no ano foi de: R$" + média);

    }
}
