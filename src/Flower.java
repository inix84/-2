import java.text.DecimalFormat;

public class Flower {
    private final String flowerName;
    private final String country;
    private final double cost; // на вывод DecimalFormat
    private int lifeSpan;
    String costFormat;

    Flower(String flowerName, String country, double cost, int lifeSpan) {
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
        if (lifeSpan > 0) {
            this.lifeSpan = lifeSpan;
        } else {
            this.lifeSpan = 3;
        }
    }
        Flower (String flowerName, String country, double cost){
            this(flowerName, country, cost, 3);
        }
        @Override
        public String toString () {
            costFormat = new DecimalFormat("00.00").format(cost);
            return "Цветок " +
                    "с названием " + flowerName + ", " +
                    "из страны " + country + ", " +
                    "стоимостью за 1 шт. - " + costFormat + " рублей, " +
                    "срок стояния " + lifeSpan + " дней.";
        }
    }
