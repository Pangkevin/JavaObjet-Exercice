

public class EE3_6 {
	public static int max(int[] array){
		int max = 0;
		for (int i=1; i < array.length; i++){
			if (array[i]>max) max = array[i];
		}
		return max;
	}
	

	public static void main(String[] args) {
		int[] divisors_counter  = new int[10001];
		for (int i=1;i<=10000;i++){
			for (int j=1;j<=i;j++){
				if (i%j==0) divisors_counter[i]=divisors_counter[i]+1;
			}
		}
		
		int max = max(divisors_counter);
		
		System.out.println("Among integers between 1 and 10000,");
		System.out.println("The maximum number of divisors was "+max);
		System.out.println("Numbers with that many divisors include:");
		for (int i=1; i <=10000; i++){
			if (divisors_counter[i]==max) System.out.println(i);
		}		
	}

}
