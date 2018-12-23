package sww;

import java.util.ArrayList;
import java.util.Scanner;

public class ItemService {
	static ArrayList<LostItem> itemslist = new ArrayList<LostItem>();
	public void add ()
	{
		LostItem tmp = new LostItem();
		Scanner input = new Scanner(System.in);
		System.out.println("add new item...");
		System.out.println("Enter its Name : ");
		tmp.setname(input.nextLine());
		System.out.println("Enter its id : ");
		tmp.setID(input.nextInt());
		itemslist.add(tmp);
		for (int i=0 ; i<itemslist.size() ; i++)
		{
			System.out.println(itemslist.get(i).getname() +""+itemslist.get(i).getID());
		}
	}

public void search() {
	int id1 ;
	LostItem tmp1 = new LostItem();
	Scanner input = new Scanner(System.in);
	System.out.println("enter the id.. ");
	id1=input.nextInt();
	for (int i=0 ; i<itemslist.size() ; i++)
	{
		if (itemslist.get(id1).getID().equals(itemslist.get(i).getID()))
		{
			System.out.println(itemslist.get(i).getID());
		}
		else
		{
			System.out.println("not found");
		}
	}
}
}