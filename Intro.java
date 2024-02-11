import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

public class Intro extends JFrame implements ActionListener {

    JLabel l1 = new JLabel ("Welcome");
    JLabel l2 = new JLabel ("to");
    JLabel l3 = new JLabel ("Jenna's");
    JLabel l4 = new JLabel ("Pizzeria");

    JButton b1 = new JButton ("Click Here to Order");

    final int WIDTH = 500;
    final int HEIGHT = 500;

    public Intro(){
        super("My Frame");
        setSize(WIDTH,HEIGHT);
        setLayout(new FlowLayout());

        Font labelFont = l1.getFont();
        l1.setFont(new Font(labelFont.getFontName(), Font.PLAIN, 60));
        add(l1);

        Font labelFont2 = l2.getFont();
        l2.setFont(new Font(labelFont2.getFontName(), Font.PLAIN, 60));
        add(l2);

        Font labelFont3 = l3.getFont();
        l3.setFont(new Font(labelFont3.getFontName(), Font.PLAIN, 60));
        add(l3);

        Font labelFont4 = l4.getFont();
        l4.setFont(new Font(labelFont4.getFontName(), Font.PLAIN, 60));
        add(l4);

        b1.setPreferredSize(new Dimension(300,150));
        Font Buttonlabel = b1.getFont();
        b1.setFont(new Font(Buttonlabel.getFontName(), Font.PLAIN, 30));
        add(b1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.PINK);
        b1.addActionListener(this);




    }
    @Override
    //after a button is clicked, these if statements tell the code to go to the next screen
    public void actionPerformed(ActionEvent e) {
        Pizza Order = new  Pizza();
        Order.setVisible(true);

    }

    public static void main(String[] args) {
        Intro intro = new Intro();
        intro.setVisible(true);
    }
class Pizza extends JFrame implements ActionListener {
        //Labels and Buttons for the first frame
        JLabel l1 = new JLabel ("What size pizza would you like to buy?");
        JButton b1 = new JButton ("Size Small $5");
        JButton b2 = new JButton ("Size Medium $10");
        JButton b3 = new JButton ("Size Large $15");
        JButton b4 = new JButton ("Size Supper $20");

        //width and height for the first frame
        final int WIDTH = 500;
        final int HEIGHT = 700;


        //adding variables into the first frame
        public Pizza(){
            super("My Frame");
            setSize(WIDTH,HEIGHT);
            setLayout(new FlowLayout());

            Font labelFont = l1.getFont();
            l1.setFont(new Font(labelFont.getFontName(), Font.PLAIN, 25));

            add(l1);

            b1.setPreferredSize(new Dimension(250,150));
            b2.setPreferredSize(new Dimension(250,150));
            b3.setPreferredSize(new Dimension(250,150));
            b4.setPreferredSize(new Dimension(250,150));

            Font buttonFont = b1.getFont();
            b1.setFont(new Font(buttonFont.getFontName(), Font.PLAIN, 25));
            add(b1);

            Font buttonFont2 = b2.getFont();
            b2.setFont(new Font(buttonFont2.getFontName(), Font.PLAIN, 25));
            add(b2);

            Font buttonFont3 = b3.getFont();
            b3.setFont(new Font(buttonFont3.getFontName(), Font.PLAIN, 25));
            add(b3);

            Font buttonFont4 = b4.getFont();
            b4.setFont(new Font(buttonFont4.getFontName(), Font.PLAIN, 25));
            add(b4);

            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            getContentPane().setBackground(Color.PINK);
            b1.addActionListener(this);
            b2.addActionListener(this);
            b3.addActionListener(this);
            b4.addActionListener(this);
        }
        @Override
        //after a button is clicked, these if statements tell the code to go to the next screen
        public void actionPerformed(ActionEvent e){
            if (e.getSource() == b1) {
                Toppings Order = new  Toppings( 5.0,"Size Small Pizza ");
                Order.setVisible(true);
            }
            if (e.getSource() == b2) {
                Toppings Order = new  Toppings( 10.0,"Size Medium Pizza ");
                Order.setVisible(true);
            }
            if (e.getSource() == b3) {
                Toppings Order = new  Toppings( 15.0,"Size Large Pizza ");
                Order.setVisible(true);
            }
            if (e.getSource() == b4) {
                Toppings Order = new  Toppings( 20.0,"Size Super Pizza ");
                Order.setVisible(true);
            }


        }
//        the main functions sets the frames to be visible
        public void main(String[] args){
            Pizza myFrame = new Pizza();
            myFrame.setVisible(true);
    }

}

class Toppings extends JFrame implements ActionListener {
    //define variables and creating labels/buttons for frame 2
    public double price;
    public String size;
    public double counter;
    JLabel l1 = new JLabel ("Please select a pizza or make your own down below.");
    JButton b1 = new JButton ("Plain Cheese (+$0.00)");
    JButton b2 = new JButton ("Chicken Bacon Ranch (+$1.25)");
    JButton b3 = new JButton ("Vegetable [pepper, spinach, tomato] (+$1.25)");
    JButton b4 = new JButton ("Meat Lovers [pepperoni, sausage, ham] (+$1.25)");
    JButton b5 = new JButton ("Chicken and Garlic (+$1.00)");
    JLabel l2 = new JLabel ("Make your own, please select no more than 3 toppings.");
    JButton b6 = new JButton ("Pepper (+$0.50)");
    JButton b7 = new JButton ("Spinach (+$0.50)");
    JButton b8 = new JButton ("Tomato (+$0.50)");
    JButton b9 = new JButton ("Pepperoni (+$0.50)");
    JButton b10 = new JButton ("Sausage (+$0.50)");
    JButton b11 = new JButton ("Ham (+$0.50)");
    JButton b12 = new JButton ("Extra Cheese (+$0.00)");
    JButton press = new JButton ("Continue");

