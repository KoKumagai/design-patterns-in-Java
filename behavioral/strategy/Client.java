package behavioral.strategy;

import behavioral.strategy.context.Context;
import behavioral.strategy.strategy.Addition;
import behavioral.strategy.strategy.Subtraction;

public class Client {

    public static void main(String[] args) {
        Context context = new Context(new Addition());
        System.out.println("7 + 2 = " + context.execute(2, 7)); // 7 + 2 = 9

        context = new Context(new Subtraction());
        System.out.println("7 - 2 = " + context.execute(7, 2)); // 7 - 2 = 5
    }

}