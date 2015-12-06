package behavioral.interpreter;

public class Client {
    public static AbstractExpression getMaleExpression() {
        AbstractExpression jack = new TerminalExpression("Jack");
        AbstractExpression betty = new TerminalExpression("Betty");
        return new OrExpression(jack, betty);
    }

    public static AbstractExpression getFamilyExpression() {
        AbstractExpression mikeSmith = new TerminalExpression("Smith");
        AbstractExpression marySmith = new TerminalExpression("Smith");
        return new AndExpression(mikeSmith, marySmith);
    }

    public static void main(String[] args) {
        AbstractExpression isMale = getMaleExpression();
        AbstractExpression isFamily = getFamilyExpression();

        System.out.println(isMale.interpret("Jack"));
        System.out.println(isMale.interpret("Mary"));

        System.out.println(isFamily.interpret("Smith"));
        System.out.println(isFamily.interpret("Brown"));
    }
}