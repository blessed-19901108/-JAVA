package ocastle;

import java.util.Scanner;

public class oGame {
    private oRoom currentRoom;
        
    public oGame() 
    {
        createRooms();
    }

    private void createRooms()
    {
        oRoom outside, lobby, pub, study, bedroom;
      
        //	制造房间
        outside = new oRoom("城堡外");
        lobby = new oRoom("大堂");
        pub = new oRoom("小酒吧");
        study = new oRoom("书房");
        bedroom = new oRoom("卧室");
        
        //	初始化房间的出口    这一步传参数也就确定了currentRoom与currentRoom.northExit当作字符串输出的时候内容是不同的；这一步规定了哪些房间的哪个出口链接的是那个房间
        outside.setExits(null, lobby, study, pub);
        lobby.setExits(null, null, null, outside);
        pub.setExits(null, outside, null, null);
        study.setExits(outside, bedroom, null, null);
        bedroom.setExits(null, null, null, study);

        currentRoom = outside;  //	从城堡门外开始
    }

    private void printWelcome() {
        System.out.println();
        System.out.println("欢迎来到城堡！");
        System.out.println("这是一个超级无聊的游戏。");
        System.out.println("如果需要帮助，请输入 'help' 。");
        System.out.println();
        System.out.println("现在你在" + currentRoom);
        System.out.print("出口有：");
        if(currentRoom.northExit != null)
            System.out.print("north ");
        if(currentRoom.eastExit != null)
            System.out.print("east ");
        if(currentRoom.southExit != null)
            System.out.print("south ");
        if(currentRoom.westExit != null)
            System.out.print("west ");
        System.out.println();
    }

    // 以下为用户命令

    private void printHelp() 
    {
        System.out.print("迷路了吗？你可以做的命令有：go bye help");//go bye help隐形的硬编码，每增加一个命令都要改
        System.out.println("如：\tgo east");
    }

    private void goRoom(String direction) 
    {
        oRoom nextRoom = null;
        if(direction.equals("north")) {
            nextRoom = currentRoom.northExit;
        }
        if(direction.equals("east")) {
            nextRoom = currentRoom.eastExit;
        }
        if(direction.equals("south")) {
            nextRoom = currentRoom.southExit;
        }
        if(direction.equals("west")) {
            nextRoom = currentRoom.westExit;
        }

        //经过以上一大串if，如果通过goroom还是没有走到一个房间就会执行nextRoom == null的语句；如果有一个房间，就会判断当前房间有什么出口
        if (nextRoom == null) {
            System.out.println("那里没有门！");
        }
        else {
            currentRoom = nextRoom;
            System.out.println("你在" + currentRoom);
            System.out.print("出口有: ");
            if(currentRoom.northExit != null)
                System.out.print("north ");
            if(currentRoom.eastExit != null)
                System.out.print("east ");
            if(currentRoom.southExit != null)
                System.out.print("south ");
            if(currentRoom.westExit != null)
                System.out.print("west ");
            System.out.println();
        }
    }
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		oGame game = new oGame();
		game.printWelcome();

		//命令解析-->怎么做成框架？字符串对应个什么东西，HashMap可以做，但在这对应到底是函数；但HashMap的Key和Value都必须是对象；但类里面有函数
        while ( true ) {
        		String line = in.nextLine();
        		String[] words = line.split(" ");
        		if ( words[0].equals("help") ) {
        			game.printHelp();
        		} else if (words[0].equals("go") ) {
        			game.goRoom(words[1]);
        		} else if ( words[0].equals("bye") ) {
        			break;
        		}
        }
        
        System.out.println("感谢您的光临。再见！");
        in.close();
	}

}
