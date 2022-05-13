package com.company;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;

public class Arrays {
    public static void main(String[] args) {
        //Fazendo a declaração de um Array com 10 elementos
        int [] a;
        a = new int[9];
        //inicializar os valores de um Array
        int[] Array = {1,2,3,4,5,6,7,8,9,10};
        //Exibir o elemento na posição 2, sendo o "3"
        System.out.println(Array[2]);
        //Alterando valores de um elemento
        Array [2] = 7;
        System.out.println(Array[2]);
        //Apagando elementos de um Array
        List<Integer> Array = new ArrayList<>();
        Array.remove((Object)1);
    }
}