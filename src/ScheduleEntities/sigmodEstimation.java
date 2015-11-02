package ScheduleEntities;

import java.util.Random;

/**
 * Created by windows on 10/31/2015.
 */
public class sigmodEstimation extends Estimation{


    public void EstimateSchedule(Schedule s) {
        double time=this.Estimate_Schedule_Time(s);
        double price=this.Estimate_Schedule_Money(s);
        s.setPrice(price);
        s.setTime(time);


    }

  //so far set random numbers between 0-10
    public float Estimate_Schedule_Time(Schedule s) {



        float minX = 0.0f;
        float maxX = 10.0f;

        Random rand = new Random();

        float time= rand.nextFloat() * (maxX - minX) + minX;

        return time;
    }

    //so far set random numbers between 0-10
    public float Estimate_Schedule_Money(Schedule s) {

        float minX = 0.0f;
        float maxX = 10.0f;

        Random rand = new Random();

        float money= rand.nextFloat() * (maxX - minX) + minX;

        return money;
    }


}
