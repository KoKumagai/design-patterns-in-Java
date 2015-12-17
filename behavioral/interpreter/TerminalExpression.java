package behavioral.interpreter;

public class TerminalExpression implements AbstractExpression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(data)? true: false;
    }
}