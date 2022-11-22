package Reverse_A_number;

public class Reverse_A_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=54321,reverse = 0,rem;
		while(num!=0) {
			rem=num%10;
			reverse=reverse*10+rem;
			num/=10;
		}
		System.out.println("the reverse number is :" + reverse);

	}

}
