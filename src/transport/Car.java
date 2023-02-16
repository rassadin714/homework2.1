package transport;

public class Car extends Transport<DriverB> {
    private CarBody carBody;
    private final Type car = Type.CAR;
    public Car(String brand, String model, double engineVolume, DriverB driver, CarBody carBody) {
        super(brand, model, engineVolume, driver);
        this.carBody = carBody;
    }

    public Type getType() {
        return car;
    }

    @Override
    public void printType() {
        if (carBody == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Автомобиль " + getBrand() + " " + getModel() + " " + carBody);
        }
    }

    public CarBody getCarBody() {
        return carBody;
    }

    public void setCarBody(CarBody carBody) {
        this.carBody = carBody;
    }

    @Override
    public void startMoving() {
        System.out.println("Автомобиль " + getBrand() + " начал движение");
    }
    @Override
    public void finishMoving() {
        System.out.println("Автомобиль " + getBrand() + " закончил движение");
    }
    @Override
    public void pitStop() {
        System.out.println("Автомобиль " + getBrand() + " пит - стоп");
    }
    @Override
    public void bestLapTime() {
        System.out.println("Автомобиль " + getBrand() + " лучшее время круга ");
    }
    @Override
    public void maxSpeed() {
        System.out.println("Автомобиль " + getBrand() + " максимальная скорость");
    }
    @Override
    public String toString() {
        return "Автомобиль " + super.toString() + ", " + carBody;
    }
}