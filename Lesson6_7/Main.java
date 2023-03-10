public class Main {
    public static void main(String[] args) {
        /*//task1
        DaysOfWeek []day = DaysOfWeek.values();
        for(int i = 0 ;i<7;i++){
            if(i<5){
                System.out.println("Workday "+day[i].name());
            }else{
                System.out.println("Weekend day "+day[i].name());
            }

        }

        //task2
        BaseConverter convert = new BaseConverter();
        convert.set_t_Celsius(30);
        convert.displayInfo();*/

        //dz
        //Сделать все поля private!!!!
        PassengerTransport bmwi8 = new PassengerTransport(350, 400, 1000, "BMW i8", 4, 3.5, "LOX", 4);
        bmwi8.displayCharacteristics();
        bmwi8.countTimeCharacteristics(2.5);

        CargoTransport Maz = new CargoTransport(700, 180, 5000, "MAZ", 8, 9.7, 1000);
        Maz.displayCharacteristics();
        Maz.checkLoadCapacity(2000);

        CivilianAirTransport boing = new CivilianAirTransport(5000, 1000, 20000, "BOING", 20, 1000, 200, true);
        boing.displayCharacteristics();
        boing.checkNumPassengers(300);


        MilitaryAirTransport istrebitel = new MilitaryAirTransport(3000, 1200, 3000, "SU_520", 3.5, 300, 1, true);
        istrebitel.displayCharacteristics();
        istrebitel.checkCatapulta();
        istrebitel.checkRockets();
        istrebitel.checkRockets();


    }
}

enum DaysOfWeek {Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday};