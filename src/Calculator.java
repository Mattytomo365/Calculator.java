import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    public int buttonpress = 0;
    private JPanel Calculator;
    private JTextField txtDisplay;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton xButton;
    private JButton ACButton;
    private JButton xButton1;
    private JButton a7Button;
    private JButton a4Button;
    private JButton a1Button;
    private JButton a00Button;
    private JButton button11;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a2Button;
    private JButton a0Button;
    private JButton x2Button;
    private JButton a9Button;
    private JButton a6Button;
    private JButton a3Button;
    private JButton button20;

    public String StringValOne;
    public String StringValTwo;

    public Boolean OperatorIsActive = false;  /*This boolean operator is used to determine whether
                                              to clear the calculator screen or where to place the variables within
                                              the equation*/
    public String Operator = ""; // the empty space is used as a placeholder as at this point no operator is selected

    double beforeOp, afterOp, result;  // these variables are used to determine where to place the variables within the equation

    public Calculator() {
        ACButton.addActionListener(new ActionListener() {   /* This is the constructor for the calculator class, which
            @Override                                        clears the screen of the calc and the two variables*/
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText("");
                StringValOne ="0";
                StringValTwo ="0";
            }
        });
        a7Button.addActionListener(new ActionListener() {  // inputs the number "7" to a variable of name either one or two.
            @Override                                      // The correct variable is decided by checking if an operator has been pressed.
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a7Button.getText());
                if (OperatorIsActive = false) {
                    StringValOne.concat("7");
                } else {
                    StringValTwo.concat("7");
                }
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a8Button.getText());
                if (OperatorIsActive = false) {
                    StringValOne.concat("8");
                } else {
                    StringValTwo.concat("8");
                }
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a9Button.getText());
                if (OperatorIsActive = false) {
                    StringValOne.concat("9");
                } else {
                    StringValTwo.concat("9");
                }
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a4Button.getText());
                if (OperatorIsActive = false) {
                    StringValOne.concat("4");
                } else {
                    StringValTwo.concat("4");
                }
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a5Button.getText());
                if (OperatorIsActive = false) {
                    StringValOne.concat("5");
                } else {
                    StringValTwo.concat("5");
                }
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a6Button.getText());
                if (OperatorIsActive = false) {
                    StringValOne.concat("6");
                } else {
                    StringValTwo.concat("6");
                }
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a1Button.getText());
                if (OperatorIsActive = false) {
                    StringValOne.concat("1");
                } else {
                    StringValTwo.concat("1");
                }
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a2Button.getText());
                if (OperatorIsActive = false) {
                    StringValOne.concat("2");
                } else {
                    StringValTwo.concat("2");
                }
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a3Button.getText());
                if (OperatorIsActive = false) {
                    StringValOne.concat("3");
                } else {
                    StringValTwo.concat("3");
                }
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a0Button.getText());
                if (OperatorIsActive = false) {
                    StringValOne.concat("0");
                } else {
                    StringValTwo.concat("0");
                }
            }
        });

        button20.addActionListener(new ActionListener() { //adds the "." to the value as a decimal point
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!txtDisplay.getText().contains(".")) {
                    txtDisplay.setText(txtDisplay.getText() + button20.getText());
                    if (OperatorIsActive = false) {
                        StringValOne.concat(".");
                    } else {
                        StringValTwo.concat(".");
                    }
                }
            }
        });
        button11.addActionListener(new ActionListener() {
            @Override                                   // changes the operator to a "+" and clears the
                                                            // text for another value to be entered
            public void actionPerformed(ActionEvent e) {
                beforeOp = Double.parseDouble(txtDisplay.getText());
                Operator = "+";
                txtDisplay.setText("");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                beforeOp = Double.parseDouble(txtDisplay.getText());
                Operator = "-";
                txtDisplay.setText("");
            }
        });
        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                beforeOp = Double.parseDouble(txtDisplay.getText());
                Operator = "×";
                txtDisplay.setText("");
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                beforeOp = Double.parseDouble(txtDisplay.getText());
                Operator = "÷";
                txtDisplay.setText("");
            }
        });
        a00Button.addActionListener(new ActionListener() {  //changes the operator to the "power of " function
            @Override                                       // which is used later to put the first value to the power of the next value
            public void actionPerformed(ActionEvent e) {
                beforeOp = Double.parseDouble(txtDisplay.getText());
                Operator = "x^y";
                txtDisplay.setText("");
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {        // this chunk of code determines which operator is being used for the current calculation
                afterOp = Double.parseDouble(txtDisplay.getText());

                if (Operator == "+") {
                    result = beforeOp + afterOp;
                    txtDisplay.setText(String.valueOf(result));
                } else if (Operator == "-") {
                    result = beforeOp - afterOp;
                    txtDisplay.setText(String.valueOf(result));
                }else if (Operator == "x^y") {
                    result = Math.pow( beforeOp, afterOp);
                    txtDisplay.setText(String.valueOf(result));
                } else if (Operator == "×") {
                    result = beforeOp * afterOp;
                    txtDisplay.setText(String.valueOf(result));
                } else if (Operator == "÷") {
                    if (beforeOp == 0 || afterOp == 0) { //this if statement ensures that incorrect calculations will not be displayed but instead an error
                        txtDisplay.setText("Error");
                    } else {
                        result = beforeOp / afterOp;
                        txtDisplay.setText(String.valueOf(result));
                    }
                }

            }
        });
        x2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                //multiplies the number pressed by itself after this operator is pressed
                double temp = Double.parseDouble(txtDisplay.getText());
                temp = temp * temp;
                StringValOne = Double.toString(temp);
                txtDisplay.setText(String.valueOf(temp));
            }
        });
        xButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                //square roots the number pressed after this operator is pressed
                double temp = Double.parseDouble(txtDisplay.getText());
                temp = Math.sqrt(temp);
                StringValOne = Double.toString(temp);
                txtDisplay.setText(String.valueOf(temp));
            }
        });

    }

    public void main(String[] args) {  //static code to initiate the creation of the class.
        Calculator newCalc = new Calculator();
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}





