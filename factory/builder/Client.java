package factory.builder;

public class Client {

    public static void main(String[] args) {
        String result = "";
        Director director = new Director(new ConcreteBuilder());
        result = (String)director.construct();
        System.out.println(result);
    }

}
