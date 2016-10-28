package arrays;

public class question {
	public static void main(String[] args){
	    String[] letters = {"A","C","B"};
	    String[] numbers = {"3","1","2"};
	    for(int j=0; j<6; j+=2){
	        for(String l : letters){
	            System.out.print(l+numbers[j%3]);
	        }
	    }
	}

}
