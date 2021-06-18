package world;
import java.util.*;

public class ListManager1 {
	static List<String> getArrayList(String[] str)
	{
		List l1 = Arrays.asList(str);
		Collections.sort(l1);
		return l1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str=new String[] {"Ani", "Sam", "Joe","Ashok","Coforge","A"};
		System.out.println(getArrayList(str));

	}


}
