/**
 * Created by slc on 10/30/15.
 */
import java.util.List;
public class Container {
    public int containerID;
    public double unitPrice;
    public Container(){

    }
    public Container(double price){
        this.unitPrice=price;
    }
    private List<Operator> operatorsList;
    public List<Operator> getOperatorsList(){

        return this.operatorsList;
    }

}
