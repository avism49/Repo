package exception;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class StmtJDBC {
	public static void main(String[] args) {
		List<Integer> x=new ArrayList<Integer>();
		x.add(10);
		x.add(13);
		x.add(12);
		x.add(11);
		Collections.sort(x);
		Collections.reverse(x);
		//x.set(0,9);
	    List<Integer> y=new ArrayList<Integer>();
		y.add(20);
		y.add(21);
		y.add(22);
		y.add(23);
		//shuffling
		Collections.shuffle(x);
		Collections.copy(x, y);
		x.addAll(1,y);
		System.out.println(x);
		System.out.println(x.get(1));
		List<Integer> sub_List = y.subList(0, 3);
		  System.out.println("List of first 2 ele " + sub_List);
		
		//list to array
		List<String> aa = new ArrayList<String>();
        aa.add("a");
        aa.add("b");
		String[] xxx = new String[aa.size()];
        aa.toArray(xxx);
        System.out.println(Arrays.toString(xxx));
        
        //array to list
        String[] array = {"a", "b"};
        List<String> yyy = Arrays.asList(array);

        System.out.println(yyy);

		    //List<Integer> y=Arrays.asList(20,21,22);
	//Collections.copy(x, y);
		// ArrayUtils.addAll(int[] x,int[] y);	
//		for(int i=0; i<x.size();i++ )
//{
//			
//         System.out.println(x.get(i));
//       }
//		
//        
//        	  }

		//System.out.println(x);	
//		System.out.println(x.get(1));

}}