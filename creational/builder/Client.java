package factory.builder;

public class Client {
    public static void main(String[] args) {
        Director director = new Director(new ConcreteBuilder());
        String result = (String)director.construct();
        System.out.println(result);
    }
}