import transport.Car;
import transport.Bus;
import transport.*;
public class Main {
    public static void main(String[] args) {
        DriverB driverB1 = new DriverB("Иван", true, 10);
        Car[] cars = new Car[4];
        cars[0] = new Car("Lada", "Granta", 1.7, driverB1, CarBody.SEDAN);
        cars[1] = new Car("Audi", "A8 50 L TDI quattro", 3.0, new DriverB("Олег", true, 11), CarBody.HATCHBACK);
        cars[2] = new Car("BMW", "Z8", 3.0, new DriverB("Владимир", true, 12), CarBody.SEDAN);
        cars[3] = new Car("KIA", "Sportage 4-го поколения", 2.4, new DriverB("Михаил", true, 9), CarBody.CROSSOVER);

        Bus[] buses = new Bus[4];
        buses[0] = new Bus("Hyundai", "County", 3, new DriverD("Кирилл", true, 14), PassengerCapacity.SMALL);
        buses[1] = new Bus("МАЗ", "104", 4, new DriverD("Алексей", true, 4), PassengerCapacity.LARGE);
        buses[2] = new Bus("Mercedes-Benz", "Sprinter ||", 0, new DriverD("Дмитрий", true, 10), PassengerCapacity.EXTRA_SMALL);
        buses[3] = new Bus("Mercedes", "Classic", 0, new DriverD("Артем", true, 5), PassengerCapacity.MEDIUM);

        Truck[] trucks = new Truck[4];
        trucks[0] = new Truck("Маз", "232", 5, new DriverC("Алексей", true, 8), LoadCapacity.N1);
        trucks[1] = new Truck("Маз", "555", 2.1, new DriverC("Павел", true, 9), LoadCapacity.N2);
        trucks[2] = new Truck("ЛиАЗ", "4292", 6, new DriverC("Саша", true, 14), LoadCapacity.N1);
        trucks[3] = new Truck("УАЗ", "111", 3, new DriverC("Константин", true, 15), LoadCapacity.N3);

        System.out.println(cars[0].getType());
        System.out.println(buses[1].getType());
        System.out.println(trucks[2].getType());
        cars[1].printType();
        buses[0].printType();
        trucks[3].printType();
        printAll(cars);
        printAll(buses);
        printAll(trucks);
        trucks[0].pitStop();
        buses[1].bestLapTime();
        cars[2].maxSpeed();
        printInfo(trucks[1]);
        printInfo(cars[0]);
        printInfo(buses[3]);
        cars[1].passDiagnostics();
        /*try {
            buses[0].passDiagnostics();
        } catch (TransportTypeException e) {
            System.err.println(e.getMessage());
        }*/
        trucks[3].passDiagnostics();

    }
    public static void printAll(Transport[] transport){
        for (Transport element: transport){
            System.out.println(element);
        }
    }
    public static void printInfo (Transport transport){
        System.out.println("Водитель " + transport.getDriver().getName() + " управляет ТС " + transport.getBrand() + " и будет участвовать в заезде");
    }
}