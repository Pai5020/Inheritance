public class Vehicle {
    String make;
    String model;
    int year;

    public void feature(String Make, String Model, int Year ){
        make=Make;
        model=Model;
        year=Year;
    }
    public void start(){
        System.out.println("Vehicle has started");
    }
    public void stop(){
        System.out.println("Vehicle has stopped");
    }
}
