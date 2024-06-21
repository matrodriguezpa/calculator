package Controller;

import Model.Model;
import View.View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.nfunk.jep.ParseException;

public class Controller implements ActionListener {

        private View view;
        private final Model model;

        public Controller(View view, Model model) {
                this.view = view;
                this.model = model;
                this.view.SinButton.addActionListener(sinButtonActionListener);
                this.view.CosButton.addActionListener(cosButtonActionListener);
                this.view.TanButton.addActionListener(tanButtonActionListener);
                this.view.SecButton.addActionListener(secButtonActionListener);
                this.view.CscButton.addActionListener(cscButtonActionListener);
                this.view.CotButton.addActionListener(cotButtonActionListener);
                this.view.N0Button1.addActionListener(n0ButtonActionListener);
                this.view.N1Button.addActionListener(n1ButtonActionListener);
                this.view.N2Button.addActionListener(n2ButtonActionListener);
                this.view.N3Button.addActionListener(n3ButtonActionListener);
                this.view.N4Button.addActionListener(n4ButtonActionListener);
                this.view.N5Button.addActionListener(n5ButtonActionListener);
                this.view.N6Button.addActionListener(n6ButtonActionListener);
                this.view.N7Button.addActionListener(n7ButtonActionListener);
                this.view.N8Button.addActionListener(n8ButtonActionListener);
                this.view.N9Button.addActionListener(n9ButtonActionListener);
                this.view.EulerButton.addActionListener(eulerButtonActionListener);
                this.view.PiButton.addActionListener(PiButtonActionListener);
                this.view.PlusButton.addActionListener(plusButtonActionListener);
                this.view.MinusButton.addActionListener(minusButtonActionListener);
                this.view.ProductButton.addActionListener(productButtonActionListener);
                this.view.DivisionButton.addActionListener(divisionButtonActionListener);
                this.view.PowerButton.addActionListener(powerButtonActionListener);
                this.view.RootButton.addActionListener(rootButtonActionListener);
                this.view.LeftParentesisButton.addActionListener(leftParenthesisButtonActionListener);
                this.view.ComaButton.addActionListener(comaButtonActionListener);
                this.view.RigthParentesisButton.addActionListener(rightParenthesisButtonActionListener);
                this.view.DeleteButton.addActionListener(deleteButtonActionListener);
                this.view.CopyButton.addActionListener(copyButtonActionListener);
                this.view.EraseButton.addActionListener(eraseButtonActionListener);
                this.view.AnsButton.addActionListener(ansButtonActionListener);
                this.view.ResultButton.addActionListener(this);
        }

        public void start(boolean start) {
                view.setVisible(start);
        }

        // Trigonometric functions
        private final ActionListener sinButtonActionListener = e -> view.EditTextField
                        .setText(view.EditTextField.getText() + "sin(");
        private final ActionListener cosButtonActionListener = e -> view.EditTextField
                        .setText(view.EditTextField.getText() + "cos(");
        private final ActionListener tanButtonActionListener = e -> view.EditTextField
                        .setText(view.EditTextField.getText() + "tan(");
        private final ActionListener secButtonActionListener = e -> view.EditTextField
                        .setText(view.EditTextField.getText() + "sec(");
        private final ActionListener cscButtonActionListener = e -> view.EditTextField
                        .setText(view.EditTextField.getText() + "csc(");
        private final ActionListener cotButtonActionListener = e -> view.EditTextField
                        .setText(view.EditTextField.getText() + "cot(");

