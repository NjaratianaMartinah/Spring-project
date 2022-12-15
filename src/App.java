import com.luv2code.springdemo.BaseballCoach;
import com.luv2code.springdemo.Coach;
import com.luv2code.springdemo.TrackCoach;

public class App {
    public static void main(String[] args) throws Exception {
        //create the object
        Coach theCoach = new TrackCoach();
        
        //use the object
        System.out.println(theCoach.getDailyWorkout());
    }
}
