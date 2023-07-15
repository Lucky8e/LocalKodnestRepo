package FebArrayProgs;
import java.util.*;
public class swappingOFelements {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the length of the Array");
	int arr[]=new int[scan.nextInt()];
	System.out.println("Enter the Elements of the Array");
	for(int i=0;i<arr.length;i++) {
		System.out.println("Enter the elements for ["+i+"]");
		arr[i]=scan.nextInt();
	}
	System.out.println("The Array Elements before Swapping Are...");
	for(int i=0;i<arr.length;i++) {
    System.out.print(arr[i]+" ");
	}
	System.out.println();
	int temp;
	System.out.println("The Array Elements after Swapping in ascending order Are....");
	for (int i=0;i<arr.length;i++) {
		for (int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}}
		System.out.print(arr[i]+" ");
	}
	System.out.println(); 
	
	System.out.println("1st Smallest Element of the Array is : "+arr[0]);
	System.out.println("2nd Smallest Element of the Array is : "+arr[1]);
	System.out.println("1st largest Element of the Array is  : "+arr[arr.length-1]);
	System.out.println("2nd largest Element of the Array is  : "+arr[arr.length-2]);
}}
