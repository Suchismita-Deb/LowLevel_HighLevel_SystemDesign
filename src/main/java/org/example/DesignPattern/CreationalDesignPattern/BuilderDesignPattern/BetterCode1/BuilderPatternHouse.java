package org.example.DesignPattern.CreationalDesignPattern.BuilderDesignPattern.BetterCode1;

public class BuilderPatternHouse {
    public static void main(String[] args) {
        House house = new House.HouseBuilder("Concrete","Wood","Tile")
                .setGarage(true)
                .setSwimmingPool(true)
                .build();


        // The optional parameter can be set or not will not impact.
        // The setGarage(), setSwimmingPool() are all the method that are specifically mentioned with the HouseBuilder return type. The build is the last method in the chain and it should return the House.

        // The House constructor is not needed and there will be private constructor for the Builder to make the House.
        // The new House.HouseBuilder is made as the HouseBuilder is inside the House so to get the builder is by the main class.
        System.out.println(house);
    }

}
class House {
    private String foundation;
    private String name;
    private String structure;
    private String roof;


    // Optional Parameter.
    private boolean hasGarage;
    private boolean hasSwimmingPool;
    private boolean hasGarden;
    private House(HouseBuilder builder) {
        this.foundation = builder.foundation;
        this.name = builder.name;
        this.structure = builder.structure;

        this.roof = builder.roof;
        this.hasGarage = builder.hasGarage;
        this.hasSwimmingPool = builder.hasSwimmingPool;
    }

    @Override
    public String toString() {
        return "House{" +
                "foundation='" + foundation + '\'' +
                ", name='" + name + '\'' +
                ", structure='" + structure + '\'' +
                ", roof='" + roof + '\'' +
                ", hasGarage=" + hasGarage +
                ", hasSwimmingPool=" + hasSwimmingPool +
                ", hasGarden=" + hasGarden +
                '}';
    }

    // Static class. It will accessed by House.
    public static class HouseBuilder {
        private String foundation;
        private String name;
        private String structure;
        private String roof;

        // Optional Parameter.
        private boolean hasGarage;
        private boolean hasSwimmingPool;
        private boolean hasGarden;

        public HouseBuilder(String foundation, String structure, String roof) {

            // Mandatory Parameter.
            this.foundation = foundation;
            this.structure = structure;
            this.roof = roof;
        }

        public HouseBuilder setGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public HouseBuilder setSwimmingPool(boolean hasSwimmingPool) {
            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }

        public HouseBuilder setGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}


