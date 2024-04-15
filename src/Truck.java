public class Truck extends Vehicle{
    public void run(){
        System.out.println("The truck carries load");
    }
    public void Tfeature(String Make, String Model,int Year){
        this.make= Make;
        this.model= Model;
        this.year= Year;

    }
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}
