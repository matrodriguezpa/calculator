package Model;

import org.nfunk.jep.*;

public class Model {

    private String expression;
    private double result;

    // Setters and Getters
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

    // Method to convert Text to result
    public double evaluateExpression() throws ParseException {
        // New JEP, with all operations, trigonometric funtions, Pi and Euler
        JEP jep = new JEP();
        jep.addStandardFunctions();
        jep.addStandardConstants();
        jep.addVariable("π", Math.PI);
        jep.addVariable("e", Math.E);

        // Reeplace some expresion symbols to ones understood by JEP
        this.expression = this.expression.replaceAll("√", "sqrt");
        this.expression = this.expression.replaceAll("÷", "/");

        jep.parseExpression(this.expression);

        if (jep.hasError()) {
            throw new ParseException("Expression parsing error: " + jep.getErrorInfo());
        }

        Object result = jep.getValueAsObject();

        if (result instanceof Double) {
            this.result = jep.getValue();
            return this.result;
        } else {
            throw new ParseException("Error evaluating expression: Unexpected result type.");
        }
    }
}
