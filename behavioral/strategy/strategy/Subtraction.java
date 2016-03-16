package behavioral.strategy.strategy;

public class Subtraction implements Operation {

    @Override
    public int calculate(int leftOperand, int rightOperand) {
        return leftOperand - rightOperand;
    }

}