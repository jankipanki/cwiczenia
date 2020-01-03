package computer;

public class ComputerStore {
    public static void main(String[] args) {
        ComputerFactory factory = new ComputerFactory();
        Computer comp1 = factory.create("Intel i5", 8192);
        Computer comp2 = factory.create("AMD", 16384);

        //klient chce dodać 4 GB RAMu
        ComputerUpgrade upgrade = new ComputerUpgrade();
        upgrade.addMemory(comp1, 4096);

        comp1.printInfo();
        comp2.printInfo();
    }
}
