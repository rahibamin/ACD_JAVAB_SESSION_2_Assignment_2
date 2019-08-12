import java.util.Scanner;

// Author Rahib Amin
// Session 2 Assignment 2

public class Diamond {

	public static void main(String[] args) {

		int n = 3;
		char [] list = {'a','b','c'};

	for (int i = 1; i <= n; i++) {
		for (int j = 1; j <= n - i; j++)

		{
			System.out.print(" ");
		}
	
		int count = 0;
		for (int j = 1; j <= i * 2 - 1; j++)

		{	
	
			System.out.print(list[count]);
			if (j <= (i * 2 - 1)/2) {
					count++;
				}
				else {
					count--;
				}
		}
		
		System.out.println();
	}
	
	for (int i = n - 1; i > 0; i--) {
		for (int j = 1; j <= n - i; j++)

		{
			System.out.print(" ");
		}	
		int count =0 ;
		for (int j = 1; j <= i * 2 - 1; j++)

		{
		
			System.out.print(list[count]);
		if (j <= (i * 2 - 1)/2) {
			count++;
		}
		else {
			count--;
		}}
			System.out.println();
		}

	}
}