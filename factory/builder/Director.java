package factory.builder;

public class Director {
    private Builder builder;
    public Director(Builder builder){
        this.builder = builder;
    }
    public Object construct(){
        builder.part1("Running part1");
        builder.part2("Running part2");
        return builder.getResult();
    }
}
