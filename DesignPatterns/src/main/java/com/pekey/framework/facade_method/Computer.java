package com.pekey.framework.facade_method;

/**
 * 外观者模式
 * 并未使用接口，将内部的流程都在各自的实现类中进行，computer作为整体的执行入口
 */
public class Computer {
    private CPU cpu;
    private Memory memory;
    private Disk disk;

    public Computer(){
        this.cpu = new CPU();
        this.memory = new Memory();
        this.disk = new Disk();
    }

    public void startup(){
        System.out.println("电脑开始启动");
        cpu.startup();
        memory.startup();
        disk.startup();
        System.out.println("电脑启动成功");
    }

    public void shutdown(){
        System.out.println("电脑开始关机");
        cpu.shutdown();
        memory.shutdown();
        disk.shutdown();
        System.out.println("电脑已关机");
    }
}
