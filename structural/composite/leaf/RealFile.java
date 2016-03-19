package structural.composite.leaf;

import structural.composite.component.AbstractFile;

public class RealFile implements AbstractFile {

    private String name;

    public RealFile(String name) {
        this.name = name;
    }

    @Override
    public void ls() {
        ls("");
    }

    @Override
    public void ls(String prefix) {
        System.out.println(prefix + "/" + name);
    }

}