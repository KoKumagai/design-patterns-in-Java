package behavioral.interpreter;

public class AndExpression implements AbstractExpression {
    private AbstractExpression expressionA;
    private AbstractExpression expressionB;

    public AndExpression(AbstractExpression expressionA, AbstractExpression expressionB) {
        this.expressionA = expressionA;
        this.expressionB = expressionB;
    }

    public boolean interpret(String context) {
        return expressionA.interpret(context) && expressionB.interpret(context);
    }
}