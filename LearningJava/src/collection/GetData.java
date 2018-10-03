package collection;

import java.util.ArrayList;
import java.util.*;

public class GetData {
	
	ArrayList<PersonalInfo> list= new ArrayList<PersonalInfo>();
	

void getDataFromUser()
{
	int counter=0;
	System.out.println("Do you want to eter data (y\\n)");
	Scanner sc=new Scanner(System.in);
	String ans=sc.next();
	
	
	while (ans.equalsIgnoreCase("y")) {
		PersonalInfo p=new PersonalInfo();
		System.out.print("enter name of "+(++counter)+" student:");
		p.setName(sc.next());
		System.out.print("enter age of "+(counter)+" student:");
		p.setAge(sc.nextInt());
		System.out.print("enter roll no of "+(counter)+" student:");
		p.setRoll(sc.nextInt());
		list.add(p);
		System.out.println("Do you want to eter data (y\\n)");
		ans=sc.next();	
	}	
}
void viewData()
{
	Iterator itr=list.iterator();
	int counter1=0;
	while(itr.hasNext()) {
		PersonalInfo p=(PersonalInfo)itr.next();
		//p=itr.next();
		System.out.println(++counter1+"Student Data-Name:"+p.name+" Age:"+p.age+" Roll:"+p.roll);
		
	}
}
}
