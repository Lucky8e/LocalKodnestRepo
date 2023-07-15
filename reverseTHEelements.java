package FebArrayProgs;
import java.util.*;
public class reverseTHEelements {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Entere the length of the Array");
	int arr[]=new int[scan.nextInt()];
	//Taking Elements for the Array
	System.out.println("Entere the Elements of the Array");
	for(int i=0;i<arr.length;i++) {
		System.out.println("Enter the elements for ["+i+"]");
		arr[i]=scan.nextInt();
	}
	System.out.println("The Array Elements before Reversing Are...");
	for(int i=0;i<arr.length;i++) {
    System.out.print(arr[i]+" ");
	}
	System.out.println();
	System.out.println("The Array Elements after Reversing Are...");
	for(int i=arr.length-1;i>=0;i--) {
		System.out.print(arr[i]+" ");
	}
}}
