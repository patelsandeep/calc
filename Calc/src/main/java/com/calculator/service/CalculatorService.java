package com.calculator.service;

import lombok.NonNull;

public interface CalculatorService {

    /**
     * Calculate the sum of three numbers.
     *
     * @param arg1 is the first parameter.
     * @param arg2 is the second parameter.
     * @param arg3 is the third parameter.
     * @return result.
     * @throws NumberFormatException if @param valuses are not numeric.
     */
    Double add(@NonNull final String arg1, @NonNull final String arg2, @NonNull final String arg3);

    /**
     * Calculate the subtraction of three numbers.
     *
     * @param arg1 is the first parameter.
     * @param arg2 is the second parameter.
     * @param arg3 is the third parameter.
     * @return result.
     * @throws NumberFormatException if @param values are not numeric
     */
    Double subtract(@NonNull final String arg1, @NonNull final String arg2, @NonNull final String arg3);

    /**
     * Calculate the multiplication of three numbers.
     *
     * @param arg1 is the first parameter.
     * @param arg2 is the second parameter.
     * @param arg3 is the third parameter.
     * @return result.
     * @throws NumberFormatException if @param values are not numeric.
     */
    Double multiply(@NonNull final String arg1, @NonNull final String arg2, @NonNull final String arg3);

    /**
     * Calculate division of two numbers.
     *
     * @param arg1 is the first parameter.
     * @param arg2 is the second parameter.
     * @return result.
     * @throws NumberFormatException if @param values are not numeric.
     */
    Double divide(@NonNull final String arg1, @NonNull final String arg2);

}
