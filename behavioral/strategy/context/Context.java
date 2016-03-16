package behavioral.strategy.context;

import behavioral.strategy.strategy.Operation;

public class Context {

    private Operation operation;

    public Context(Operation operation) {
        this.operation = operation;
    }

    public int execute(int leftOperand, int rightOperand) {
        return operation.calculate(leftOperand, rightOperand);
    }

}