package org.example;

import org.nfunk.jep.JEP;
import org.nfunk.jep.ParseException;

public class CalculatorModel {

    private String expression;
    private double result;

    // Getters and Setters
    public void setExpression(String expression) {
        this.expression = expression;
    }

    public String getExpression() {
        return expression;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public double getResult() {
        return result;
    }

    // Method to evaluate the expression
    public void evaluateExpression() throws ParseException {
        // Instantiate JEP with standard functions, constants, Pi, and Euler
        JEP jep = new JEP();
        jep.addStandardFunctions();
        jep.addStandardConstants();
        jep.addVariable("π", Math.PI);
        jep.addVariable("e", Math.E);

        // Replace some symbols in the expression with others understood by JEP
        String modifiedExpression = expression.replace("√", "sqrt")
                .replace("÷", "/");

        // Parse the expression
        jep.parseExpression(modifiedExpression);

        // Check if there were any errors during parsing
        if (jep.hasError()) {
            throw new ParseException("Error parsing the expression: " + jep.getErrorInfo());
        }

        // Get the result of the evaluation
        double evaluationResult = jep.getValue();

        // Check if there were any errors during evaluation
        if (jep.hasError()) {
            throw new ParseException("Error evaluating the expression: " + jep.getErrorInfo());
        }

        // Assign and return the result if it's a valid value
        this.result = evaluationResult;
    }
}
