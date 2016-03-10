package behavioral.interpreter;

import behavioral.interpreter.expression.Expression;
import behavioral.interpreter.expression.HangulExpression;
import behavioral.interpreter.expression.JapaneseExpression;

public class Client {

    public static void main(String[] args) {
        Expression japanse = new JapaneseExpression();

        System.out.println(japanse.interpret(1)); // 一
        System.out.println(japanse.interpret(6)); // 六


        Expression hangul = new HangulExpression();

        System.out.println(hangul.interpret(2)); // 이
        System.out.println(hangul.interpret(9)); // 구
    }

}