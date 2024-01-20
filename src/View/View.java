package View;

import javax.swing.*;

public class View extends JFrame {

    // Variables declaration                     
    public javax.swing.JButton AnsButton;
    public javax.swing.JPanel Buttons;
    public javax.swing.JButton ComaButton;
    public javax.swing.JPanel Control;
    public javax.swing.JButton CopyButton;
    public javax.swing.JButton SinButton;
    public javax.swing.JButton CosButton;
    public javax.swing.JButton TanButton;
    public javax.swing.JButton SecButton;
    public javax.swing.JButton CscButton;
    public javax.swing.JButton CotButton;
    public javax.swing.JButton DeleteButton;
    public javax.swing.JPanel Display;
    public javax.swing.JButton DivisionButton;
    public javax.swing.JTextField EditTextField;
    public javax.swing.JButton EraseButton;
    public javax.swing.JButton EulerButton;
    public javax.swing.JButton PiButton;
    public javax.swing.JButton LeftParentesisButton;
    public javax.swing.JPanel Main;
    public javax.swing.JButton MinusButton;
    public javax.swing.JButton N0Button1;
    public javax.swing.JButton N1Button;
    public javax.swing.JButton N2Button;
    public javax.swing.JButton N3Button;
    public javax.swing.JButton N4Button;
    public javax.swing.JButton N5Button;
    public javax.swing.JButton N6Button;
    public javax.swing.JButton N7Button;
    public javax.swing.JButton N8Button;
    public javax.swing.JButton N9Button;
    public javax.swing.JPanel NavigationDisplay;
    public javax.swing.JPanel Numbers;
    public javax.swing.JButton PlusButton;
    public javax.swing.JButton PowerButton;
    public javax.swing.JButton ProductButton;
    public javax.swing.JButton ResultButton;
    public javax.swing.JTextField ResultTextField;
    public javax.swing.JButton RigthParentesisButton;
    public javax.swing.JButton RootButton;
    public javax.swing.JPanel TrigFuntions;
    public javax.swing.JPanel ValuesDisplay;
    public javax.swing.Box.Filler filler1;
    public javax.swing.Box.Filler filler2;
    public javax.swing.Box.Filler filler3;
    public javax.swing.Box.Filler filler4;
    public javax.swing.Box.Filler filler5;
    public javax.swing.JLabel jLabel1;
    // End of variables declaration     

    public View() {
        initComponents();
    }

