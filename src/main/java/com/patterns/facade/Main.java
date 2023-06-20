package com.patterns.facade;

public class Main {
    public static void main(String[] args){
        //Читать инфу с DVD

        ComputerFacade computerFacade = new ComputerFacade();
        computerFacade.copyFromDvdToComp();
        computerFacade.power.on();

        //Power ON OFF
        //Disk - store, send info
    }
}
