import java.lang.*;
import java.util.*;
class ConsecutiveDigitsDiff{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number..");
		String str=s.next();
		int l=str.length();
		int[] intArr=new int[l];
		int[] diff=new int[l];
		for(int i=0;i<l;i++){
			intArr[i]=Integer.parseInt(String.valueOf(str.charAt(i)));
		}
		System.out.println("\nDifference of consecutive digits..");
		for(int i=0;i<l-1;i++){
			diff[i]=intArr[i]-intArr[i+1];
			System.out.print(Math.abs(diff[i]));
		}System.out.print(intArr[l-1]);

	}
}