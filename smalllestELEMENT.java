package FebArrayProgs;
import java.util.*;
public class smalllestELEMENT {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Entere the length of the Array");
	int arr[]=new int[scan.nextInt()];
	System.out.println("Entere the Elements of the Array");
	for(int i=0;i<arr.length;i++) {
		System.out.println("Enter the elements for ["+i+"]");
		arr[i]=scan.nextInt();
	}
	System.out.println("The Array Elements Are...");
	for(int i=0;i<arr.length;i++) {
    System.out.print(arr[i]+" ");
	}
	System.out.println();
	int smallest=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(smallest>arr[i]) {
			smallest=arr[i];
		}
	}
	System.out.println("The Smallest value of the Array is :"+smallest);
}}
