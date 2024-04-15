public class Motorcycle extends Vehicle{
    String types;
    public void Mfeature(String Make, String Model, int Year, String types){
        this.types = types;
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
    public String getTypes() {
        return types;
    }
}
