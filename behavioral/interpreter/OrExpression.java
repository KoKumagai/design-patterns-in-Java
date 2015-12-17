package behavioral.interpreter;

public class OrExpression implements AbstractExpression {
    private AbstractExpression expressionA;
    private AbstractExpression expressionB;

    public OrExpression(AbstractExpression expressionA, AbstractExpression expressionB) {
        this.expressionA = expressionA;
        this.expressionB = expressionB;
    }

    @Override
    public boolean interpret(String context) {
        return expressionA.interpret(context) || expressionB.interpret(context);
    }
}