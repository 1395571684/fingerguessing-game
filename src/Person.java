import java.util.Scanner;

public class Person extends Player{//人玩家

	Scanner input=new Scanner(System.in);
	String inputName(){//输入名字，返回名字
		System.out.println("请输入你的名字：");
		setPlayerName(input.next());
		return getPlayerName();
		}
	int myFist(){
		int choose=input.nextInt();
		if(choose==1)
		System.out.println("你出拳：剪刀");
		else if(choose==2)
			System.out.println("你出拳：石头");
		else
			System.out.println("你出拳：布");
		return choose;
	}
	
	

}
