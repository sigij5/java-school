package com.lambdaschool.schools.services;

import com.lambdaschool.schools.models.ValidationError;

import javax.validation.Validation;
import java.util.List;

public interface HelperFunctions {
    List<ValidationError> getConstraintViolation(Throwable cause);
}
