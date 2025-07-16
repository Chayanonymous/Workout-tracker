import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ExersiceRecorder {
	
	public static void writeToFile(List<Exersice> workouts) {
		FileWriter fWriter = null;
		try {
			fWriter = new FileWriter("workout_recorder.txt",true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try(BufferedWriter writer = new BufferedWriter(fWriter)){
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
