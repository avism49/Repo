package assignmts;

public class Nofspaces {

	public static void main(String[] args) {
		
		        String word = "im in miami trick";
		        String data[];int k=0;
		        data=word.split("");
		        for(int i=0;i<data.length;i++){
		            if(data[i].equals(" ")){
		                k++;
		            }

		        }
		        System.out.println(k);
	}

}
