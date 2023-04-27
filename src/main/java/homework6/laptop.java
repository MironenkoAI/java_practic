package homework6;

public class laptop {
    String brand;
    private final String model;
    Double diagonal;
    String screenResolution;
    String processor;
    Integer RAM;
    String OS;
    String country;
    Integer warranty;

    public laptop(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public String getScreenResolution() {
        return screenResolution;
    }

    public String getProcessor() {
        return processor;
    }

    public Integer getRAM() {
        return RAM;
    }

    public String getOS() {
        return OS;
    }

    public String getCountry() {
        return country;
    }

    public Integer getWarranty() {
        return warranty;
    }

    public String toString() {
        return String.format("Ноутбук %s %s%n" +
                        "Диагональ: %s\"%n" +
                        "Разрешение экрана: %s%n" +
                        "Процессор: %s%n" +
                        "Оперативная память: %s ГБ%n" +
                        "Операционная система: %s%n" +
                        "Страна производства: %s%n" +
                        "Гарантия: %s мес.%n",
                brand, model, diagonal, screenResolution, processor, RAM, OS, country, warranty);
    }
}

