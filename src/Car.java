public class Car extends Vehicle{
    int ws;
    public  void carf(String Make, String Model, int Year, int Ws){
       this.make= Make;
       this.model= Model;
       this.year = year;
       this.ws = Ws;
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
    public int getWs() {
        return ws;
    }

}
