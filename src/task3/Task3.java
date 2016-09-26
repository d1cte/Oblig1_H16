package task3;

public class Task3 {
	public static <E extends Comparable<E>> E min(E[] list) {
		if(list == null)  
			throw new IllegalArgumentException("List is null");
		else if(list.length == 0)
			throw new IllegalArgumentException("List is empty");
		
		int currentMin = 0; 
		if(list.length > 1)
			for(int i = 1; i < list.length; i++) {
				if(list[currentMin] == null 
						|| (list[i] != null && list[currentMin].compareTo(list[i]) > 0)) 
					currentMin = i;  
			}
		return list[currentMin];        
	}       
} 
 