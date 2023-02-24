package transport;
import java.util.List;

public class Bus extends Transport<DriverD>{
    private PassengerCapacity passengerCapacity;
    private final Type bus = Type.BUS;

    public Bus(String brand, String model, double engineVolume, DriverD driver, PassengerCapacity passengerCapacity, List<Mechanic> mechanics) {
        super(brand, model, engineVolume, driver, mechanics);
        this.passengerCapacity = passengerCapacity;
    }

    public PassengerCapacity getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(PassengerCapacity passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public void startMoving() {
        System.out.println("Автобус " + getBrand() + " начал движение");
    }

    @Override
    public void finishMoving() {
        System.out.println("Автобус " + getBrand() + " закончил движение");
    }
    @Override
    public void pitStop() {
        System.out.println("Автобус " + getBrand() + " пит - стоп");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Автобус " + getBrand() + " лучшее время круга ");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Автобус " + getBrand() + " максимальная скорость");
    }

    @Override
    public Type getType(){
        return bus;
    }
    @Override
    public void printType() {
        if (passengerCapacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Автобус " + getBrand() + " " + getModel() + " " +passengerCapacity);
        }
    }
    @Override
    public void passDiagnostics() throws TransportTypeException{
        throw new TransportTypeException("Автобусы диагностику проходить не должны");
    }
    @Override
    public boolean isTypeOfTransportNeedsInspection() {
        return false;
    }
    @Override
    public String toString() {
        return "Автобус " + super.toString() +", " + passengerCapacity;
    }
}
