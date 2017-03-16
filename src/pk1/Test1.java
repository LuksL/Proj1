package pk1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hi"+new Date());
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss a");
		System.out.println(sdf.format(new Date()));
	}

}
