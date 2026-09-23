package com.erwan.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {

    @Test
    void add_devrait_calculer_la_somme_de_deux_int() {
        // GIVEN
        int opG = 1;
        int opD = 2;

        // WHEN
        int somme = Calculator.add(opG, opD);

        // THEN
        assertThat(somme).isEqualTo(3);
    }

    @Test
    void divide_devrait_calculer_le_quotient_entier_de_deux_int() {
        // GIVEN
        int opG = 7;
        int opD = 2;

        // WHEN
        int quotient = Calculator.divide(opG, opD);

        // THEN
        assertThat(quotient).isEqualTo(3);
    }
}