    //sets the width and height for frame 2
    final int WIDTH = 500;
    final int HEIGHT = 700;

    //adding variables for the second frame
    public Toppings(double p, String s){
        super("Order");
        price = p;
        size = s;
        counter = 0;
        setSize(WIDTH,HEIGHT);
        setLayout(new FlowLayout());
        getContentPane().setBackground(Color.PINK);

        Font labelFont = l1.getFont();
        l1.setFont(new Font(labelFont.getFontName(), Font.PLAIN, 18));
        add(l1);

        b1.setPreferredSize(new Dimension(300,40));
        add(b1);
        b2.setPreferredSize(new Dimension(300,40));
        add(b2);
        b3.setPreferredSize(new Dimension(300,40));
        add(b3);
        b4.setPreferredSize(new Dimension(300,40));
        add(b4);
        b5.setPreferredSize(new Dimension(300,40));
        add(b5);

        Font labelFont2 = l2.getFont();
        l2.setFont(new Font(labelFont2.getFontName(), Font.PLAIN, 18));
        add(l2);

        b6.setPreferredSize(new Dimension(300,40));
        add(b6);
        b7.setPreferredSize(new Dimension(300,40));
        add(b7);
        b8.setPreferredSize(new Dimension(300,40));
        add(b8);
        b9.setPreferredSize(new Dimension(300,40));
        add(b9);
        b10.setPreferredSize(new Dimension(300,40));
        add(b10);
        b11.setPreferredSize(new Dimension(300,40));
        add(b11);
        b12.setPreferredSize(new Dimension(300,40));
        add(b12);

        Font labelFont3 = press.getFont();
        press.setFont(new Font(labelFont3.getFontName(), Font.PLAIN, 18));
        press.setPreferredSize(new Dimension(300,40));
        add(press);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        press.addActionListener(this);
        //getContentPane().setBackground(Color.BLUE);

    }
    @Override
    //after a button is clicked, these if statements tell the code to go to the next screen
    public void actionPerformed(ActionEvent e){
        double x = 0.0;
        if (e.getSource() == b1) {
           price += 0.00;
           size += "Plain Cheese ";
           counter += 0;
        }
        if (e.getSource() == b2) {
            price += 1.50;
            size += "Chicken Bacon Ranch ";
            counter += 3;
        }
        if (e.getSource() == b3) {
            price += 1.50;
            size += "Vegetable ";
            counter += 3;
        }
        if (e.getSource() == b4) {
            price += 1.50;
            size += "Meat Lovers ";
            counter += 3;
        }
        if (e.getSource() == b5) {
            price += 1.00;
            size += "Chicken and Garlic ";
            counter += 2;
        }
        if (e.getSource() == b6) {
            price += 0.50;
            size += "Pepper ";
            counter += 1;
        }
        if (e.getSource() == b7) {
            price += 0.50;
            size += "Spinach ";
            counter += 1;
        }
        if (e.getSource() == b8) {
            price += 0.50;
            size += "Tomato ";
            counter += 1;
        }
        if (e.getSource() == b9) {
            price += 0.50;
            size += "Pepperoni ";
            counter += 1;
        }
        if (e.getSource() == b10) {
            price += 0.50;
            size += "Sausage ";
            counter += 1;
        }
        if (e.getSource() == b11) {
            price += 0.50;
            size += "Ham ";
            counter += 1;
        }
        if (e.getSource() == b12) {
            price += 0.00;
            size += "Extra Cheese ";
            counter += 0;
        }

        if (counter > 2) {
             x = 0.25;
        }
        if (counter > 3) {
            JOptionPane.showMessageDialog(this, "You can only choose three toppings, please hit the red x and redo your order. Thank you.");
        }
        if (e.getSource() == press) {
            Price Order = new  Price( (price-x),size);
            Order.setVisible(true);
        }




}}
    class Price extends JFrame  {

        JLabel imageLabel;
        JLabel l1 = new JLabel("Thanks for");
        JLabel l2 = new JLabel("ordering from");
        JLabel l3 = new JLabel("Jenna's Pizzeria");
        final int WIDTH = 500;final int HEIGHT = 700;
        public Price (double p, String s) {
            super("Cost");
            setSize(WIDTH, HEIGHT);
            setLayout(new FlowLayout());



            getContentPane().setBackground(Color.PINK);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JOptionPane.showMessageDialog(this, "This is your total cost $"+ p +". Your order is "+ s);

            Font labelFont = l1.getFont();
            l1.setFont(new Font(labelFont.getFontName(), Font.PLAIN, 60));
            add(l1);
            l2.setFont(new Font(labelFont.getFontName(), Font.PLAIN, 60));
            add(l2);
            l3.setFont(new Font(labelFont.getFontName(), Font.PLAIN, 60));
            add(l3);

    }


}}



