package behavioral.strategy.strategy;

public class Addition implements Operation {

    @Override
    public int calculate(int leftOperand, int rightOperand) {
        return leftOperand + rightOperand;
    }

}