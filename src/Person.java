import java.util.Scanner;

public class Person extends Player {// 人玩家

	Scanner input = new Scanner(System.in);

	public String inputName() {// 输入名字，返回名字
		setPlayerName(input.next());
		return getPlayerName();
	}

	public int myFist() {
		int choose = input.nextInt();
		switch (choose) {
		case 1:
			System.out.println("你出拳：剪刀");
			break;
		case 2:
			System.out.println("你出拳：石头");
			break;
		case 3:
			System.out.println("你出拳：布");
			break;
		default:
			break;
		}
		return choose;
	}

	public String ifContinue() {
		return input.next();
	}

}
