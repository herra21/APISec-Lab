package com.apisec.apiseclab.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class DNIValidator implements ConstraintValidator<ValidDNI, String> {

    private static final String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";

    @Override
    public boolean isValid(String dni, ConstraintValidatorContext context) {
        if (dni == null) return true; // la obligatoriedad se controla con @NotBlank
        if (!dni.matches("^\\d{8}[A-Za-z]$")) return false;

        int numero = Integer.parseInt(dni.substring(0, 8));
        char letra = Character.toUpperCase(dni.charAt(8));
        return LETRAS.charAt(numero % 23) == letra;
    }
}