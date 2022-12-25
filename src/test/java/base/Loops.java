package base;

import java.util.ArrayList;

public class Loops {

	public static void main(String[] args) {

		//String []arr= {"monitor","printer","key", "glasses", "toshiba"};
		
		ArrayList<String> stock= new ArrayList<String>();
		stock.add("Toshiba");
		stock.add("Dell");
		stock.add("Keyboard");
		
		stock.remove(1);
		
		for(String instock:stock) {
			System.out.println(instock);
		}
		
		ArrayList items= new ArrayList();
		items.add("mouse");
		items.add(45);
		items.add(34.5);
		
		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		
		
	}

}
