package behavioral.strategy;

public class ConcreteStrategyMultiply implements Strategy {
    public int strategyMethod(int num1, int num2) {
        return num1 * num2;
    }
}