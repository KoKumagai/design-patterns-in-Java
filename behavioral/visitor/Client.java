package behavioral.visitor;

import behavioral.visitor.element.Computer;
import behavioral.visitor.element.ComputerPart;
import behavioral.visitor.element.Cpu;
import behavioral.visitor.element.Dram;
import behavioral.visitor.element.Motherboard;
import behavioral.visitor.element.Hdd;
import behavioral.visitor.visitor.BrandDisplayVisitor;
import behavioral.visitor.visitor.ModelDisplayVisitor;

public class Client {

    public static void main(String[] args) {

        Cpu cpu = new Cpu("Intel", "Core i7-5960X");
        Dram dram = new Dram("Crucial", "DDR4 PC4-17000");
        Hdd hdd = new Hdd("Seagate", "STBD4000400");
        Motherboard motherboard = new Motherboard("ASUS", "X99-DELUXE");
        ComputerPart computer = new Computer("Dell", "Inspiron 1750", cpu, dram, hdd, motherboard);

        computer.accept(new BrandDisplayVisitor());
        // CPU brand: Intel
        // DRAM brand: Crucial
        // HDD brand: Seagate
        // Motherboard brand: ASUS
        // Computer brand: Dell

        computer.accept(new ModelDisplayVisitor());
        // CPU model: Core i7-5960X
        // DRAM model: DDR4 PC4-17000
        // HDD model: STBD4000400
        // Motherboard model: X99-DELUXE
        // Computer model: Inspiron 1750
    }

}