package DataStructure;
/*
* Write a program which takes an integer and returns the integer corresponding to the degits of the input written in reverse order. For example 245 is 542, and 45 is 54.
* */
public class ReverseDigits {

	public int reverse(int num){
		int revNum = 0; 
		int reminder = 0; 
		while(num != 0){
			reminder = num%10;
			num = num/10;
			revNum = revNum * 10 + reminder;
		}
		return revNum;
	}
	public static void main(String args[])	{
		int inputNum = 3124;
		ReverseDigits reverseDigits = new ReverseDigits();
		System.out.println("ReverseDigits");
		System.out.println("input number: " + inputNum);
		System.out.println("ReverseDigits: " + reverseDigits.reverse(inputNum));
	}
}