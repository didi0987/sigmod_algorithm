package Running;

import ScheduleEntities.Estimation;
import ScheduleEntities.Schedule;
import ScheduleEntities.sigmodEstimation;

public class Main {

    public static void main(String[] args) {

        Schedule s1=new Schedule();
        Estimation es=new sigmodEstimation();
        es.EstimateSchedule(s1);
        System.out.println(s1);
        System.out.println("Hello World!");


    }

}
