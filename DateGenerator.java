import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
class DateGenerator{
	public static String getDate(String format){
		LocalDate today=LocalDate.now();
		
    	if(format.equals("dd-MM-yyyy")){
    		DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("dd-MM-yyyy");
    		String str1=today.format(dtf1);
    		return str1;
    	}
    	else if(format.equals("dd-MMM-yyyy")){
    		DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("dd-MMM-yyyy");
    		String str2=today.format(dtf2);
    		return str2;
    	}
    	else if(format.equals("dd-MM-yy")){
    		DateTimeFormatter dtf5=DateTimeFormatter.ofPattern("dd-MM-yy");
    		String str5=today.format(dtf5);
    		return str5;
    	}
    	else if(format.equals("dd/MM/yyyy")){
    		DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("dd/MM/yyyy");
    		String str3=today.format(dtf3);
    		return str3;
    	}
    	else if(format.equals("MM/dd/yyyy")){
    		DateTimeFormatter dtf4=DateTimeFormatter.ofPattern("MM/dd/yyyy");
    		String str4=today.format(dtf4);
    		return str4;
    	}
    	else if(format.equals("dd/MMM/yy")){
    		DateTimeFormatter dtf5=DateTimeFormatter.ofPattern("dd/MMM/yy");
    		String str5=today.format(dtf5);
    		return str5;
    	}
    	else if(format.equals("yyyy/MMM/dd")){
    		DateTimeFormatter dtf6=DateTimeFormatter.ofPattern("yyyy/MMM/dd");
    		String str6=today.format(dtf6);
    		return str6;
    	}
    	return "date";
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Type date format.. \n1)dd-MM-yyyy\n2)dd-MMM-yyyy\n3)dd-MM-yy\n4)MM/dd/yyyy\n5)dd/MM/yyyy\n6)dd/MMM/yy\n7)yyyy/MMM/dd\n");
		String f=s.next();
		String date=getDate(f);
		System.out.println("\n"+date);
	}
}