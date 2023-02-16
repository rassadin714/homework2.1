package transport;

public enum LoadCapacity {
    N1(null, 3.5F),
    N2(3.5F, 12F),
    N3(12F, null);
    private Float lowerBound;
    private Float upperBound;

    LoadCapacity(Float lowerBound, Float upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    @Override
    public String toString() {
        if (lowerBound == null) {
            return "Грузоподъемность до " + upperBound + " тонн";
        } else if (upperBound == null){
            return "Грузоподъемность от " + lowerBound + " тонн";
        } else {
            return "Грузоподъемность от " + lowerBound + " тонн до " + upperBound +" тонн";
        }
    }
}
