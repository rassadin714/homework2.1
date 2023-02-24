package transport;
import java.util.List;
import java.util.Queue;

public class ServiceStation {
    private Queue<Transport> transportQueue;

    public ServiceStation(Queue<Transport> transportQueue) {
        this.transportQueue = transportQueue;
    }

    public Queue<Transport> getTransportQueue() {
        return transportQueue;
    }

    public void addTransportQueue (Transport<?> transport){
        if (transport.isTypeOfTransportNeedsInspection()) {
            transportQueue.offer(transport);
        }
    }

    public void addTransportListToQueue(List<Transport> list) {
        for (Transport element : list) {
            addTransportQueue(element);
        }
    }

    public void conductTechnicalInspection(){
        Transport transport;
        while ((transport=transportQueue.poll()) != null){
            System.out.println("Транспортное средство "+transport.getBrand() + " " + transport.getModel() + " прошло ТО");
        }


    }
}
