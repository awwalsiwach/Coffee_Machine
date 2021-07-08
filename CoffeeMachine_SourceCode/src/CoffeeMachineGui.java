import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CoffeeMachineGui extends JFrame {
    private JTabbedPane tabbedPane1;
    private JButton cappuccinoButton;
    private JButton latteButton;
    private JButton espressoButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JPanel frame;
    private JButton okButton;
    private JLabel takeLabel;
   // private JPanel Remaining;
    private JLabel milkLabel;
    private JLabel beansLabel;
    private JLabel cupsLabel;
    private JLabel moneyLabel;
    private JLabel waterLabel;
    private JLabel buyOutputLabel;
    private JPanel take;
    private JPanel remaining;
    private JPanel fill;
    private JPanel buy;
    private JLabel signLabel;


    public CoffeeMachineGui()
    {
        add(frame);
        signLabel.setIcon(new ImageIcon("Resources/sign.png"));

        //buy panel
        //espresso
        espressoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (CoffeeMachine.water >= 250 && CoffeeMachine.beans >= 16 && CoffeeMachine.cups >= 1) {
                    buyOutputLabel.setText("I have enough resources, making you a coffee!");
                    CoffeeMachine.water -= 250;
                    CoffeeMachine.beans -= 16;
                    CoffeeMachine.money += 4;
                    CoffeeMachine.cups--;
                } else {
                    if (CoffeeMachine.water < 250)
                        buyOutputLabel.setText("Sorry, not enough water!");
                    else if (CoffeeMachine.beans < 16)
                        buyOutputLabel.setText("Sorry, not enough coffee beans!");
                    else
                        buyOutputLabel.setText("Sorry, not enough disposable cups!");
                }
            }
        });
        //latte
        latteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (CoffeeMachine.water >= 350 && CoffeeMachine.milk >= 75 && CoffeeMachine.beans >= 20 && CoffeeMachine.cups >= 1) {
                    buyOutputLabel.setText("I have enough resources, making you a coffee!");
                    CoffeeMachine.water -= 350;
                    CoffeeMachine.milk -= 75;
                    CoffeeMachine.beans -= 20;
                    CoffeeMachine.money += 7;
                    CoffeeMachine.cups--;
                }
                else
                {
                    if(CoffeeMachine.water<350)
                        buyOutputLabel.setText("Sorry, not enough water!");
                    else if(CoffeeMachine.milk<75)
                        buyOutputLabel.setText("Sorry, not enough milk!");
                    else if(CoffeeMachine.beans<20)
                        buyOutputLabel.setText("Sorry, not enough coffee beans!");
                    else
                        buyOutputLabel.setText("Sorry, not enough disposable cups!");
                }
            }
        });
        //cappuccino
        cappuccinoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                if (CoffeeMachine.water >= 200 && CoffeeMachine.milk >= 100 && CoffeeMachine.beans >= 12 && CoffeeMachine.cups >= 1) {
                    buyOutputLabel.setText("I have enough resources, making you a coffee!");
                    CoffeeMachine.water -= 200;
                    CoffeeMachine.milk -= 100;
                    CoffeeMachine.beans -= 12;
                    CoffeeMachine.money += 6;
                    CoffeeMachine.cups--;
                }
                else
                {
                    if(CoffeeMachine.water<200)
                        buyOutputLabel.setText("Sorry, not enough water!");
                    else if(CoffeeMachine.milk<100)
                        buyOutputLabel.setText("Sorry, not enough milk!");
                    else if(CoffeeMachine.beans<12)
                        buyOutputLabel.setText("Sorry, not enough coffee beans!");
                    else
                        buyOutputLabel.setText("Sorry, not enough disposable cups!");
                }
            }
        });

        //fill panel
        ActionListener ae = new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                int a = Integer.parseInt(textField1.getText());
                int b = Integer.parseInt(textField2.getText());
                int c = Integer.parseInt(textField3.getText());
                int d = Integer.parseInt(textField4.getText());

                JButton btn = (JButton) e.getSource();
                if(btn == okButton)
                {
                    CoffeeMachine.water = CoffeeMachine.water + a;
                    CoffeeMachine.milk = CoffeeMachine.milk + b;
                    CoffeeMachine.beans = CoffeeMachine.beans + c;
                    CoffeeMachine.cups = CoffeeMachine.cups + d;
                }
            }
        };
        okButton.addActionListener(ae);

        //Take panel
        take.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                {
                    takeLabel.setText("I gave you $"+CoffeeMachine.money);
                    CoffeeMachine.money = 0;
                }
            }
        });

        //Remaining panel
        remaining.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);;
                {
                    waterLabel.setText(CoffeeMachine.water+" ml of water");
                    milkLabel.setText(CoffeeMachine.milk+" ml of milk");
                    beansLabel.setText(CoffeeMachine.beans+" g of coffee beans");
                    cupsLabel.setText(CoffeeMachine.cups+" disposable cups");
                    moneyLabel.setText("$"+CoffeeMachine.money+" of money");

                }
            }
        });
    }
    }
