package ocastle;

public class oRoom {
    public String description;
    public oRoom northExit;   //链表的结构，当需要在磁盘上开辟新的存储空间时，那个空间存放的仍是oroom类的对象，将这个对象(地址)赋值给northExit
    public oRoom southExit;	  //用四个成员变量来表达四个方向上对应的房间，但方向和room本身还有关系
    public oRoom eastExit;
    public oRoom westExit;

    //读入方向 其实就是房间名
    
    public oRoom(String description) 
    {
        this.description = description;
    }

    //创建出口 出口也是一个房间，只不过这些房间和new oRoom都有关系 		north边有什么，south边有什么...
    public void setExits(oRoom north, oRoom east, oRoom south, oRoom west) 
    {
        if(north != null)
            northExit = north;
        if(east != null)
            eastExit = east;
        if(south != null)
            southExit = south;
        if(west != null)
            westExit = west;
    }

    @Override
    public String toString()  //toString 是输出对象（字符串），本来是object类自带的；这里是子类函数重载，如果要输出对象，就会输出对象的名字
    {
        return description;
    }
}

