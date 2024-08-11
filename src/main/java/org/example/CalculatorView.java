package org.example;

import javax.swing.*;
import java.awt.*;

public class CalculatorView extends JFrame {

    // Interface components
    private JButton ansButton;
    protected JPanel buttonsPanel;
    private JButton commaButton;
    private JPanel controlPanel;
    private JButton copyButton;
    private JButton sinButton;
    private JButton cosButton;
    private JButton tanButton;
    private JButton secButton;
    private JButton cscButton;
    private JButton cotButton;
    private JButton deleteButton;
    protected JPanel displayPanel;
    private JButton divisionButton;
    private JTextField inputTextField;
    private JButton clearButton;
    private JButton eulerButton;
    private JButton piButton;
    private JButton leftParenthesisButton;
    protected JPanel mainPanel;
    private JButton minusButton;
    private JButton num0Button;
    private JButton num1Button;
    private JButton num2Button;
    private JButton num3Button;
    private JButton num4Button;
    private JButton num5Button;
    private JButton num6Button;
    private JButton num7Button;
    private JButton num8Button;
    private JButton num9Button;
    protected JPanel navigationPanel;
    private JPanel numbersPanel;
    private JButton plusButton;
    private JButton powerButton;
    private JButton multiplyButton;
    protected JButton equalsButton;
    private JTextField resultTextField;
    private JButton rightParenthesisButton;
    private JButton rootButton;
    private JPanel trigFunctionsPanel;
    protected JPanel valuesDisplayPanel;
    protected JLabel resultLabel;

    public CalculatorView() {
        initComponents();
    }

