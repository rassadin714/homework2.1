package transport;

public enum PassengerCapacity {
    EXTRA_SMALL(null,10),
    SMALL(10,25),
    MEDIUM(25,50),
    LARGE(50,80),
    EXTRA_LARGE(80,120);
    private Integer lowerBound;
    private Integer upperBound;

    PassengerCapacity(Integer lowerBound, Integer upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }
    @Override
    public String toString() {
        if (lowerBound == null) {
            return "Вместимость: до " + upperBound + " мест";
        } else {
            return "Вместимость: " + lowerBound + " - " + upperBound +" мест";
        }
    }
}
