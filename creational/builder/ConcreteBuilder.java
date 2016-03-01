package factory.builder;

public class ConcreteBuilder extends Builder {
    private StringBuffer sb = new StringBuffer();

    @Override
    public void part1(String str) {
        sb.append("part1" + " => " + str + System.getProperty("line.separator"));
    }

    @Override
    public void part2(String str) {
        sb.append("part2" + " => " + str + System.getProperty("line.separator"));
    }

    @Override
    public Object getResult() {
        return sb.toString();
    }
}