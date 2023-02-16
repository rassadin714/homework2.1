package transport;

public enum CarBody {
    SEDAN("Седан"),
    HATCHBACK("Хетчбэк"),
    COUPE("Купе"),
    UNIVERSAL("Универсал"),
    SUV("Внедорожник"),
    CROSSOVER("Кроссовер"),
    PICKUP("Пикап"),
    VAN("Фургон"),
    MINIVAN("Минивэн");
    private String translation;

    CarBody(String translation) {
        this.translation = translation;
    }

    @Override
    public String toString() {
        return "Тип кузова " + translation;
    }
}
