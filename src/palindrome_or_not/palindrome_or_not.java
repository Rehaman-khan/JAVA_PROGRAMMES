package palindrome_or_not;

public class palindrome_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=121,reverse=0,rem,temp;
		 temp=num;
		while(temp!=0) {
			rem=temp%10;
			reverse=reverse*10+rem;
			temp/=10;
		}
		if(num==reverse) {
			System.out.println(num + "the number is palindrome" );
		}
		else {
			System.out.println(num + "the number is not a  palindrome" );
		}

	}

}
