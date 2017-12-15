package spoj;
import java.util.*;
public class Anarco9a {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str;
		str=sc.next();
		int test=1;
		while(str.charAt(0)!='-'){
			System.out.println((test++)+"."+invalidBraces(str));
			str=sc.next();
		}
	}

	public static int invalidBraces(String str){
		Stack<Integer> st=new Stack<Integer>();
		int length=str.length();
		int count=0;
		for(int i=0;i<length;i++){
			if(str.charAt(i)=='{'){
				st.push(0);
				count++;
			}
			else{
				if(st.isEmpty()){
					st.push(1);
					count++;
				}
				else{
					if(st.peek()==0){
						st.pop();
						count--;
					}
					else{
						st.push(1);
						count++;
					}
				}
			}
		}
		return count;
	}
}
