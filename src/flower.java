import java.text.DecimalFormat;

public class flower {
    private final String flowerName;
    private final String country;
    private final double cost; // на вывод DecimalFormat
    private String lifeSpan;
    String cost1;
    flower (String flowerName, String country, double cost, String lifeSpan) {
        if (cost > 0) {
            this.cost = cost;
        } else {
            this.cost = 1;
        }
        if (flowerName != null && !flowerName.isEmpty() && !flowerName.isBlank()) {
            this.flowerName = flowerName;
        } else {
            this.flowerName = "Тип цветка не указан";
        }
        if (country != null && !country.isEmpty() && !country.isBlank()) {
            this.country = country;
        } else {
            this.country = "Россия";
        }
        if (lifeSpan != null && !lifeSpan.isEmpty() && !lifeSpan.isBlank()) {
            this.lifeSpan = lifeSpan;
        } else {
            this.lifeSpan = "3 дня";
        }
    }

    @Override
    public String toString() {
        cost1 = new DecimalFormat("00.00").format(cost);
        return "Цветок " +
                "с названием " + flowerName + ", " +
                "из страны " + country + ", " +
                "стоимостью за 1 шт. - " + cost1 + " рублей, "+
                "срок стояния " + lifeSpan + ".";
    }
}
