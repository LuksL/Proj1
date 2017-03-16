package pk1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hi"+new Date());
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss a");
		System.out.println(sdf.format(new Date()));
		
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("hi");
		boolean isfind = arrayList.contains("Hi");
		if (isfind){
			System.out.println("find ");
		}else {
			System.out.println("not find ");
		}
		}
			
	}