    private void initComponents() {

        Main = new javax.swing.JPanel();
        Display = new javax.swing.JPanel();
        ValuesDisplay = new javax.swing.JPanel();
        EditTextField = new javax.swing.JTextField();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 32767));
        jLabel1 = new javax.swing.JLabel();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 32767));
        ResultTextField = new javax.swing.JTextField();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 15), new java.awt.Dimension(0, 15), new java.awt.Dimension(32767, 15));
        NavigationDisplay = new javax.swing.JPanel();
        DeleteButton = new javax.swing.JButton();
        EraseButton = new javax.swing.JButton();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 32767));
        CopyButton = new javax.swing.JButton();
        ResultButton = new javax.swing.JButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 15), new java.awt.Dimension(0, 15), new java.awt.Dimension(32767, 15));
        Buttons = new javax.swing.JPanel();
        Numbers = new javax.swing.JPanel();
        N1Button = new javax.swing.JButton();
        N2Button = new javax.swing.JButton();
        N3Button = new javax.swing.JButton();
        N4Button = new javax.swing.JButton();
        N5Button = new javax.swing.JButton();
        N6Button = new javax.swing.JButton();
        N7Button = new javax.swing.JButton();
        N8Button = new javax.swing.JButton();
        N9Button = new javax.swing.JButton();
        ComaButton = new javax.swing.JButton();
        N0Button1 = new javax.swing.JButton();
        AnsButton = new javax.swing.JButton();
        Control = new javax.swing.JPanel();
        PlusButton = new javax.swing.JButton();
        MinusButton = new javax.swing.JButton();
        ProductButton = new javax.swing.JButton();
        DivisionButton = new javax.swing.JButton();
        PowerButton = new javax.swing.JButton();
        RootButton = new javax.swing.JButton();
        LeftParentesisButton = new javax.swing.JButton();
        RigthParentesisButton = new javax.swing.JButton();
        EulerButton = new javax.swing.JButton();
        PiButton = new javax.swing.JButton();
        TrigFuntions = new javax.swing.JPanel();
        SinButton = new javax.swing.JButton();
        CosButton = new javax.swing.JButton();
        TanButton = new javax.swing.JButton();
        SecButton = new javax.swing.JButton();
        CscButton = new javax.swing.JButton();
        CotButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(380, 450));
        setResizable(false);

        Main.setBackground(new java.awt.Color(204, 204, 204));
        Main.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 15));
        Main.setMaximumSize(new java.awt.Dimension(480, 250));
        Main.setMinimumSize(new java.awt.Dimension(480, 250));
        Main.setPreferredSize(new java.awt.Dimension(480, 250));
        Main.setLayout(new java.awt.BorderLayout());

        Display.setLayout(new javax.swing.BoxLayout(Display, javax.swing.BoxLayout.Y_AXIS));

        ValuesDisplay.setBackground(new java.awt.Color(204, 204, 204));
        ValuesDisplay.setLayout(new javax.swing.BoxLayout(ValuesDisplay, javax.swing.BoxLayout.LINE_AXIS));

        EditTextField.setBackground(new java.awt.Color(153, 153, 153));
        EditTextField.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        EditTextField.setBorder(new javax.swing.border.LineBorder(java.awt.Color.gray, 1, true));
        ValuesDisplay.add(EditTextField);
        ValuesDisplay.add(filler1);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Result:");
        ValuesDisplay.add(jLabel1);
        ValuesDisplay.add(filler3);

        ResultTextField.setEditable(false);
        ResultTextField.setBackground(new java.awt.Color(153, 153, 153));
        ResultTextField.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        ResultTextField.setBorder(new javax.swing.border.LineBorder(java.awt.Color.gray, 1, true));
        ResultTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ValuesDisplay.add(ResultTextField);

        Display.add(ValuesDisplay);
        Display.add(filler4);

        NavigationDisplay.setLayout(new java.awt.GridLayout(1, 0));

        DeleteButton.setBackground(new java.awt.Color(255, 51, 102));
        DeleteButton.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        DeleteButton.setText("Delete");

        NavigationDisplay.add(DeleteButton);

        EraseButton.setBackground(new java.awt.Color(255, 51, 102));
        EraseButton.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        EraseButton.setText("Clear All");

        NavigationDisplay.add(EraseButton);
        NavigationDisplay.add(filler5);

        CopyButton.setBackground(new java.awt.Color(153, 153, 153));
        CopyButton.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        CopyButton.setText("Copiar");

        NavigationDisplay.add(CopyButton);

        ResultButton.setBackground(new java.awt.Color(102, 51, 255));
        ResultButton.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        ResultButton.setText("=");

        NavigationDisplay.add(ResultButton);

        Display.add(NavigationDisplay);
        Display.add(filler2);

        Main.add(Display, java.awt.BorderLayout.PAGE_START);

        Buttons.setLayout(new java.awt.BorderLayout());

        Numbers.setLayout(new java.awt.GridLayout(4, 3));

        N1Button.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        N1Button.setText("1");

        Numbers.add(N1Button);

        N2Button.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        N2Button.setText("2");

        Numbers.add(N2Button);

        N3Button.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        N3Button.setText("3");

        Numbers.add(N3Button);

        N4Button.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        N4Button.setText("4");

        Numbers.add(N4Button);

        N5Button.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        N5Button.setText("5");

        Numbers.add(N5Button);

        N6Button.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        N6Button.setText("6");

        Numbers.add(N6Button);

        N7Button.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        N7Button.setText("7");

        Numbers.add(N7Button);

        N8Button.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        N8Button.setText("8");

        Numbers.add(N8Button);

        N9Button.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        N9Button.setText("9");

        Numbers.add(N9Button);

        ComaButton.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        ComaButton.setText(",");

        Numbers.add(ComaButton);

        N0Button1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        N0Button1.setText("0");

        Numbers.add(N0Button1);

        AnsButton.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        AnsButton.setText("Ans");

        Numbers.add(AnsButton);

        Buttons.add(Numbers, java.awt.BorderLayout.CENTER);

        Control.setLayout(new java.awt.GridLayout(5, 2));

        PlusButton.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        PlusButton.setText("+");

        Control.add(PlusButton);

        MinusButton.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        MinusButton.setText("-");

        Control.add(MinusButton);

        ProductButton.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        ProductButton.setText("*");

        Control.add(ProductButton);

        DivisionButton.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        DivisionButton.setText("÷");

        Control.add(DivisionButton);

        PowerButton.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        PowerButton.setText("^");

        Control.add(PowerButton);

        RootButton.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        RootButton.setText("√");

        Control.add(RootButton);

        LeftParentesisButton.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        LeftParentesisButton.setText("( ");

        Control.add(LeftParentesisButton);

        RigthParentesisButton.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        RigthParentesisButton.setText(")");

        Control.add(RigthParentesisButton);

        EulerButton.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        EulerButton.setText("e");

        Control.add(EulerButton);

        PiButton.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        PiButton.setText("π");

        Control.add(PiButton);

        Buttons.add(Control, java.awt.BorderLayout.WEST);

        TrigFuntions.setLayout(new java.awt.GridLayout(2, 3));

        SinButton.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        SinButton.setText("Sin");

        TrigFuntions.add(SinButton);

        CosButton.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        CosButton.setText("Cos");

        TrigFuntions.add(CosButton);

        TanButton.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        TanButton.setText("Tan");

        TrigFuntions.add(TanButton);

        SecButton.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        SecButton.setText("Sec");

        TrigFuntions.add(SecButton);

        CscButton.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        CscButton.setText("Csc");

        TrigFuntions.add(CscButton);

        CotButton.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        CotButton.setText("Cot");

        TrigFuntions.add(CotButton);

        Buttons.add(TrigFuntions, java.awt.BorderLayout.PAGE_START);

        Main.add(Buttons, java.awt.BorderLayout.CENTER);

        getContentPane().add(Main, java.awt.BorderLayout.CENTER);

        pack();
    }

}
