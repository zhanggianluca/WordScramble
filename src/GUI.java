import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.io.*;
import java.util.Scanner;

public class GUI extends JFrame implements ActionListener {
    private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16, enter;
    private JTextField display;
    private JLabel label, scoreb;
    private JPanel pan1,pan2,pan3;
    private boolean valid;
    private String ans, result, random;
    private String[] arr;
    private int score;

    public GUI() {
        setTitle("WORD GAME");
        randomLet();
        setButton();
        setJTextField();
        setJLabel();
        setJPanel();
        addComponents();
        setActionCommands();
        addActionListeners();
        setLayout(new FlowLayout());
        add(pan1);
        add(pan2);
        add(pan3);
        add(label);
        add(scoreb);
        read();
        array();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public GUI(String title)
    {
        super(title);
        randomLet();
        setButton();
        setJTextField();
        setJLabel();
        setJPanel();
        addComponents();
        setActionCommands();
        addActionListeners();
        setLayout(new FlowLayout());
        add(pan1);
        add(pan2);
        add(pan3);
        add(label);
        add(scoreb);
        read();
        array();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void randomLet() {
        Random rd = new Random();
        for (int i = 0; i < 20; i++) {
            char letter = (char)(rd.nextInt(26) + 'a');
            random += letter;
        }
    }


    public void actionPerformed(ActionEvent click)
    {
        String displayText = display.getText();
        String actionCommand = click.getActionCommand();
        switch (actionCommand){
            case "1":
                displayText += random.substring(4, 5);
                break;
            case "2":
                displayText += random.substring(5, 6);
                break;
            case "3":
                displayText += random.substring(6, 7);
                break;
            case "4":
                displayText += random.substring(7, 8);
                break;
            case "5":
                displayText += random.substring(8, 9);
                break;
            case "6":
                displayText += random.substring(9, 10);
                break;
            case "7":
                displayText += random.substring(10, 11);
                break;
            case "8":
                displayText += random.substring(11, 12);
                break;
            case "9":
                displayText += random.substring(12, 13);
                break;
            case "10":
                displayText += random.substring(13, 14);
                break;
            case "11":
                displayText += random.substring(14, 15);
                break;
            case "12":
                displayText += random.substring(15, 16);
                break;
            case "13":
                displayText +=random.substring(16, 17);
                break;
            case "14":
                displayText += random.substring(17, 18);
                break;
            case "15":
                displayText += random.substring(18, 19);
                break;
            case "16":
                displayText += random.substring(19, 20);
                break;
            case "enter":
                if (!displayText.equals(""))
                {
                    ans = displayText;
                    oneLetter();
                    valid = valid(ans);
                    updateScore(valid);
                    scoreb.setText("Score: " + score);
                    displayText = "";
                }
                break;
        }
        display.setText(displayText);
        repaint();
    }



    private void setButton() {
        btn1 = new JButton(random.substring(4, 5));
        btn2 = new JButton(random.substring(5, 6));
        btn3 = new JButton(random.substring(6, 7));
        btn4 = new JButton(random.substring(7, 8));
        btn5 = new JButton(random.substring(8, 9));
        btn6 = new JButton(random.substring(9, 10));
        btn7 = new JButton(random.substring(10, 11));
        btn8 = new JButton(random.substring(11, 12));
        btn9 = new JButton(random.substring(12, 13));
        btn10 = new JButton(random.substring(13, 14));
        btn11 = new JButton(random.substring(14, 15));
        btn12 = new JButton(random.substring(15, 16));
        btn13 = new JButton(random.substring(16, 17));
        btn14 = new JButton(random.substring(17, 18));
        btn15 = new JButton(random.substring(18, 19));
        btn16 = new JButton(random.substring(19, 20));
        enter = new JButton("Enter");
    }

    private void setJTextField() {
        display = new JTextField(20);
        display.setPreferredSize(new Dimension(200, 40));
        display.setEditable(false);
    }

    private void setJLabel() {
        label = new JLabel("Try to make as many words as you can from these 16 letters");
        label.setFont(new Font("Dialog", Font.BOLD, 8));
        scoreb = new JLabel("Score: " + score);
        scoreb.setFont(new Font("Dialog", Font.BOLD, 15));
    }

    private void setJPanel() {
        pan1 = new JPanel();
        pan2 = new JPanel();
        pan2.setLayout(new GridLayout(4, 4, 2, 2));
        pan3 = new JPanel();
    }

    private void addComponents() {
        pan1.add(display);
        pan2.add(btn1); pan2.add(btn2); pan2.add(btn3); pan2.add(btn4); pan2.add(btn5); pan2.add(btn6); pan2.add(btn7); pan2.add(btn8); pan2.add(btn9); pan2.add(btn10); pan2.add(btn11); pan2.add(btn12); pan2.add(btn13); pan2.add(btn14); pan2.add(btn15); pan2.add(btn16);
        pan3.add(enter);
    }


    private void setActionCommands() {
        btn1.setActionCommand("1");
        btn2.setActionCommand("2");
        btn3.setActionCommand("3");
        btn4.setActionCommand("4");
        btn5.setActionCommand("5");
        btn6.setActionCommand("6");
        btn7.setActionCommand("7");
        btn8.setActionCommand("8");
        btn9.setActionCommand("9");
        btn10.setActionCommand("10");
        btn11.setActionCommand("11");
        btn12.setActionCommand("12");
        btn13.setActionCommand("13");
        btn14.setActionCommand("14");
        btn15.setActionCommand("15");
        btn16.setActionCommand("16");
        enter.setActionCommand("enter");
    }

    private void addActionListeners() {
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btn10.addActionListener(this);
        btn11.addActionListener(this);
        btn12.addActionListener(this);
        btn13.addActionListener(this);
        btn14.addActionListener(this);
        btn15.addActionListener(this);
        btn16.addActionListener(this);
        enter.addActionListener(this);
    }

    private void read() {
        result = "";
        try {
            File myObj = new File("engmix.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if (data.length() <= 2) {
                    data = "";
                }
                result += data + "\n";
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    private void array() {
        arr = result.split("\n");
    }

    private boolean valid(String ans) {
        boolean valid = false;

        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            if (word.equals(ans)) {
                valid = true;
            }
        }
        return valid;
    }

    private void updateScore(boolean correct) {
        if (correct) {
            score++;
            System.out.println(ans.toUpperCase() + " is a word");
        }
        else {
            System.out.println(ans.toUpperCase() + " is not a valid word");
        }

    }

    private void oneLetter() {
        if (ans.length() <= 2) {
            System.out.println("Invalid, your word must be at least 3 characters long");
        }
    }


}
