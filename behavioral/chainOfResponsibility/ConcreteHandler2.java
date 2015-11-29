package behavioral.chainOfResponsibility;

public class ConcreteHandler2 extends Handler {
    private static final int LUKY_NUMBER = 777;
    private int num;

    public ConcreteHandler2(String name, int num) {
        super(name);
        this.num = num;
    }

    public void request(int req) {
        if(num == LUKY_NUMBER) {
            System.out.println(name + ": OK!");
        } else if(next != null) {
            System.out.println(name + ": NEXT!");
            next.request(req);
        } else {
            System.out.println(name + ": NG!");
        }
    }
}