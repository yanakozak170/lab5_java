import java.util.*;
/**
 * Main class for managing coffee van operations.
 */
public class Main {
    public static void main(String[] args) {
        CoffeeVan van = new CoffeeVan(100); // 100 kg capacity

        try {

            van.addCoffee(new CoffeeBeans("Arabica Beans", 50.0, 20.0, 9.0));
            van.addCoffee(new GroundCoffee("Espresso Ground", 40.0, 15.0, 8.5));
            van.addCoffee(new InstantCoffee("Instant Classic", 30.0, 10.0, 7.5));
            van.addCoffee(new CoffeeBeans("Robusta Beans", 35.0, 25.0, 8.0));

            System.out.println("До сортування");
            System.out.println(van);


            van.sortCargoByPriceToWeightRatio();

            System.out.println("Після сортування за співвідношенням ціна-вага");
            System.out.println(van);


            double minQuality = 8.0;
            double maxQuality = 10.0;
            List<Coffee> qualityRange = van.findCoffeeByQualityRange(minQuality, maxQuality);

            System.out.println("Кава в діапазоні якості " + minQuality + " - " + maxQuality + ":");
            for (Coffee coffee : qualityRange) {
                System.out.println(coffee);
            }
        } catch (Exception e) {
            System.err.println("Помилка: " + e.getMessage());
        }
    }
}
