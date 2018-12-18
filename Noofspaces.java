package assignmts;

import java.util.Scanner;

public class Noofspaces 
{
	public static void main(String[] args){count();}
	
	public static void count()
	 {
		Scanner scn = new Scanner(System.in);
        System.out.print("Enter User Text: ");
    	String text = scn.nextLine();
		String data[];int k=0;
	        data=text.split("");
	        for(int i=0;i<data.length;i++)
	        {
	            if(data[i].equals(" "))
	                k++;
            }
	        System.out.println(k);
	  }
}
	 
	                    