package ListPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Object[] arr = { 1, 3, 4, "Swapnil", 0.0800 };
//		
//		for(Object a:arr) {
//			System.out.println(a);
//			
//		}

		ArrayList<Integer> arrayList = new ArrayList<>();

		// Adding elements to the ArrayList
		for (int i = 0; i < 15; i++) {
			arrayList.add(i);
		}

		// Displaying the size, capacity, and elements of the ArrayList
//		System.out.println("Size: " + arrayList.size());
//		System.out.println("Capacity: " + getCapacity(arrayList));
//		System.out.println("Elements: " + arrayList);

		
		
		Stack<Integer> stck = new Stack<Integer>();
		stck.add(10);
		stck.add(11);
		stck.add(12);
		stck.add(13);
		System.out.println(stck);
		stck.push(9);
		System.out.println(stck);

		System.out.println(stck.peek());
		System.out.println(stck.pop());
		System.out.println(stck);
		System.out.println(stck.isEmpty());



Vector<Integer> vctr = new Vector<Integer>();
vctr.add(10);
vctr.add(10);
vctr.add(10);
vctr.add(10);
vctr.add(10);
vctr.add(10);
vctr.add(10);
vctr.add(10);
vctr.add(10);
vctr.add(10);
//vctr.add(10);

//vctr.add(10);
vctr.ensureCapacity(47);

System.out.println(vctr.capacity());;

		


	}

	// Helper method to get the capacity of the ArrayList using reflection
	private static int getCapacity(ArrayList<?> arrayList) {
		try {
			java.lang.reflect.Field elementDataField = ArrayList.class.getDeclaredField("elementData");
			elementDataField.setAccessible(true);
			Object[] elementData = (Object[]) elementDataField.get(arrayList);
			return elementData == null ? 0 : elementData.length;
		} catch (NoSuchFieldException | IllegalAccessException e) {
			e.printStackTrace();
			return -1;
		}

	}

}
