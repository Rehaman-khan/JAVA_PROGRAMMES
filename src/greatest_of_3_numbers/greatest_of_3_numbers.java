package greatest_of_3_numbers;

public class greatest_of_3_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1=100,num2=50,num3=150;
if((num1>=num2)&&(num1>=num3)) {
	System.out.println(num1 + "is the greatest");
}
else if((num2>=num1)&&(num2>=num3)) {
	System.out.println(num2 + "is the greatest");
}
else  {
	System.out.println(num3 +" "+ "is the greatest");
}
	}

}