        // Numeric Values
        private final ActionListener n0ButtonActionListener = e -> view.EditTextField
                        .setText(view.EditTextField.getText() + "0");
        private final ActionListener n1ButtonActionListener = e -> view.EditTextField
                        .setText(view.EditTextField.getText() + "1");
        private final ActionListener n2ButtonActionListener = e -> view.EditTextField
                        .setText(view.EditTextField.getText() + "2");
        private final ActionListener n3ButtonActionListener = e -> view.EditTextField
                        .setText(view.EditTextField.getText() + "3");
        private final ActionListener n4ButtonActionListener = e -> view.EditTextField
                        .setText(view.EditTextField.getText() + "4");
        private final ActionListener n5ButtonActionListener = e -> view.EditTextField
                        .setText(view.EditTextField.getText() + "5");
        private final ActionListener n6ButtonActionListener = e -> view.EditTextField
                        .setText(view.EditTextField.getText() + "6");
        private final ActionListener n7ButtonActionListener = e -> view.EditTextField
                        .setText(view.EditTextField.getText() + "7");
        private final ActionListener n8ButtonActionListener = e -> view.EditTextField
                        .setText(view.EditTextField.getText() + "8");
        private final ActionListener n9ButtonActionListener = e -> view.EditTextField
                        .setText(view.EditTextField.getText() + "9");
        private final ActionListener eulerButtonActionListener = e -> view.EditTextField
                        .setText(view.EditTextField.getText() + "e");
        private final ActionListener PiButtonActionListener = e -> view.EditTextField
                        .setText(view.EditTextField.getText() + "π");

        // Arithmetic operators
        private ActionListener plusButtonActionListener = e -> view.EditTextField
                        .setText(view.EditTextField.getText() + "+");
        private ActionListener minusButtonActionListener = e -> view.EditTextField
                        .setText(view.EditTextField.getText() + "-");
        private ActionListener productButtonActionListener = e -> view.EditTextField
                        .setText(view.EditTextField.getText() + "*");
        private ActionListener divisionButtonActionListener = e -> view.EditTextField
                        .setText(view.EditTextField.getText() + "÷");
        private ActionListener powerButtonActionListener = e -> view.EditTextField
                        .setText(view.EditTextField.getText() + "^(");
        private ActionListener rootButtonActionListener = e -> view.EditTextField
                        .setText(view.EditTextField.getText() + "√(");
        private ActionListener leftParenthesisButtonActionListener = e -> view.EditTextField
                        .setText(view.EditTextField.getText() + "(");
        private ActionListener comaButtonActionListener = e -> view.EditTextField
                        .setText(view.EditTextField.getText() + ".");
        private ActionListener rightParenthesisButtonActionListener = e -> view.EditTextField
                        .setText(view.EditTextField.getText() + ")");

        // DeleteButton
        private ActionListener deleteButtonActionListener = e -> {
                view.EditTextField.requestFocus();
                if (view.EditTextField.getCaretPosition() - 3 >= 0) {
                        view.EditTextField.requestFocus();
                        String lastThreeChars = view.EditTextField.getText().substring(
                                        view.EditTextField.getCaretPosition() - 3,
                                        view.EditTextField.getCaretPosition());
                        if (lastThreeChars.equals("Sin") || lastThreeChars.equals("Cos")
                                        || lastThreeChars.equals("Tan") || lastThreeChars.equals("Sec")
                                        || lastThreeChars.equals("Csc") || lastThreeChars.equals("Cot")) {
                                view.EditTextField.setText(view.EditTextField.getText().substring(0,
                                                view.EditTextField.getText().length() - 3));
                        } else {
                                view.EditTextField.setText(view.EditTextField.getText().substring(0,
                                                view.EditTextField.getText().length() - 1));
                        }
                } else {
                        if (view.EditTextField.getCaretPosition() - 1 >= 0) {
                                view.EditTextField.setText(view.EditTextField.getText().substring(0,
                                                view.EditTextField.getText().length() - 1));
                        }
                }
        };

        // Action Buttons
        private ActionListener copyButtonActionListener = e -> view.ResultTextField.copy();
        private ActionListener eraseButtonActionListener = e -> view.EditTextField.setText(null);
        private ActionListener ansButtonActionListener = e -> view.EditTextField
                        .setText(view.EditTextField.getText() + view.ResultTextField.getText());

        // Result Button
        @Override
        public void actionPerformed(ActionEvent evt) {
                model.setExpression(view.EditTextField.getText());
                try {
                        model.evaluateExpression();
                        double result = model.getResult();
                        view.ResultTextField.setText(String.valueOf(result));
                        System.out.println("New calculation: " + result);
                } catch (ParseException e) {
                        view.ResultTextField.setText("Sintax Error");
                        System.err.println("Error parsing expression: " + e.getMessage());
                }
        }
}
