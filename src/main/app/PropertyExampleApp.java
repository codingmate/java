package main.app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyExampleApp {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Properties prop = new Properties();
		prop.load(new FileInputStream("src\\main\\properties\\kor_message.properties"));
		System.out.println(prop.getProperty("greet")); // 안녕하세요
		System.out.println(prop.getProperty("thanks")); // 감사합니다.
	}
}
