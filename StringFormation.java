import java.util.*;
class StringFormation{
	public static String formString(ArrayList<String> obj){
		String formedStr="";
		Iterator<String> i=obj.iterator();
		while(i.hasNext()){
			String s=i.next();
			int l=s.length();
			char last=s.charAt(l-1);
			formedStr=formedStr+String.valueOf(last);
		}
		return formedStr;
	}
	public static void main(String[] args){
		ArrayList<String> obj=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements..");
		int n=sc.nextInt();
		String[] ele=new String[n];
		System.out.println("Enter "+n+" elements..");
		for(int i=0;i<n;i++){
			ele[i]=sc.next();
			obj.add(ele[i]);
		}
		String s=formString(obj);
		System.out.println("\nString formed by last characters.. "+s);

	}
}