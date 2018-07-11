package july10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigLoader {
	
	private static Properties prop;

	public static String getMyValue(String key) {
		// TODO Auto-generated method stub
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream("config2.properties");
			prop.load(fis);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = prop.getProperty(key);
		return value;
	}

}
