package com.liujun.dp.Facade;

public class Computer {
    private CPU cpu;
    private Memory memory;
    private Disk disk;
    public Computer() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.disk = new Disk();
    }
    public void startup() {
        System.out.println("start the computer");
        this.cpu.startup();
        this.memory.startup();
        this.disk.startup();
        System.out.println("start computer finished");
    }

    public void shutdown() {
        System.out.println("begin to close the computer");
        this.disk.shutdown();
        this.memory.shutdown();
        this.cpu.shutdown();
        System.out.println("computer closed");
    }
}
