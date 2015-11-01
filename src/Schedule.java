/**
 * Created by chenxiao on 10/28/2015.
 */
public class Schedule {

    private double time;
    private double price;

    public void setTime(double time) {
        this.time = time;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public double getPrice() {
        return price;
    }

    public double getTime() {
        return time;
    }

    public String toString() {
        return "Time: " + getTime() + ", Money: " + getPrice();
    }

    //    public Schedule(double time,double price){
//        this.price=price;
//        this.time=time;
//
//
//    }
//    public Schedule(){
//
//    }

}
