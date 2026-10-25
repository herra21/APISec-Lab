package com.apisec.apiseclab.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = DNIValidator.class)

public @interface ValidDNI
{
    String message() default "DNI no válido";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
