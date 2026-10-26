package com.apisec.apiseclab.validation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class DNIValidationTest
{
    private final DNIValidator validator = new DNIValidator();

    @Test
    void aceptaDNIValido()
    {
        assertTrue(validator.isValid("12345678Z", null));
    }

    @Test
    void aceptaDNIValidoEnMinuscula()
    {
        assertTrue(validator.isValid("12345678z", null));
    }

    @Test
    void rechazaLetraIncorrecta()
    {
        assertFalse(validator.isValid("12345678A", null));
    }

    @Test
    void rechazaPocosDigitos()
    {
        assertFalse(validator.isValid("1234567Z", null));
    }

    @Test
    void rechazaDemasiadosDigitos()
    {
        assertFalse(validator.isValid("123456789Z", null));
    }

    @Test
    void rechazaSinLetra()
    {
        assertFalse(validator.isValid("12345678", null));
    }

    @Test
    void rechazaLetrasEnLugarDeNumeros()
    {
        assertFalse(validator.isValid("ABCDEFGHZ", null));
    }

    @Test
    void rechazaCadenaVacia()
    {
        assertFalse(validator.isValid("", null));
    }

    @Test
    void nullSeDejaPasar()
    {
        assertTrue(validator.isValid(null, null));
    }

}
