package dome;

import java.util.ArrayList;

import dome.Datebase;

public class Datebase {
	private ArrayList<Item> listItem = new ArrayList<Item>();
	
	public void add(Item item)
	{
		listItem.add(item);
	}
	
	public void list()
	{
		for(Item item:listItem)
		{
			item.println();
		}
	}
	

	@Override
	public String toString() {
		return "Datebase [listItem=" + listItem + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Datebase db = new Datebase();
		db.add(new CD("abc",4,"123","...",4));
		db.add(new CD("abc",4,"123","...",4));
		db.add(new DVD("awwer",4,"123","..."));
		db.list();
		System.out.println(db);
	}

}
