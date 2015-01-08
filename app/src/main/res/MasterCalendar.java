import java.io.Serializable;

/**
 * Created by jela on 1/7/15.
 */
public class MasterCalendar implements Serializable{

    private double height, weight;
    private String name= "";

    public MasterCalendar(double height, double weight, String name) {
        this.height = height;
        this.weight = weight;
        this.name = name;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height)
}
