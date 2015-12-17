package behavioral.chainOfResponsibility;

public class ConcreteHandler1 extends Handler {
    private int num;

    public ConcreteHandler1(String name, int num) {
        super(name);
        this.num = num;
    }

    @Override
    public void request(int req) {
        if(req < num) {
            System.out.println(name + ": OK!");
        } else if(next != null) {
            System.out.println(name + ": NEXT!");
            next.request(req);
        } else {
            System.out.println(name + ": NG!");
        }
    }
}