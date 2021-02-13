package org.program;

public class Program {
	public static void main(String[] args) {
		int a=10,b=20;
		System.out.println("Before Swapping A value is:" +a);
		System.out.println("Before Swapping B value is:" +b);
		System.out.println("*******************************");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping A value is:" +a);
		System.out.println("After Swapping B value is:" +b);
}
}