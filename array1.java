package world;
import java.util.*;
import java.util.Scanner;

public class array1 {
		 public static void main(String args[])
		 {
		 	Scanner kb= new Scanner(System.in);
		 	System.out.println("enter the no. of elements");
		 	int n = kb.nextInt();
		 	int arr[]=new int [n];
		 	for(int i=0;i<n;i++)
		 	{
		 		arr[i]=kb.nextInt();
		 	}
		 	for(int i=0;i<n;i++)
		 	{
		 		System.out.println( arr[i]);
		 		
		 	}
		 }
		 }
