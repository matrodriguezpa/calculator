package org.example;

import org.nfunk.jep.ParseException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController implements ActionListener {

        private final CalculatorView view;
        private final CalculatorModel model;

        public CalculatorController(CalculatorView view, CalculatorModel model) {
                this.view = view;
                this.model = model;
                initializeListeners();
        }

        public void start(boolean isVisible) {
                view.setVisible(isVisible);
        }

        private void initializeListeners() {
                // Trigonometric functions
                view.getSinButton().addActionListener(e -> appendText("sin("));
                view.getCosButton().addActionListener(e -> appendText("cos("));
                view.getTanButton().addActionListener(e -> appendText("tan("));
                view.getSecButton().addActionListener(e -> appendText("sec("));
                view.getCscButton().addActionListener(e -> appendText("csc("));
                view.getCotButton().addActionListener(e -> appendText("cot("));

                // Numeric values
                view.getNum0Button().addActionListener(e -> appendText("0"));
                view.getNum1Button().addActionListener(e -> appendText("1"));
                view.getNum2Button().addActionListener(e -> appendText("2"));
                view.getNum3Button().addActionListener(e -> appendText("3"));
                view.getNum4Button().addActionListener(e -> appendText("4"));
                view.getNum5Button().addActionListener(e -> appendText("5"));
                view.getNum6Button().addActionListener(e -> appendText("6"));
                view.getNum7Button().addActionListener(e -> appendText("7"));
                view.getNum8Button().addActionListener(e -> appendText("8"));
                view.getNum9Button().addActionListener(e -> appendText("9"));
                view.getEulerButton().addActionListener(e -> appendText("e"));
                view.getPiButton().addActionListener(e -> appendText("π"));

                // Arithmetic operators
                view.getPlusButton().addActionListener(e -> appendText("+"));
                view.getMinusButton().addActionListener(e -> appendText("-"));
                view.getMultiplyButton().addActionListener(e -> appendText("*"));
                view.getDivisionButton().addActionListener(e -> appendText("÷"));
                view.getPowerButton().addActionListener(e -> appendText("^("));
                view.getRootButton().addActionListener(e -> appendText("√("));
                view.getLeftParenthesisButton().addActionListener(e -> appendText("("));
                view.getCommaButton().addActionListener(e -> appendText("."));
                view.getRightParenthesisButton().addActionListener(e -> appendText(")"));

                // Action buttons
                view.getDeleteButton().addActionListener(this::handleDeleteAction);
                view.getCopyButton().addActionListener(e -> view.getResultTextField().copy());
                view.getClearButton().addActionListener(e -> view.getInputTextField().setText(""));
                view.getAnsButton().addActionListener(e -> appendText(view.getResultTextField().getText()));

                // Result button
                view.getResultTextField().addActionListener(this);
        }

        private void appendText(String text) {
                view.getInputTextField().setText(view.getInputTextField().getText() + text);
        }

        private void handleDeleteAction(ActionEvent e) {
                view.getInputTextField().requestFocus();
                int caretPosition = view.getInputTextField().getCaretPosition();
                if (caretPosition >= 3) {
                        String lastThreeChars = view.getInputTextField().getText().substring(caretPosition - 3, caretPosition);
                        if (isTrigFunction(lastThreeChars)) {
                                removeLastCharacters();
                        } else {
                                removeLastCharacter();
                        }
                } else if (caretPosition >= 1) {
                        removeLastCharacter();
                }
        }

        private boolean isTrigFunction(String text) {
                return text.equals("sin") || text.equals("cos") || text.equals("tan") ||
                        text.equals("sec") || text.equals("csc") || text.equals("cot");
        }

        private void removeLastCharacters() {
                String text = view.getInputTextField().getText();
                view.getInputTextField().setText(text.substring(0, text.length() - 3));
        }

        private void removeLastCharacter() {
                String text = view.getInputTextField().getText();
                view.getInputTextField().setText(text.substring(0, text.length() - 1));
        }

        @Override
        public void actionPerformed(ActionEvent evt) {
                model.setExpression(view.getInputTextField().getText());
                try {
                        model.evaluateExpression();
                        double result = model.getResult();
                        view.getResultTextField().setText(String.valueOf(result));
                        System.out.println("New calculation: " + result);
                } catch (ParseException e) {
                        view.getResultTextField().setText("Syntax Error");
                        System.err.println("Error parsing expression: " + e.getMessage());
                }
        }
}
