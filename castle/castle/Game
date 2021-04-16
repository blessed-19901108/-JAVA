package castle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Game {
	private Room currentRoom;
    private HashMap<String,Handler> handlers = new HashMap<String,Handler>();//保存字符串和Handler对象的对应关系
    ArrayList<Room> rooms = new ArrayList<Room>();
	
	
    public Game() 
    {
    	handlers.put("bye", new HandlerBye(this));//把this传过去即把这个game对象传过去了，如果只有new HandlerBye()就会显示错误表示没有被定义，因为构造函数中有参数
    	handlers.put("help",new HandlerHelp(this));
    	handlers.put("go", new HandlerGo(this));
        createRooms();
    }
    
//  使help的输出内容与help的输出函数无关
    public String getcmd()
    {
    	StringBuffer sb = new StringBuffer();
    	for(String cmds:handlers.keySet())
    	{
    		sb.append(cmds);
    		sb.append(' ');
    	}
    	return sb.toString();
    }
    
    private void createRooms()
    {
//    	写这个方便复制粘贴  
    	String[] dir = {"north","east","south","west","up","down"};
      
//		制造房间
    	Room outside, lobby, pub, study, bedroom;
        outside = new Room("城堡外");
        lobby = new Room("大堂");
        pub = new Room("小酒吧");
        study = new Room("书房");
        bedroom = new Room("卧室");
        
//		初始化房间的出口
        outside.setExit(dir[1], lobby);
        outside.setExit(dir[2], study);
        outside.setExit(dir[3],pub);
        lobby.setExit(dir[3],outside);
        pub.setExit(dir[1], outside);
        study.setExit(dir[0], outside);
        study.setExit(dir[1], bedroom);
        bedroom.setExit(dir[3], study);
        lobby.setExit(dir[4], pub);
        pub.setExit(dir[5], lobby);
        
//      把创建的房间加入容器rooms
        rooms.add(lobby);
        rooms.add(study);
        rooms.add(pub);
        rooms.add(outside);
        rooms.add(bedroom); 

        
        currentRoom = outside;  //	从城堡门外开始
    }

    
//	显示欢迎
    private void printWelcome() {
        System.out.println();
        System.out.println("欢迎来到城堡！");
        System.out.println("这是一个超级无聊的游戏。");
        System.out.println("如果需要帮助，请输入 'help' 。");
        System.out.println();
        showPrompt();
       
    }

 


//	玩家输入一个方向，判断那个方向上有没有东西
    public void goRoom(String direction) //handlergo实际是在这里操作的
    {
        Room nextRoom = currentRoom.getExit(direction);

        if (nextRoom == null) {
            System.out.println("那里没有门！");
        }
        else {
            currentRoom = nextRoom;
            showPrompt();
        }
    }
    
//	展现提示
    public void showPrompt()
    {
    	 System.out.println("现在你在" + currentRoom);
         System.out.print("出口有：");
         System.out.print(currentRoom.getExitDesc());
         System.out.println();	
    }
   
    
//	任意门1:一个房间的6个门，每次进入到随机的门
    public void goRandom()
    {
    	String[] dir= {"north","east","south","west","up","down"};//定义6个方向
		int a=(int)(Math.random()*4);//产生随机数0~3		
		Room nextRoom=currentRoom.getExit(dir[a]);//随机传入一个方向
		if (nextRoom == null) {
            System.out.println("那里没有门！");
        }
        else {
            currentRoom = nextRoom;
            showPrompt();
        }		
    }
    
    
//	任意门2:从outside出发，每次进入到一个随机房间
//	public void goRandom()
//	{
//		int a=(int) (Math.random()*5);//产生随机数0~4
//		currentRoom = rooms.get(a);//进入任意一个房间
//        showPrompt();
//	}

    
	public void play()//有了Handler系列的类和与Handler有关的键值对后，play()就可以适应任何命令，以后如果想要加入新的命令也只要加入Handler系列的类和与Handler有关的键值对中即可-->可扩展性
	{
		Scanner in = new Scanner(System.in);
		while ( true ) {
    		String line = in.nextLine();
    		String[] words = line.split(" ");
//    		if(words[0].equals(bye)){}; 增加了例外，但我们的一切应该在框架里面完成
    		
//    		words[0]是"go"或"help"或"bye",handlers是一个键值对，get(key)是获得key对应的value;这里的handlers的value都是handler的子类型;向上造型是安全的
//    		当使用handler这个变量的时候是看它的实际对象是什么，而不是看它的类型
    		Handler handler = handlers.get(words[0]);
    		String value = "";
    		if(words.length>1)//判断是否是bye，提前将value初始化为空字符串这样就算传过去也无害
    			value = words[1];
    		if(handler != null)
    		{
    			handler.doCmd(value);

    			if(handler.isBye())
    				break;
    		}
//    		if ( words[0].equals("help") ) {
//    			printHelp();
//    		} else if (words[0].equals("go") ) {
//    			goRoom(words[1]);
//    		} else if ( words[0].equals("bye") ) {
//    			break;
//    		}
		}
		in.close();
	}
    
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Game game = new Game();
		game.createRooms();
		game.printWelcome();
		game.play();
        
        System.out.println("感谢您的光临。再见！");
        in.close();
	}

}
