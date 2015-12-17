package structural.decorator;

public class ConcreteComponent extends Component {
    @Override
    public void method1() {
        System.out.print("ConcreteComponet#method1");
    }

    @Override
    public void method2() {
        System.out.print("ConcreteComponet#method2");
    }
}