package patterns.builder;

/**
 * Created by student on 5/28/2015.
 */
public class PizzaBuilderTest {
    public static void main(String[] args) {
        final Pizza pizza = new Pizza.Builder()
                .setName("Capriciosa")
                .setMeatType("Pork")
                .setCheeseType("Brie")
                .setSauceType("Garlic")
                .setSize(3)
                .build();

        System.out.println(pizza);
    }
}
