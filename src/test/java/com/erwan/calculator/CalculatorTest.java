package com.erwan.calculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
        calculator = null;
    }

    @Test
    void add_devrait_calculer_la_somme_de_deux_int() {
        // GIVEN
        int opG = 1;
        int opD = 2;

        // WHEN
        int somme = calculator.add(opG, opD);

        // THEN
        assertThat(somme).isEqualTo(3);
    }

    @Test
    void divide_devrait_calculer_le_quotient_entier_de_deux_int() {
        // GIVEN
        int opG = 7;
        int opD = 2;

        // WHEN
        int quotient = calculator.divide(opG, opD);

        // THEN
        assertThat(quotient).isEqualTo(3);
    }
}