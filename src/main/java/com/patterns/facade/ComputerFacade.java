package com.patterns.facade;

public class ComputerFacade {
    Power power = new Power();
    DvdRom dvdRom = new DvdRom();
    DvdDecoder dvdDecoder = new DvdDecoder();

    public void copyFromDvdToComp(){
        power.on();
        dvdRom.open();
        dvdRom.close();
        dvdDecoder.copy();
        power.off();
    }
}
