package structural.adapter.adapter;

import structural.adapter.adaptee.LegacySystem;

public class NewSystem implements NewSystemAdapter {

    private LegacySystem legacySystem = new LegacySystem();

    @Override
    public void execute() {
        System.out.println("This is a new system.");
        legacySystem.run();
    }

}