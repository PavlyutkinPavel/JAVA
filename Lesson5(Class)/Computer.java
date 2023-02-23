import java.util.Random;
import java.util.Scanner;

public class Computer {
    String processor;
    int RAM;
    int spaceOn_hard_drive;
    int resourceFullCyclesOperation;   // time to turn on/off the computer or other operation?

    void printInfo() {
        System.out.println("\nModel of processor: " + processor + "\nRAM = " + RAM + " Gb " +
                "\nSpace on the hard drive = " + spaceOn_hard_drive + " Gb " + "\nResource of full cycles of operation (on/off): " + resourceFullCyclesOperation);
    }

    void computerOn() {
        Random r = new Random();
        boolean isCompAlive = r.nextBoolean();
        int ZeroOrOne = r.nextInt(0, 1);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0  or 1 : ");
        int zeroOne = sc.nextInt();
        while (zeroOne > 1 || zeroOne < 0) {
            System.out.println("Try again! Enter 0  or 1 : ");
            zeroOne = sc.nextInt();
        }
        if (zeroOne == ZeroOrOne) {
            System.out.println("Computer is turning off...");
            if (isCompAlive == true) {
                System.out.println("Computer wasn't burnt up");
            } else {
                System.out.println("Computer was burnt up.It's end :( ");
            }
            System.exit(0);
        } else {
            System.out.println("COMPUTER IS ON");
        }

    }

    void computerOff() {
        Random r = new Random();
        boolean isCompAlive = r.nextBoolean();
        int ZeroOrOne = r.nextInt(0, 1);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0  or 1 : ");
        int zeroOne = sc.nextInt();
        while (zeroOne > 1 || zeroOne < 0) {
            System.out.println("Try again! Enter 0  or 1 : ");
            zeroOne = sc.nextInt();
        }
        if (zeroOne == ZeroOrOne) {
            System.out.println("Computer is turning on... AHAHA SCAM FROM WINDOWS");
            if (isCompAlive == true) {
                System.out.println("Computer wasn't burnt up");
            } else {
                System.out.println("Computer was burnt up.It's end :( ");
                System.exit(0);
            }
        } else {
            System.out.println("COMPUTER IS OFF");
        }

    }

    Computer(String nameProcessor, int amountRAM, int spaceHD, int operationOnOff) {
        processor = nameProcessor;
        RAM = amountRAM;
        if(amountRAM>64){
            System.out.println("Too much RAM u ask for...Computer was burnt up :(");
            System.exit(0);
        }
        spaceOn_hard_drive = spaceHD;
        if(spaceHD>1024){
            System.out.println("Too much space for hard drive u ask for...Computer was burnt up :(");
            System.exit(0);
        }
        resourceFullCyclesOperation = operationOnOff;
    }
}
