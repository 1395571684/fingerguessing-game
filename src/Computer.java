import java.util.Random;
import java.util.Scanner;

public class Computer extends Player {//电脑玩家
Scanner input=new Scanner(System.in);
	String inputName() {//玩家为电脑选择角色
		int choose=input.nextInt();
		switch(choose){
		case 1:
			setPlayerName("刘备");
			break;
		case 2:
			setPlayerName("孙权");
			break;
		case 3:
			setPlayerName("曹操");
			break;
			default:
				break;
		}
		return getPlayerName();
		
	}

	int myFist() {//随机生成选择
		Random r=new Random();
		int choose=r.nextInt(3);
		if(choose==1)
		System.out.println(getPlayerName()+"出拳：剪刀");
		else if(choose==2)
			System.out.println(getPlayerName()+"出拳：石头");
		else
			System.out.println(getPlayerName()+"出拳：布");
		return choose;
		
	}
	

}
