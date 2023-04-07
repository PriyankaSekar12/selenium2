package selenium1;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Executeall {


	public static void main(String[] args) {
		Result r = JUnitCore.runClasses(A.class,B.class);
		System.out.println("Failure Count" +r.getFailureCount());
		System.out.println("Run Count" +r.getRunCount());
		System.out.println("Ignore Count" +r.getIgnoreCount());
		 int passcount =  r.getRunCount()-r.getFailureCount();
		 System.out.println("Pass Count" +passcount);
		 List<Failure> failures = r.getFailures();
		 for (Failure failure : failures) {
			 System.out.println(failure);
				
		 }
			
		
		

	}

}
