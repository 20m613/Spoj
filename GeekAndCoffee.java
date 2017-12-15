package spoj;
import java.util.*;
import java.lang.*;
import java.io.*;

public class GeekAndCoffee {
	public static void main (String[] args) {
		long t,m,n;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		while(--t>=0){
		    n=sc.nextInt();
		    m=sc.nextInt();
		    System.out.println(n>>(m-1));
		}	
	}
}
