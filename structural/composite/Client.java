package structural.composite;

import structural.composite.composite.Directory;
import structural.composite.leaf.RealFile;

public class Client {

    public static void main(String[] args) {
        Directory rootDirectory = new Directory("root");
        Directory subDirectory = new Directory("sub");
        RealFile file1 = new RealFile("file1");
        RealFile file2 = new RealFile("file2");

        subDirectory.add(file1);
        rootDirectory.add(subDirectory);
        rootDirectory.add(file2);

        rootDirectory.ls();
        /*
            /root
            /root/sub
            /root/sub/file1
            /root/file2
         */


        rootDirectory.remove(subDirectory);
        rootDirectory.ls();
        /*
            /root
            /root/file2
         */
    }

}