    private void initComponents() {

        // Initialization of main panels
        mainPanel = new JPanel(new BorderLayout());
        displayPanel = new JPanel();
        buttonsPanel = new JPanel(new BorderLayout());

        // Panel for displaying results and input
        valuesDisplayPanel = new JPanel();
        valuesDisplayPanel.setLayout(new BoxLayout(valuesDisplayPanel, BoxLayout.LINE_AXIS));

        inputTextField = new JTextField();
        inputTextField.setBackground(new Color(153, 153, 153));
        inputTextField.setFont(new Font("Segoe UI Black", Font.ITALIC, 14));
        inputTextField.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        valuesDisplayPanel.add(inputTextField);

        resultLabel = new JLabel("Result:");
        resultLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 18));
        resultLabel.setForeground(new Color(51, 51, 51));
        valuesDisplayPanel.add(Box.createRigidArea(new Dimension(15, 0)));
        valuesDisplayPanel.add(resultLabel);

        resultTextField = new JTextField();
        resultTextField.setEditable(false);
        resultTextField.setBackground(new Color(153, 153, 153));
        resultTextField.setFont(new Font("Segoe UI Black", Font.ITALIC, 14));
        resultTextField.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        valuesDisplayPanel.add(Box.createRigidArea(new Dimension(15, 0)));
        valuesDisplayPanel.add(resultTextField);

        displayPanel.setLayout(new BoxLayout(displayPanel, BoxLayout.Y_AXIS));
        displayPanel.add(valuesDisplayPanel);
        displayPanel.add(Box.createRigidArea(new Dimension(0, 15)));

        // Navigation panel with control buttons
        navigationPanel = new JPanel(new GridLayout(1, 5));

        deleteButton = new JButton("Delete");
        deleteButton.setBackground(new Color(255, 51, 102));
        deleteButton.setFont(new Font("Segoe UI Black", Font.PLAIN, 12));
        navigationPanel.add(deleteButton);

        clearButton = new JButton("Clear All");
        clearButton.setBackground(new Color(255, 51, 102));
        clearButton.setFont(new Font("Segoe UI Black", Font.PLAIN, 12));
        navigationPanel.add(clearButton);

        copyButton = new JButton("Copy");
        copyButton.setBackground(new Color(153, 153, 153));
        copyButton.setFont(new Font("Segoe UI Black", Font.PLAIN, 12));
        navigationPanel.add(copyButton);

        equalsButton = new JButton("=");
        equalsButton.setBackground(new Color(102, 51, 255));
        equalsButton.setFont(new Font("Segoe UI Black", Font.PLAIN, 18));
        navigationPanel.add(equalsButton);

        displayPanel.add(navigationPanel);
        displayPanel.add(Box.createRigidArea(new Dimension(0, 15)));

        mainPanel.add(displayPanel, BorderLayout.PAGE_START);

        // Numeric buttons panel
        numbersPanel = new JPanel(new GridLayout(4, 3));

        num1Button = new JButton("1");
        num2Button = new JButton("2");
        num3Button = new JButton("3");
        num4Button = new JButton("4");
        num5Button = new JButton("5");
        num6Button = new JButton("6");
        num7Button = new JButton("7");
        num8Button = new JButton("8");
        num9Button = new JButton("9");
        num0Button = new JButton("0");

        commaButton = new JButton(",");
        ansButton = new JButton("Ans");

        // Add buttons to the numeric panel
        addNumberButtons();

        // Panel for arithmetic operations and parentheses
        controlPanel = new JPanel(new GridLayout(5, 2));

        plusButton = new JButton("+");
        minusButton = new JButton("-");
        multiplyButton = new JButton("*");
        divisionButton = new JButton("÷");
        powerButton = new JButton("^");
        rootButton = new JButton("√");
        leftParenthesisButton = new JButton("(");
        rightParenthesisButton = new JButton(")");

        eulerButton = new JButton("e");
        piButton = new JButton("π");

        // Add buttons to the control panel
        addControlButtons();

        // Trigonometric functions panel
        trigFunctionsPanel = new JPanel(new GridLayout(2, 3));

        sinButton = new JButton("Sin");
        cosButton = new JButton("Cos");
        tanButton = new JButton("Tan");
        secButton = new JButton("Sec");
        cscButton = new JButton("Csc");
        cotButton = new JButton("Cot");

        // Add trigonometric buttons
        addTrigFunctionButtons();

        // Add panels to the main interface
        buttonsPanel.add(numbersPanel, BorderLayout.CENTER);
        buttonsPanel.add(controlPanel, BorderLayout.WEST);
        buttonsPanel.add(trigFunctionsPanel, BorderLayout.PAGE_START);

        mainPanel.add(buttonsPanel, BorderLayout.CENTER);

        getContentPane().add(mainPanel, BorderLayout.CENTER);

        // Window settings
        setTitle("Calculator");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(380, 450));
        setResizable(false);
        pack();
    }

    private void addNumberButtons() {
        numbersPanel.add(num1Button);
        numbersPanel.add(num2Button);
        numbersPanel.add(num3Button);
        numbersPanel.add(num4Button);
        numbersPanel.add(num5Button);
        numbersPanel.add(num6Button);
        numbersPanel.add(num7Button);
        numbersPanel.add(num8Button);
        numbersPanel.add(num9Button);
        numbersPanel.add(commaButton);
        numbersPanel.add(num0Button);
        numbersPanel.add(ansButton);
    }

    private void addControlButtons() {
        controlPanel.add(plusButton);
        controlPanel.add(minusButton);
        controlPanel.add(multiplyButton);
        controlPanel.add(divisionButton);
        controlPanel.add(powerButton);
        controlPanel.add(rootButton);
        controlPanel.add(leftParenthesisButton);
        controlPanel.add(rightParenthesisButton);
        controlPanel.add(eulerButton);
        controlPanel.add(piButton);
    }

    private void addTrigFunctionButtons() {
        trigFunctionsPanel.add(sinButton);
        trigFunctionsPanel.add(cosButton);
        trigFunctionsPanel.add(tanButton);
        trigFunctionsPanel.add(secButton);
        trigFunctionsPanel.add(cscButton);
        trigFunctionsPanel.add(cotButton);
    }

    // Getters for components, if needed elsewhere
    public JButton getAnsButton() { return ansButton; }
    public JButton getCommaButton() { return commaButton; }
    public JButton getCopyButton() { return copyButton; }
    public JButton getDeleteButton() { return deleteButton; }
    public JButton getSinButton() { return sinButton; }
    public JButton getCosButton() { return cosButton; }
    public JButton getTanButton() { return tanButton; }
    public JButton getSecButton() { return secButton; }
    public JButton getCscButton() { return cscButton; }
    public JButton getCotButton() { return cotButton; }
    public JButton getDivisionButton() { return divisionButton; }
    public JButton getClearButton() { return clearButton; }
    public JButton getEulerButton() { return eulerButton; }
    public JButton getPiButton() { return piButton; }
    public JButton getLeftParenthesisButton() { return leftParenthesisButton; }
    public JButton getRightParenthesisButton() { return rightParenthesisButton; }
    public JButton getMinusButton() { return minusButton; }
    public JButton getNum0Button() { return num0Button; }
    public JButton getNum1Button() { return num1Button; }
    public JButton getNum2Button() { return num2Button; }
    public JButton getNum3Button() { return num3Button; }
    public JButton getNum4Button() { return num4Button; }
    public JButton getNum5Button() { return num5Button; }
    public JButton getNum6Button() { return num6Button; }
    public JButton getNum7Button() { return num7Button; }
    public JButton getNum8Button() { return num8Button; }
    public JButton getNum9Button() { return num9Button; }
    public JButton getPlusButton() { return plusButton; }
    public JButton getPowerButton() { return powerButton; }
    public JButton getMultiplyButton() { return multiplyButton; }
    public JButton getRootButton() { return rootButton; }
    public JTextField getInputTextField() { return inputTextField; }
    public JTextField getResultTextField() { return resultTextField; }
}
