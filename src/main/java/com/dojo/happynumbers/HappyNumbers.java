/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dojo.happynumbers;

import java.util.ArrayList;

/**
 * @author GustavoSantos
 * Desenvolvido em 24/03/2017
 */
public class HappyNumbers {

    public String consultaNumero(int numero) {

        ArrayList<Integer> resultados = new ArrayList<Integer>();

        int ultimoResultado;
        int resultadoParcial = 0;
        int quantidadeDigitos;

        ultimoResultado = numero;

        for (;;) {

            String stringNumero = Integer.toString(ultimoResultado);
            quantidadeDigitos = stringNumero.length();

            for (int i = 0, j = 1; i < quantidadeDigitos; i++, j++) {
                String digitoString = stringNumero.substring(i, j);
                int digito = Integer.parseInt(digitoString);
                int quadrado = digito * digito;
                resultadoParcial = resultadoParcial + quadrado;

            }
            ultimoResultado = resultadoParcial;
            resultadoParcial = 0;
            if (ultimoResultado == 1) {

                return "feliz";
            } else {

                if (resultados.contains(ultimoResultado)) {
                    return "triste";
                } else {
                    resultados.add(ultimoResultado);
                }

            }
        }

    }
}
