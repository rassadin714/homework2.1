package transport;
import java.util.List;

public abstract class Transport<T extends Driver> implements Competing {
    private final String brand;
    private final String model;
    private double engineVolume;
    private T driver;
    private List<Mechanic> mechanics;

    public Transport(String brand, String model, double engineVolume, T driver, List<Mechanic> mechanics){
        this.brand = (brand == null || brand.isEmpty()) ? "default" : brand;
        this.model = (model == null || model.isEmpty()) ? "default" : model;
        setEngineVolume(engineVolume);
        setDriver(driver);
        this.mechanics = mechanics;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume <=0 ? 1.5 : engineVolume;
    }

    public T getDriver() {
        return driver;
    }
    public void setDriver(T driver) {
        this.driver = driver;
    }
    public List<Mechanic> getMechanics() {
        return mechanics;
    }
    public void setMechanics(List<Mechanic> mechanics) {
        this.mechanics = mechanics;
    }
    public Transport checkTypeOfTransport(){
        if ( getType() != Type.BUS){
            return this;
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Марка "+ brand + ", модель " + model + ", мощность двигателя " + engineVolume + " л" ;
    }

    public abstract void startMoving();
    public abstract void finishMoving();
    public abstract Type getType();
    public abstract void printType();
    public abstract void passDiagnostics() throws TransportTypeException;
}
