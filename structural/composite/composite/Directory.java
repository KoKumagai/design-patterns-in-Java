package structural.composite.composite;

import structural.composite.component.AbstractFile;

import java.util.ArrayList;
import java.util.List;

public class Directory implements AbstractFile {

    private String name;
    private List<AbstractFile> files = new ArrayList<AbstractFile>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public void ls() {
        ls("");
    }

    @Override
    public void ls(String prefix) {
        System.out.println(prefix + "/" + name);
        for (AbstractFile file : files) {
            file.ls(prefix + "/" + name);
        }
    }

    public void add(AbstractFile file) {
        files.add(file);
    }

    public void remove(AbstractFile file) {
        files.remove(file);
    }

}