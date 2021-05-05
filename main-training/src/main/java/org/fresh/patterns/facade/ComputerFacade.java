package org.fresh.patterns.facade;


public class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    ComputerFacade() {
        cpu = new CPU();
        memory = new Memory();
        hardDrive = new HardDrive();
    }

    public void start() {
       cpu.freeze();
       memory.load(22, "DATA");
       hardDrive.read(44, 2);
       cpu.jump(22);
       cpu.execute();
    }
}
