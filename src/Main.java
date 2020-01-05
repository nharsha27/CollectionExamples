import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// input: 1122555
		
		String input = "1122222233334";
		String[] val = input.split("");
		HashMap<String,String> counter = new HashMap<>();
		HashMap<String,Integer> counter1 = new HashMap<>();	
		for(int i = 0 ; i < val.length ; i++)
		{
			if(counter1.containsKey(val[i]))
			{
				// update the value
				counter1.put(val[i], counter1.get(val[i])+1);
			}
			else
			{
				counter1.put(val[i], 1);
			}
		}
		
		System.out.println(counter1);
		
	
	
	 Comparator<Entry<String, Integer>> valueComparator = new Comparator<Entry<String,Integer>>() {

         @Override
         public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2) {
             Integer v1 = e1.getValue();
             Integer v2 = e2.getValue();
             return v1.compareTo(v2);
         }
     };
     
     List<Entry<String, Integer>> listOfEntries = new ArrayList<Entry<String, Integer>>(counter1.entrySet());
     
     Collections.sort(listOfEntries, valueComparator);		 

 	
 	for (Entry<String, Integer> entry : listOfEntries) {
         {
         	for(int i = 0; i < entry.getValue() ; i++)
             System.out.print(entry.getKey());
         }
     }
 	
	}

	

}
