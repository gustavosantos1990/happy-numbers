/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dojo.happynumbers;

import java.util.ArrayList;

/**
 *
 * @author GustavoSantos
 */
public class HappyNumbersTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HappyNumbers hn = new HappyNumbers();
        System.out.println("Resultado do numero 301 =>> " + hn.consultaNumero(301));

        ArrayList<Integer> numerosFelizesAte500 = new ArrayList<Integer>();

        for (int i = 1; i <= 500; i++) {
            if (hn.consultaNumero(i) == "feliz") {
                numerosFelizesAte500.add(i);
            }
        }

        System.out.println("Numeros felizes até 500!!!");
        System.out.println(numerosFelizesAte500);
    }

}
