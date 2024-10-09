package penta.java.collection;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		
		Map<Integer,String> map=new HashMap<Integer,String>();
		
		map.put(1, "Lewis");
		map.put(2, "Max");
		map.put(3, "Daniel");
		map.put(4, "Checo");
		map.put(5, "Charles");
		map.put(null, "Micheal");
		map.put(2, "Sainz");
		
		System.out.println(map);
		
		for(Map.Entry<Integer, String> entry:map.entrySet())
		{
			System.out.println("Key : "+entry.getKey()+""
					+ " Value : "+entry.getValue());
		}

	}

}
