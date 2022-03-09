package commonPackage;

import java.util.HashMap;

import org.apache.commons.lang3.RandomStringUtils;

public class RestUtils {
	
	
	
	
	public static String personName() {
		
		String personName = RandomStringUtils.randomAlphabetic(1);
		return ("john" + personName);
		
	}
	

	public static String jobName() {
		
		String jobName = RandomStringUtils.randomAlphabetic(1);
		return ("john" + jobName);
		
	} 

}
