package behavioral.interpreter.expression;

public class HangulExpression implements Expression {

    @Override
    public String interpret(int context) {
        switch (context) {
            case 1:
                return "일";
            case 2:
                return "이";
            case 3:
                return "삼";
            case 4:
                return "사";
            case 5:
                return "오";
            case 6:
                return "육";
            case 7:
                return "칠";
            case 8:
                return "팔";
            case 9:
                return "구";
            default:
                return null;
        }
    }

}