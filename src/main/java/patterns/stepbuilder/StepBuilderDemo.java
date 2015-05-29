package patterns.stepbuilder;

public class StepBuilderDemo {
    public static void main(String[] args) {
        final Pizza pizza = PizzaStepBuilder.newBuilder()
                .pizzaCalled("New Pizza")
                .doughType("thin")
                .meat("pork")
                .withCheese("brie")
                .addVegetable("onions")
                .addVegetable("garlic")
                .noVegetablesPlease()
                .build();

        System.out.println(pizza);
    }
}
