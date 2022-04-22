package week1.day1;

public class FibonacciSeries {
	 public static void main(String[] args) {
	 int range =8;
	 int firstval=0;
	 int secval=1;
	 int sum = 0;
	 
	 System.out.println(firstval);
	 for(int i = 0; i<=range; i++) {
		 
	 sum = firstval +secval;
	 firstval = secval;
	 secval = sum;
	 System.out.println(sum);
	    }
}
	 }
