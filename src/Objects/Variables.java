package Objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Variables {
   public static List<String> generate(int Moves){
       Random random = new Random();
       String[] operation = {"+", "-", "/", "*"};
       ArrayList<String> Operations = new ArrayList<>();

       for (int i = 1; i < Moves; i++) {
           Operations.add(operation[random.nextInt(operation.length)]);
           Operations.add("+");
       }
        return Operations;
    }
    static public int Target = 150;
    static public int Sum = 0;
    static public int Moves = 25;
    static public int m = 5;
    static public int n = 5;
    static public List<String> Operations = generate(Moves);
    static public int x;
    static public int y;

}
