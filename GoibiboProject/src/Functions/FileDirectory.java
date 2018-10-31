package Functions;

import java.io.File;

public class FileDirectory {

	public static void Directory()  {
		
		// new directory
				new File("E:\\SELENIUM_JAVA\\GoibiboProject\\").mkdirs();
				File theDir = new File("TextFiles");

				// if the directory does not exist, create it
				if (!theDir.exists()) {
					
					System.out.println("Creating directory: " + theDir.getName());
					boolean result = false;

					try {
						theDir.mkdir();
						result = true;
						
					} catch (SecurityException se) {
						// handle it
					}
					if (result) {
						System.out.println("****************DIRECTORY CREATED************************");
					}
						
				}

	}

}
