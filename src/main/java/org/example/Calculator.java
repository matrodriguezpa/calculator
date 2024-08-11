package org.example;

public class Calculator {

    public static void main(String[]args) {

        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        CalculatorController controller = new CalculatorController(view, model);

        controller.start(true);
    }

}
