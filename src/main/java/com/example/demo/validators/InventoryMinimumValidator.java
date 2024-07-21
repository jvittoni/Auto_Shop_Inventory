package com.example.demo.validators;

import com.example.demo.domain.Part;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;



public class InventoryMinimumValidator implements ConstraintValidator<ValidInventoryMinimum, Part> {
    @Autowired
    private ApplicationContext applicationContext;
    public static ApplicationContext myContext;

    @Override
    public void initialize(ValidInventoryMinimum constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Part part, ConstraintValidatorContext constraintValidatorContext) {
        return part.getInv() > part.getMinInv();
    }
}