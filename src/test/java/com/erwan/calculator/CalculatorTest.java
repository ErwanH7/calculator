package com.erwan.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {

    @Test
    void add_devrait_calculer_la_somme_de_deux_int() {
        // GIVEN
        Calculator calculator = new Calculator();
        int opG = 1;
        int opD = 2;

        // WHEN
        int somme = calculator.add(opG, opD);

        // THEN
        assertThat(somme).isEqualTo(3);
    }
}