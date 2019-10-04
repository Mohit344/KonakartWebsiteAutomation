package com.konacart.dataprovider;

import java.io.IOException;
import java.util.Properties;

import com.konacart.constant.FileConstant;
import com.konacart.util.ReadPropertiesFile;

public class ValidatingData {
	
	static Properties Property;

	/**
	 * In this constructor, reading of property file is being done
	 */
	public ValidatingData() {
		try {
			// calling loadProperty method by giving file path to get property
			Property = ReadPropertiesFile.loadProperty(FileConstant.VALIDATION_FILE);
		} catch (IOException e) {
			e.getMessage();
		}
	}

	/**
	 * In this method, validation data from the property file is taken
	 * 
	 * @param key
	 */
	public static String getValidatingData(String key) {
		String value = Property.getProperty(key);
		return value;
	}

}
