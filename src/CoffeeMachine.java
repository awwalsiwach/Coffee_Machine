import javax.swing.*;
import java.util.Scanner;
public class CoffeeMachine {

    public static int water = 400;
    public static int milk = 540;
    public static int beans = 120;
    public static int cups = 9;
    public static int money = 550;
/*
    public static void buy()
    {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String buyChoice = scanner.next();
        switch(buyChoice)
        {
            case "1":
                if(water>=250 && beans>=16 && cups>=1)
                {
                    System.out.println("I have enough resources, making you a coffee!");
                    water -= 250;
                    beans -= 16;
                    money += 4;
                    cups--;
                }
                else
                {
                    if(water<250)
                        System.out.println("Sorry, not enough water!");
                    else if(beans<16)
                        System.out.println("Sorry, not enough coffee beans!");
                    else
                        System.out.println("Sorry, not enough disposable cups!");
                }
                mainMenu();
                break;
            case "2":
                if(water>=350 && milk>=75 && beans>=20 && cups>=1)
                {
                    System.out.println("I have enough resources, making you a coffee!");
                    water -= 350;
                    milk  -= 75;
                    beans -= 20;
                    money += 7;
                    cups--;
                }
                else
                {
                    if(water<350)
                        System.out.println("Sorry, not enough water!");
                    else if(milk<75)
                        System.out.println("Sorry, not enough milk!");
                    else if(beans<20)
                        System.out.println("Sorry, not enough coffee beans!");
                    else
                        System.out.println("Sorry, not enough disposable cups!");
                }
                mainMenu();
                break;
            case "3":
                if(water>=200 && milk>=100 && beans>=12 && cups>=1)
                {
                    System.out.println("I have enough resources, making you a coffee!");
                    water -= 200;
                    milk  -= 100;
                    beans -= 12;
                    money += 6;
                    cups--;
                }
                else
                {
                    if(water<200)
                        System.out.println("Sorry, not enough water!");
                    else if(milk<100)
                        System.out.println("Sorry, not enough milk!");
                    else if(beans<12)
                        System.out.println("Sorry, not enough coffee beans!");
                    else
                        System.out.println("Sorry, not enough disposable cups!");
                }
                mainMenu();
                break;
            case "back":
                mainMenu();
                break;
            default:
                mainMenu();
                break;
        }
    }

    public static void fill()
    {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water you want to add: ");
        water += scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add: ");
        milk += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add: ");
        beans += scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee you want to add: ");
        cups += scanner.nextInt();
        mainMenu();
    }

    public static void take()
    {
        System.out.println();
        System.out.println("I gave you $"+money);
        money=0;
        mainMenu();
    }

    public static void remaining()
    {
        System.out.println();
        System.out.println("The coffee machine has:");
        System.out.println(water+" ml of water");
        System.out.println(milk+" ml of milk");
        System.out.println(beans+" g of coffee beans");
        System.out.println(cups+" disposable cups");
        System.out.println("$"+money+" of money");
        mainMenu();
    }

    public static void exit()
    {
        System.exit(0);
    }

    public static void mainMenu()
    {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write action (buy, fill, take, remaining, exit): ");
        String input = scanner.next();
        switch (input) {
            case "buy":
                buy();
                break;
            case "fill":
                fill();
                break;
            case "take":
                take();
                break;
            case "remaining":
                remaining();
                break;
            case "exit":
                exit();
                break;
            default:
                break;
        }
    }*/

    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        CoffeeMachineGui coffeeMachineGui = new CoffeeMachineGui();
        coffeeMachineGui.setTitle("Coffee Machine");
        coffeeMachineGui.setSize(600,600);
        ImageIcon img = new ImageIcon("Resources/Logo_128.png");
        coffeeMachineGui.setIconImage(img.getImage());
        coffeeMachineGui.pack();
        coffeeMachineGui.setLocationRelativeTo(null);
        coffeeMachineGui.setVisible(true);
        coffeeMachineGui.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //mainMenu();
    }
}