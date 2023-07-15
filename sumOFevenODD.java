package FebArrayProgs;
import java.util.*;
public class sumOFevenODD {
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
	int even=0;
	int odd=0;
	System.out.println();
	System.out.println("The Sum Array elements are");
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2==0) {
		even+=arr[i];
		}
 
	  else {
		odd+=arr[i];
		}}
	System.out.println(even);
	System.out.println(odd);
}
}

