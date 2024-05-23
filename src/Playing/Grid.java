package Playing;

import Objects.Objects;
import Objects.Variables;

import java.awt.*;
import java.util.Random;

import javax.swing.*;

public class Grid extends JPanel {
    MyButton First;
    MyButton Second;
    CenterPanel Game;
    int ClickCounter=0;
    public Grid(CenterPanel Game){

        Grid();
        this.Game = Game;
    }
    public void Grid(){

        Random RANDOM = new Random();
        this.setLayout(new GridLayout(Variables.m, Variables.n));
        System.out.println(Variables.m);
        for(int i=0; i < Variables.m; i++){
            for(int j=0; j<Variables.n; j++){
                int randomNum = RANDOM.nextInt(10);
                Objects.MATRIX[i][j] = new MyButton(randomNum, i, j, this);
                Objects.MATRIX[i][j].setBackground(new Color(200,100,140));
                this.add(Objects.MATRIX[i][j]);
                Variables.Sum+=randomNum;
            }
        }
        Objects.SUM.setText("Sum: " + Variables.Sum);
    }
    public void Update(MyButton Pressed){
        if(First==null){
            First=Pressed;
        }
        else{
            Second=Pressed;
                String BUTTON_A_VALUE = First.getText();
                switch(Variables.Operations.get(ClickCounter)){
                    case "+":
                       First.setText(String.valueOf(((Integer.parseInt(BUTTON_A_VALUE))+Integer.parseInt(Second.getText()))%10));
                       ClickCounter++;
                       break;
                    case "-":
                        First.setText(String.valueOf(((Integer.parseInt(BUTTON_A_VALUE))-Integer.parseInt(Second.getText()))%10));
                        ClickCounter++;
                        break;
                    case "/":
                        if(Integer.parseInt(Second.getText())!=0) {
                            First.setText(String.valueOf(((Integer.parseInt(BUTTON_A_VALUE))/Integer.parseInt(Second.getText()))%10));
                            ClickCounter++;
                        }
                        else{
                            First.setText("0");
                            ClickCounter++;
                        }
                        break;
                    case "*":
                        First.setText(String.valueOf(((Integer.parseInt(BUTTON_A_VALUE))*Integer.parseInt(Second.getText()))%10));
                        ClickCounter++;
                        break;
                }
                First=Second;
                Second=null;
                Variables.Sum=0;
                Variables.Moves--;
            if (Variables.Moves > 0) {
                Objects.MOVES.setText("Moves: "+Variables.Moves);
                for (int i = 0; i < Variables.m; i++) {
                    for (int j = 0; j < Variables.n; j++) {
                        Variables.Sum+=Integer.parseInt(Objects.MATRIX[i][j].getText());
                        Objects.SUM.setText("Sum: "+ Variables.Sum);
                    }
                }
            }
            else if(Variables.Sum==Variables.Target){
                Game.remove(this);
                JPanel Won = new JPanel();
                Won.setLayout(new FlowLayout());
                JButton Won_L = new JButton("YOU WON!");
                Won_L.setBackground(new Color(222, 190, 204));
                Won.add(Won_L);
                Won.setBackground(new Color(201, 161, 220));
                Game.add(Won_L);

            }
              else{
                  Game.remove(this);
                  JPanel Lost = new JPanel();
                  Lost.setLayout(new FlowLayout());
                  JButton Lost_L = new JButton("YOU LOST!");
                  Lost_L.setBackground(new Color(222, 190, 204));
                  Lost.add(Lost_L);
                  Lost.setBackground(new Color(201, 161, 220));
                  Game.add(Lost_L);
            }
            }
        }
    }
