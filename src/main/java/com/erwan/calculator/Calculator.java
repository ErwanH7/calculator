package com.erwan.calculator;
import java.util.HashSet;
import java.util.Set;

/**
 * Calculatrice proposant quelques opérations de base sur les entiers.
 */
public final class Calculator {

    private Calculator() {
        // Classe utilitaire : pas d'instanciation
    }

    /**
     * Calcule la somme de deux entiers.
     *
     * @param opG opérande gauche
     * @param opD opérande droite
     * @return la somme opG + opD
     * @throws ArithmeticException si la somme dépasse la capacité d'un int
     */
    public static int add(int opG, int opD) {
        return Math.addExact(opG, opD);
    }

    /**
     * Calcule le quotient entier de deux entiers.
     *
     * @param opG dividende
     * @param opD diviseur
     * @return le quotient entier opG / opD
     * @throws ArithmeticException si opD vaut 0, ou si le résultat dépasse la capacité d'un int
     */
    public static int divide(int opG, int opD) {
        if (opD == 0) {
            throw new ArithmeticException("Division par zéro impossible");
        }
        if (opG == Integer.MIN_VALUE && opD == -1) {
            throw new ArithmeticException("Le quotient dépasse la capacité d'un int");
        }
        return opG / opD;
    }

    /**
     * Retourne l'ensemble des chiffres qui composent un nombre.
     *
     * @param pNombre le nombre à décomposer (le signe est ignoré)
     * @return l'ensemble non ordonné des chiffres de pNombre
     */
    public static Set<Integer> ensembleChiffres(int pNombre) {
        Set<Integer> chiffres = new HashSet<>();
        long reste = Math.abs((long) pNombre);
        do {
            chiffres.add((int) (reste % 10));
            reste = reste / 10;
        } while (reste > 0);
        return chiffres;
    }
}