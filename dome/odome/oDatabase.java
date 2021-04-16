package odome;

import java.util.ArrayList;

public class oDatabase {
	private ArrayList<oCD> listCD = new ArrayList<oCD>();  //容器类-->ArrayList(容器的类型)、oCD放入容器的元素的类型
	private ArrayList<oDVD> listDVD = new ArrayList<oDVD>();  //ArrayList-->Array(数组)、List(有序集合);ArrayList属于collection(集合)

	public void add(oCD cd)
	{
		listCD.add(cd);
	}
	
	public void add(oDVD dvd)
	{
		listDVD.add(dvd);
	}
	
	public void list()
	{
		for(oCD cd:listCD)
		{
			cd.print();
		}
		for(oDVD dvd:listDVD)
		{
			dvd.print();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		oDatabase db = new oDatabase();
//		CD cd = new CD("def","def",4,60,"...");
//		db.add(cd); //下面只是把新建放在函数里边了
		db.add(new oCD("abc","abc",4,60,"...")); //匿名对象
		db.add(new oCD("def","def",4,60,"..."));
		db.add(new oDVD("xxx","aaa",60,"..."));
		db.list();
	}

}
