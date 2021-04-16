package castle;

import java.util.HashMap;

public class Room {
    private String description;
    private HashMap<String,Room> exits = new HashMap<String,Room>();//出口方向和对应的房间一一对应
    
//  构造函数，初始化房间的名称
    public Room(String description) 
    {
        this.description = description;
    }

//  可以自由的增加方向和对应的房间
    public void setExit(String dir,Room room)
    {
    	exits.put(dir, room);
    }

//	覆盖object类的toString
    @Override
    public String toString()
    {
        return description;
    }
    
//	对房间的描述，说明有什么出口
    public String getExitDesc()
    {
    	StringBuffer sb = new StringBuffer();//可以修改的字符串,采用很多复杂的字符串操作去产生一个结果字符串-->StringBuffer
    	for(String dir:exits.keySet()) //对于在这个出口里面的每一个key都加到dir里边
    	{
    		sb.append(dir);
    		sb.append(' ');
    	}
    	return sb.toString();     //StringBuffer有toString方法  
//    	String ret = "";
//    	if(northExit != null)
//    		ret +="north";			//String是一个不可修改的对象，每一次加都会产生一个新的对象
//    	if(eastExit != null)
//    		ret +="east";
//    	if(westExit != null)
//    		ret +="west";
//    	if(southExit != null)
//    		ret +="south";
//    	return ret;
    		
    }
    
    //根据所传入的方位返回那个方位指的是什么   exits是个键值对，可以根据方位索引
    public Room getExit(String direction)//维持这个接口 但内部实现的方式可以有改变
    {
    	return exits.get(direction);
    }
    
}
