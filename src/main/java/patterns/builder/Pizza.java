package patterns.builder;

/**
 * Created by student on 5/28/2015.
 */
public class Pizza {

    private String name;
    private String meatType;
    private String cheeseType;
    private String sauceType;
    private int size;

    public Pizza(Builder builder) {
        this.name = builder.name;
        this.meatType = builder.meatType;
        this.cheeseType = builder.cheeseType;
        this.sauceType = builder.sauceType;
        this.size = builder.size;
    }

    public String getName() {
        return name;
    }

    public String getMeatType() {
        return meatType;
    }

    public String getCheeseType() {
        return cheeseType;
    }

    public String getSauceType() {
        return sauceType;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString(){
        return this.name + " | " + this.meatType + " | "
                + this.cheeseType  + " | " + this.getSauceType()  + " | " + this.size;
    }

    public static class Builder{
        private String name;
        private String meatType;
        private String cheeseType;
        private String sauceType;
        private int size;

        public Builder setName(String name) {
            this.name = name;

            return this;
        }

        public Builder setMeatType(String meatType) {
            this.meatType = meatType;

            return this;
        }

        public Builder setCheeseType(String cheeseType) {
            this.cheeseType = cheeseType;

            return this;
        }

        public Builder setSauceType(String sauceType) {
            this.sauceType = sauceType;

            return this;
        }

        public Builder setSize(int size) {
            this.size = size;

            return this;
        }


        public Pizza build(){
            return new Pizza(this);
        }
    }
}
