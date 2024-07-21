package com.example.demo.validators;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;



@Constraint(validatedBy = {InventoryMinimumValidator.class})
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidInventoryMinimum {
    String message () default "The part count falls below the set minimum inventory";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}