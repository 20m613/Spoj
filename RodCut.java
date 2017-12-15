package spoj;
import java.util.*;
public class RodCut {
	public static void main(String[] args){
		int length;
		Scanner sc=new Scanner(System.in);
		length=sc.nextInt();
		int cutArray[]=new int[length+1];
		int i=1;
		int lookUp[]=new int[length+1];
		for(;i<=length;){
			cutArray[i]=sc.nextInt();
			lookUp[i++]=-1;
		}
		int max=getMaxSellingPrice(cutArray,lookUp,0,length-1);
		System.out.println("Max:  "+max);
	}
	private static int getMaxSellingPrice(int[] cutArray,int[] lookUp,int start,int end){
		if(start==end)
			return cutArray[1];
		//DP memoization
		if(lookUp[end-start+1]>0){
			int index=end-start+1;
			System.out.println("return from lookUp["+index+"]:  "+lookUp[index]);
			return lookUp[end-start+1];
		}
		int mid=(start+end)/2;
		int left=getMaxSellingPrice(cutArray,lookUp,start,mid);
		int index=mid-start+1;
		System.out.println("Storing lookUp["+index+"]:  "+left);
		lookUp[mid-start+1]=left;
		int right=getMaxSellingPrice(cutArray,lookUp,mid+1,end);
		//HaHa!!
		return (cutArray[end-start+1]>left+right?cutArray[end-start+1]:left+right);
		
//		int sum=left+right;
//		
//		int whole=end-start+1;
//		
//		if(cutArray[whole]>sum)
//			return cutArray[whole];
//		else 
//			return sum;
	}
}
