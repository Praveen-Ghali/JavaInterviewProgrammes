package com.practise.java;

public class ReverseInteger {

	public static void main(String[] args) {

		
int n = 121;
int temp =n;
int rev=0;
while (n>0) {
	int rem = n%10;
	rev = rev*10 + rem;
	n=n/10;
	
}

if (temp == rev) {
	System.out.println("It is a palindrome !");
} else {
	System.out.println("Its not a palindrome");
}
}

}
