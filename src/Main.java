public class Main {
    public static void main(String[] args) {
        Car C = new Car();
        C.carf("Toyota","Supra", 2019, 4);
        C.start();
        C.stop();
        System.out.println("Make : "+ C.getMake());
        System.out.println("Model: "+ C.getModel());
        System.out.println("Year: "+ C.getYear());
        System.out.println("Wheels: "+ C.getWs());

        Motorcycle M = new Motorcycle();
        M.Mfeature("Hero", "XXXXXX", 2021, "Sport");
        M.start();
        M.stop();
        System.out.println("Make : "+ M.getMake());
        System.out.println("Model: "+ M.getModel());
        System.out.println("Year: "+ M.getYear());
        System.out.println("Wheels: "+ M.getTypes());

        Truck T = new Truck();
        T.Tfeature("Scania", "Y222",2020);
        T.start();
        T.stop();
        System.out.println("Make : "+ T.getMake());
        System.out.println("Model: "+ T.getModel());
        System.out.println("Year: "+ T.getYear());
    }
}