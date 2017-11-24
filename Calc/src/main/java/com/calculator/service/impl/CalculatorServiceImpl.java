package com.calculator.service.impl;

import com.calculator.service.CalculatorService;
import com.calculator.util.OverFlowException;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    @Cacheable("add")
    public Double add(String arg1, String arg2, String arg3) {
        Double result;
        try {
            result = Double.parseDouble(arg1) + Double.parseDouble(arg2) + Double.parseDouble(arg3);
            if (result.compareTo(Double.NEGATIVE_INFINITY) == 0 || result.compareTo(Double.POSITIVE_INFINITY) == 0) {
                throw new OverFlowException("Response value exceeds the limit");
            }
        } catch (NumberFormatException e) {
            throw new com.calculator.util.NumberFormatException("Please enter only numeric values.");
        }
        return result;
    }

    @Override
    @Cacheable("sub")
    public Double subtract(String arg1, String arg2, String arg3) {
        Double result;
        try {
            result = Double.parseDouble(arg1) - Double.parseDouble(arg2) - Double.parseDouble(arg3);
            if (result.compareTo(Double.NEGATIVE_INFINITY) == 0 || result.compareTo(Double.POSITIVE_INFINITY) == 0) {
                throw new OverFlowException("Response value exceeds the limit");
            }
        } catch (NumberFormatException e) {
            throw new com.calculator.util.NumberFormatException("Please enter only numeric values.");
        }
        return result;
    }

    @Override
    @Cacheable("multi")
    public Double multiply(String arg1, String arg2, String arg3) {
        Double result;
        try {
            result = Double.parseDouble(arg1) * Double.parseDouble(arg2) * Double.parseDouble(arg3);
            if (result.compareTo(Double.NEGATIVE_INFINITY) == 0 || result.compareTo(Double.POSITIVE_INFINITY) == 0) {
                throw new OverFlowException("Response value exceeds the limit");
            }
        } catch (NumberFormatException e) {
            throw new com.calculator.util.NumberFormatException("Please enter only numeric values.");
        }
        return result;
    }

    @Override
    @Cacheable("div")
    public Double divide(String arg1, String arg2) {
        Double result;
        try {
            if (Double.parseDouble(arg2) == 0) {
                throw new com.calculator.util.ArithmeticException("A number can not be divided by 0.");
            }
            result = Double.parseDouble(arg1) / Double.parseDouble(arg2);
            if (result.compareTo(Double.NEGATIVE_INFINITY) == 0 || result.compareTo(Double.POSITIVE_INFINITY) == 0) {
                throw new OverFlowException("Response value exceeds the limit");
            }
        } catch (NumberFormatException e) {
            throw new com.calculator.util.NumberFormatException("Please enter only numeric values.");
        }

        return result;
    }

}
