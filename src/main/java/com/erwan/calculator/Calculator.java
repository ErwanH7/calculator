package com.erwan.calculator;

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
     */
    public static int add(int opG, int opD) {
        return opG + opD;
    }

    /**
     * Calcule le quotient entier de deux entiers.
     *
     * @param opG dividende
     * @param opD diviseur
     * @return le quotient entier opG / opD
     */
    public static int divide(int opG, int opD) {
        return opG / opD;
    }
}