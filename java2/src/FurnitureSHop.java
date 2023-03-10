interface Furniture {
    void sitOn();
    void putOn();
}

class ModernChair implements Furniture {
    public void sitOn() { System.out.println("Sitting on a modern chair."); }
    public void putOn() {}
}

class ModernSofa implements Furniture {
    public void sitOn() { System.out.println("Sitting on a modern sofa."); }
    public void putOn() {}
}

class ModernCoffeeTable implements Furniture {
    public void sitOn() {}
    public void putOn() { System.out.println("Putting something on a modern coffee table."); }
}

class VictorianChair implements Furniture {
    public void sitOn() { System.out.println("Sitting on a Victorian chair."); }
    public void putOn() {}
}

class VictorianSofa implements Furniture {
    public void sitOn() { System.out.println("Sitting on a Victorian sofa."); }
    public void putOn() {}
}

class VictorianCoffeeTable implements Furniture {
    public void sitOn() {}
    public void putOn() { System.out.println("Putting something on a Victorian coffee table."); }
}

class ArtDecoChair implements Furniture {
    public void sitOn() { System.out.println("Sitting on an Art Deco chair."); }
    public void putOn() {}
}

class ArtDecoSofa implements Furniture {
    public void sitOn() { System.out.println("Sitting on an Art Deco sofa."); }
    public void putOn() {}
}

class ArtDecoCoffeeTable implements Furniture {
    public void sitOn() {}
    public void putOn() { System.out.println("Putting something on an Art Deco coffee table."); }
}

interface FurnitureFactory {
    Furniture createChair();
    Furniture createSofa();
    Furniture createCoffeeTable();
}

class ModernFurnitureFactory implements FurnitureFactory {
    public Furniture createChair() { return new ModernChair(); }
    public Furniture createSofa() { return new ModernSofa(); }
    public Furniture createCoffeeTable() { return new ModernCoffeeTable(); }
}

class VictorianFurnitureFactory implements FurnitureFactory {
    public Furniture createChair() { return new VictorianChair(); }
    public Furniture createSofa() { return new VictorianSofa(); }
    public Furniture createCoffeeTable() { return new VictorianCoffeeTable(); }
}

class ArtDecoFurnitureFactory implements FurnitureFactory {
    public Furniture createChair() { return new ArtDecoChair(); }
    public Furniture createSofa() { return new ArtDecoSofa(); }
    public Furniture createCoffeeTable() { return new ArtDecoCoffeeTable(); }
}

public class FurnitureSHop {
    private FurnitureFactory factory;

    public FurnitureSHop(FurnitureFactory factory) {
        this.factory = factory;
    }

    public void orderFurniture() {
        Furniture chair = factory.createChair();
        Furniture sofa = factory.createSofa();
        Furniture coffeeTable = factory.createCoffeeTable();

        chair.sitOn();
        sofa.sitOn();
        coffeeTable.putOn();
    }

    public static void main(String[] args) {
        FurnitureFactory factory = new ModernFurnitureFactory();
        FurnitureSHop shop = new FurnitureSHop(factory);
        shop.orderFurniture();
    }
}
