package spoj;
import java.util.*;

public class NSteps {
	public static void main(String[] args){
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		while(--t>=0){
			int ans=0;
			int x=sc.nextInt();
			int y=sc.nextInt();
			boolean no=false;
			int q=x/2;
			if(x!=y+2 && x!=y){
				ans=-1;
				no=true;
			}
			else if(x==y){
				ans=0;
				ans=ans+(x-q);
				ans=ans+(q*3);
			}
			else if(x==y+2){
				int temp=2;
				boolean flag;
				ans=2;
				flag=false;
				while(++temp<=x){
					if(flag){
						ans+=3;
						flag=false;
					}
					else{
						ans++;
						flag=true;
					}
				}
			}
			
			
			if(no)
				System.out.println("No Number");
			else
				System.out.println(ans);
			
			
//			boolean flag;
//			int ans=0;
//			int x=sc.nextInt();
//			int y=sc.nextInt();
//			if(x-y!=2 && x!=y)
//				ans=-1;
//			
//			else if(x==y){
//				int temp=0;
//				ans=0;
//				flag=false;
//				while(++temp<=x){
//					if(flag){
//						ans+=3;
//						flag=false;
//					}
//					else{
//						ans++;
//						flag=true;
//					}
//				}
//				
//			}
//			else if(x==y+2){
//				int temp=2;
//				ans=2;
//				flag=false;
//				while(++temp<=x){
//					if(flag){
//						ans+=3;
//						flag=false;
//					}
//					else{
//						ans++;
//						flag=true;
//					}
//				}
//			}
//			if(ans==-1)
//				System.out.println("No Number");
//			else
//				System.out.println(ans);
		}
	}
}
